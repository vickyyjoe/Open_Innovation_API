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

WebUI.openBrowser(GlobalVariable.local)

WebUI.setText(findTestObject('Login/input_Email'), GlobalVariable.accountDummy)

WebUI.setText(findTestObject('Login/input_Password'), GlobalVariable.password)

WebUI.click(findTestObject('Login/button_Login'))

WebUI.verifyElementVisible(findTestObject('null'))

WebUI.click(findTestObject('Object Repository/Home/profile/button_Hi, User Two'))

WebUI.click(findTestObject('Object Repository/Home/profile/button_Ideas'))

WebUI.click(findTestObject('Object Repository/Home/profile/button_Edit Profile'))

WebUI.verifyElementVisible(findTestObject('Page_/h1_Edit Profile'), FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('null'))

WebUI.selectOptionByValue(findTestObject('null'), 
    'Only friends can view my post', true)

WebUI.click(findTestObject('null'))

WebUI.delay(3)

WebUI.closeBrowser()

