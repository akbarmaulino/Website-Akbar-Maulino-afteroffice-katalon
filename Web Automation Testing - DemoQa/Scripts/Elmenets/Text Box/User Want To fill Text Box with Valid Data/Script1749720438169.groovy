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

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Homepage/menu_Elements'))

WebUI.click(findTestObject('ElementPage/Sidebar_Text Box'))

WebUI.setText(findTestObject('TextBox Menu/field_FullName'), GlobalVariable.FullName)

WebUI.setText(findTestObject('TextBox Menu/field_Email'), GlobalVariable.Email)

WebUI.setText(findTestObject('TextBox Menu/field_CurrentAdress'), GlobalVariable.CurrentAddress)

WebUI.setText(findTestObject('TextBox Menu/field_PermanentAddress'), GlobalVariable.PermanentAddress)

WebUI.scrollToElement(findTestObject('TextBox Menu/button_submit'), 0)

WebUI.click(findTestObject('TextBox Menu/button_submit'))

WebUI.verifyElementText(findTestObject('TextBox Menu/verify_Name'), 'Name:' + GlobalVariable.FullName)

WebUI.verifyElementText(findTestObject('TextBox Menu/verify_Email'), 'Email:' + GlobalVariable.Email)

WebUI.verifyElementText(findTestObject('TextBox Menu/verify_CurrentAddres'), 'Current Address :' + GlobalVariable.CurrentAddress)

WebUI.verifyElementText(findTestObject('TextBox Menu/verify_PermanentAddress'), 'Permananet Address :' + GlobalVariable.PermanentAddress)

WebUI.closeBrowser()

