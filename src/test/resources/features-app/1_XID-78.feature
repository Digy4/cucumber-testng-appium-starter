Feature: eBay Android app sanity test case

	Background:


	#Automate sanity case of eBay Android App
	@TEST_XID-78 @Android
	Scenario Outline: eBay Android app sanity test case
		Given user clicks on cross icon
		And user clicks on selling
		And again user clicks on deal
		And again user clicks on fashion
		And user clicks on search
		And user enters <search_text>
		And user clicks on search icon
		And user clicks on the save modal
		And user selects sort options
		And now user clicks on filter icon
		And user clicks on condition
		And user clicks on show result button
		And now user clicks on deals
		And now user selects feture deals from deals screen
		And now user opens hamburger menu
		And user clicks on sellings option
		Examples:
		|search_text|
		|cars       |
