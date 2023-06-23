package cucumber.utils;

import io.restassured.RestAssured;
import io.restassured.config.RestAssuredConfig;
import io.restassured.config.SSLConfig;
import io.restassured.response.Response;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class JiraInteraction {

    public void exportTests(String clientId, String clientSecret, String jiraUrl, String jiraExecutionId,
                            String featureFileDir)  throws Exception {
      final String auth = getAuth(clientId, clientSecret, jiraUrl);
      String url = jiraUrl+"/api/v2/export/cucumber?keys="+jiraExecutionId;
      downloadUsingStream(url, auth, featureFileDir);
    }

    public void importResults(String clientId, String clientSecret, String jiraUrl,
                              String testResultdir) throws Exception {
        final String auth = getAuth(clientId, clientSecret, jiraUrl);
        final String uploadFiledir = System.getProperty("user.dir")+"/"+testResultdir;
        System.out.println("################################# uploading file"+uploadFiledir);
        final org.json.simple.parser.JSONParser parser = new JSONParser();
        final Object jsonBody = parser.parse(new FileReader(uploadFiledir));
        System.out.println(jsonBody);
        final JSONArray obj = (org.json.simple.JSONArray) jsonBody;
        final String json = obj.toString();
        try {
            final Response response = RestAssured.given().config(RestAssuredConfig.config().sslConfig(SSLConfig.sslConfig().allowAllHostnames()))
                    .relaxedHTTPSValidation().contentType("application/json").header("Authorization", "Bearer " + auth)
                    .body(json).expect().statusCode(200)
                    .when()
                    .post(jiraUrl + "/api/v2/import/execution/cucumber").then().extract().response();
            System.out.println("#################"+ response.asString());
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private String getAuth(String clientId, String clientSecret, String jiraUrl) throws Exception {
        final org.json.simple.parser.JSONParser parser = new JSONParser();
        final Object jsonBody = parser.parse("{ \"client_id\": \"" + clientId + "\",\"client_secret\": \"" + clientSecret + "\" }");
        System.out.println(jsonBody);
        final org.json.simple.JSONObject obj = (org.json.simple.JSONObject) jsonBody;
        final String json = obj.toString();
        final Response response = RestAssured.given().config(RestAssuredConfig.config().sslConfig(SSLConfig.sslConfig().allowAllHostnames()))
                .relaxedHTTPSValidation().contentType("application/json")
                .body(json).expect().statusCode(200)
                .when()
                .post(jiraUrl + "/api/v2/authenticate").then().extract().response();
        final String responseString = response.asString();
        System.out.println("Response string: " + responseString);
        if (responseString != null && responseString.length() > 5) {
            System.out.println("Response string trimmed: " + responseString.substring(1, responseString.length() - 1));
            return responseString.substring(1, responseString.length() - 1);
        }
        return "";
    }

    private static void downloadUsingStream(String urlStr, String auth, String file) throws Exception {
        String featureFile;
        String filePath;
        String currentDir = System.getProperty("user.dir");
        System.out.println(currentDir);
        String fileFormat = GetProperties.downloadFileFormat;
        filePath = currentDir+"/"+file;
        createFoldersIfRequired(filePath);
        if(fileFormat.equals("zip")){
            featureFile = filePath+"/" + "feature.zip";
        }else{
            featureFile=filePath+"/"+ "test.feature";
        }

        URL url = new URL(urlStr);
        URLConnection urlConnection = url.openConnection();
        urlConnection.setRequestProperty("Authorization","Bearer "+auth);
        InputStream inputStream = urlConnection.getInputStream();
        OutputStream outputStream = new FileOutputStream(featureFile);
        byte[] b = new byte[2048];
        int length;

        while ((length = inputStream.read(b)) != -1) {
            outputStream.write(b, 0, length);
        }

        inputStream.close();
        outputStream.close();
        if(fileFormat.equals("zip")){
            UnzipFile unzipFile = new UnzipFile();
            unzipFile.unzipFunction(filePath,featureFile);
        }
    }

    private static void createFoldersIfRequired(String path) {
        final File folder = new File(path);
        folder.mkdirs();
    }

}
