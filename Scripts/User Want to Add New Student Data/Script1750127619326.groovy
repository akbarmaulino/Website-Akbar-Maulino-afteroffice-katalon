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
import com.kms.katalon.core.testobject.ConditionType as ConditionType

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Homepage/menu_Forms'))

WebUI.click(findTestObject('Sidebar List Menu/Form/Sidebar_Form'))

WebUI.setText(findTestObject('Object Repository/FormPage/field_FirstName'), GlobalVariable.FirstName)

WebUI.setText(findTestObject('Object Repository/FormPage/field_LastName'), GlobalVariable.LastName)

WebUI.setText(findTestObject('Object Repository/FormPage/field_Email'), GlobalVariable.Email)

WebUI.click(findTestObject('Object Repository/FormPage/label_Male'))

WebUI.setText(findTestObject('Object Repository/FormPage/field_MobileNumber'), '1234567891')

WebUI.click(findTestObject('FormPage/field_DateofBirth'))

WebUI.click(findTestObject('FormPage/field_Month'))

WebUI.selectOptionByValue(findTestObject('FormPage/field_Month'), '1', false)

WebUI.click(findTestObject('FormPage/field_Year'))

WebUI.selectOptionByValue(findTestObject('FormPage/field_Year'), '2001', false)

String tanggal = '8'

WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//div[contains(@class, 'react-datepicker__day') and text()='$tanggal']"))

WebUI.setText(findTestObject('Object Repository/FormPage/field_Subjects'), 'Physics')

WebUI.sendKeys(findTestObject('Object Repository/FormPage/field_Subjects'), Keys.chord(Keys.ENTER), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('FormPage/label_Sports'), 0)

WebUI.click(findTestObject('Object Repository/FormPage/label_Sports'))

WebUI.click(findTestObject('Object Repository/FormPage/label_Reading'))

WebUI.click(findTestObject('Object Repository/FormPage/label_Music'))

String filePath = System.getProperty('user.dir') + '/Include/Image/Screenshot_2.png'

WebUI.uploadFile(findTestObject('FormPage/upload_Picture'), filePath)

WebUI.setText(findTestObject('Object Repository/FormPage/field_CurrentAddress'), 'Jakarta Selatan Kebayoran Baru')

WebUI.click(findTestObject('FormPage/field_SelectState'))

WebUI.setText(findTestObject('FormPage/field_State'), 'NCR')

WebUI.sendKeys(findTestObject('FormPage/field_State'), Keys.chord(Keys.ENTER), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('FormPage/field_SelectCity'))

WebUI.setText(findTestObject('FormPage/field_City'), 'Delhi')

WebUI.sendKeys(findTestObject('FormPage/field_City'), Keys.chord(Keys.ENTER), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('FormPage/button_Submit'))

WebUI.verifyElementPresent(findTestObject('Object Repository/FormPage/verify_SuccessSubmitForm'), 0)

WebUI.click(findTestObject('FormPage/button_Close'))

WebUI.closeBrowser()

