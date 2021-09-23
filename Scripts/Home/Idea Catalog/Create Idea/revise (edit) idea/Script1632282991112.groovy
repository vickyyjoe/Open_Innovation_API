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

WebUI.openBrowser(GlobalVariable.staging)

WebUI.setText(findTestObject('Create Ideas/input_Email'), GlobalVariable.accountDummy)

WebUI.setText(findTestObject('Create Ideas/input_Password'), GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/Create Ideas/button_Login'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Create Ideas/h1_Kalbe Idea Platform'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Object Repository/edit idea/p_Hi, User Two'))

WebUI.click(findTestObject('Object Repository/edit idea/button_Ideas'))

WebUI.click(findTestObject('Home/My Ideas/div_MyIdea'))

WebUI.verifyElementVisible(findTestObject('Object Repository/edit idea/div_DeleteEdit'))

WebUI.click(findTestObject('Object Repository/edit idea/button_Edit'))

WebUI.mouseOver(findTestObject('Object Repository/edit idea/label_Title'))

WebUI.waitForElementVisible(findTestObject('edit idea/input_Title'), 2)

WebUI.click(findTestObject('edit idea/input_Title'), FailureHandling.STOP_ON_FAILURE)

WebUI.clearText(findTestObject('edit idea/input_Title'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('edit idea/input_Title'), 'Revise')

