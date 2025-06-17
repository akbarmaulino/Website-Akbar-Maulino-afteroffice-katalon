import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.github.fge.jsonschema.library.Keyword as Keyword
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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Homepage/menu_Elements'))

WebUI.click(findTestObject('Object Repository/Sidebar List Menu/Element/Sidebar_Web Tables'))

WebUI.setText(findTestObject('ElementPage/Web Tables Page/field_Search'), GlobalVariable.NameDefault)

def dataMap = [('FirstName') : GlobalVariable.NameDefault]

dataMap.each({ def key, def expectedValue ->
        TestObject Value = findTestObject('ElementPage/Web Tables Page/verify_Data', [('Value') : expectedValue])

        String actualValue = WebUI.getText(Value)

        if (actualValue == expectedValue) {
            KeywordUtil.markPassed('Berhasil Melakukan Pencarian')
        } else {
            KeywordUtil.markFailed('Gagal Melakukan Pencarian')
        }
    })

WebUI.closeBrowser()

