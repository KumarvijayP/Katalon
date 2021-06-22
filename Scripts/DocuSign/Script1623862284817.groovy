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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://bernstein.qa.acml.com/')

WebUI.click(findTestObject('Object Repository/Page_Home  Bernstein/a_Login'))

WebUI.click(findTestObject('Object Repository/Page_Login - Bernstein/input_cookie policy_gdprYes'))

WebUI.setText(findTestObject('Object Repository/Page_Login - Bernstein/input_Username_userName'), 'vijay1234')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login - Bernstein/input_Password_password'), 'cm7vkRLwmEw0RAdQr0AxsA==')

WebUI.click(findTestObject('Object Repository/Page_Login - Bernstein/input_Password_pwd-show'))

WebUI.click(findTestObject('Object Repository/Page_Login - Bernstein/input_Password_btn-dkblue action'))

WebUI.click(findTestObject('Object Repository/Page_Relationship Summary - Bernstein/a_Documents'))

WebUI.click(findTestObject('Object Repository/Page_Docs To Sign - Bernstein/a_DocuSign Test 1 - Katlon - Jun 16 2021'))

WebUI.click(findTestObject('Object Repository/Page_Docs To Sign - Bernstein/a_Next'))

WebUI.switchToWindowTitle('Review and sign document(s) | DocuSign')

WebUI.click(findTestObject('Object Repository/Page_Review and sign document(s)  DocuSign/button_Other Actions'))

WebUI.click(findTestObject('Object Repository/Page_Review and sign document(s)  DocuSign/button_Continue'))

WebUI.click(findTestObject('Object Repository/Page_Review and sign document(s)  DocuSign/span_Start'))

WebUI.click(findTestObject('Object Repository/Page_Review and sign document(s)  DocuSign/button_Other Actions'))

WebUI.click(findTestObject('Object Repository/Page_Review and sign document(s)  DocuSign/button_Finish Later'))

WebUI.switchToWindowTitle('Docs To Sign - Bernstein')

WebUI.click(findTestObject('Object Repository/Page_Docs To Sign - Bernstein/a_Logout'))

WebUI.closeBrowser()

