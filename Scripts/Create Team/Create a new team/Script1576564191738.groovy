import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('https://mattermost-apcs.herokuapp.com/login', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_Mattermost/input_All team communication in one place searchable and accessible anywhere_loginId'), 
    'binhquoc999@gmail.com')

WebUI.setText(findTestObject('Page_Mattermost/input_All team communication in one place searchable and accessible anywhere_password'), 
    '123456')

WebUI.click(findTestObject('Page_Mattermost/span_Sign in'))

WebUI.click(findTestObject('Select_team/span_Create a new team'))

WebUI.setText(findTestObject('Create_team display_name/input_Team Name_teamNameInput'), 'APCS')

WebUI.click(findTestObject('Create_team display_name/span_Next'))

