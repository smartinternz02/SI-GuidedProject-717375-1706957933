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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.setText(findTestObject('Object Repository/OR_OrangeHRM_001/Page_OrangeHRM/input_Username_username'), username)

WebUI.setText(findTestObject('Object Repository/OR_OrangeHRM_001/Page_OrangeHRM/input_Password_password'), password)

WebUI.click(findTestObject('Object Repository/OR_OrangeHRM_001/Page_OrangeHRM/button_Login'))

WebUI.click(findTestObject('OR_OrangeHRM_003/Page_OrangeHRM/a_Leave'))

WebUI.click(findTestObject('OR_OrangeHRM_003/Page_OrangeHRM/input_From Date_oxd-input oxd-input--focus'))

WebUI.click(findTestObject('OR_OrangeHRM_003/Page_OrangeHRM/div_Today'))

WebUI.click(findTestObject('OR_OrangeHRM_003/Page_OrangeHRM/input_To Date_oxd-input oxd-input--focus'))

WebUI.click(findTestObject('OR_OrangeHRM_003/Page_OrangeHRM/div_Today'))

WebUI.click(findTestObject('OR_OrangeHRM_003/Page_OrangeHRM/i_Pending Approval_oxd-icon bi-x --clear'))

WebUI.click(findTestObject('OR_OrangeHRM_003/Page_OrangeHRM/div_Select'))

WebUI.click(findTestObject('OR_OrangeHRM_003/Page_OrangeHRM/div_Scheduled'))

WebUI.click(findTestObject('OR_OrangeHRM_003/Page_OrangeHRM/button_Search'))

WebUI.delay(5)

