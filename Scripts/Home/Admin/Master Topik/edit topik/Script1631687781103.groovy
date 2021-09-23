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

WebUI.setText(findTestObject('Create Ideas/input_Email'), GlobalVariable.accMaster)

WebUI.setText(findTestObject('Create Ideas/input_Password'), GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/Create Ideas/button_Login'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Create Ideas/h1_Kalbe Idea Platform'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Admin/Master TOpik/button_Admin'))

WebUI.click(findTestObject('Admin/Master TOpik/button_Master topik'))

WebUI.verifyElementVisible(findTestObject('Admin/Master TOpik/h3_Master Topik'))

WebUI.scrollToElement(findTestObject('Admin/Master TOpik/div_NextpageTopik'), 0)

WebUI.click(findTestObject('Admin/Master TOpik/div_NextpageTopik'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Admin/Master TOpik/edit dan delete topik/Btn_ActionTopik'))

WebUI.click(findTestObject('Admin/Master TOpik/edit dan delete topik/button_Edit'))

WebUI.setText(findTestObject('Admin/Master TOpik/edit dan delete topik/input_TopikEdit'), 'Business  & Finance')

WebUI.click(findTestObject('Admin/Master TOpik/edit dan delete topik/button_Accept'))

WebUI.verifyElementVisible(findTestObject('Admin/Master TOpik/h3_Master Topik'))

WebUI.scrollToElement(findTestObject('Admin/Master TOpik/div_NextpageTopik'), 0)

WebUI.click(findTestObject('Admin/Master TOpik/div_NextpageTopik'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Admin/Master TOpik/td_Business'), 'Business & Finance')

WebUI.delay(3)

WebUI.closeBrowser()

