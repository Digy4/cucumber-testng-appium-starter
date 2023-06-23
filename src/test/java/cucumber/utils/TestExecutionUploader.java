package cucumber.utils;

public class TestExecutionUploader {

    public static void main(String[] args) throws Exception {
        if (GetProperties.xRayInteraction.equals("true") &&
                "XRAY".equalsIgnoreCase(GetProperties.testManagementTool)) {
            final JiraInteraction jiraInteraction = new JiraInteraction();
            jiraInteraction.importResults(GetProperties.clientId, GetProperties.clientSecret, GetProperties.xRayUrl,
                    GetProperties.testResultdir);
        }
    }

}
