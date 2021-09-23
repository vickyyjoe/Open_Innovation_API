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
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.WebDriver as WebDriver
import org.testng.Assert as Assert
import com.kms.katalon.core.annotation.Keyword as Keyword
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.openBrowser(GlobalVariable.staging)

WebUI.setText(findTestObject('Create Ideas/input_Email'), GlobalVariable.accountDummy)

WebUI.setText(findTestObject('Create Ideas/input_Password'), GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/Create Ideas/button_Login'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Create Ideas/h1_Kalbe Idea Platform'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Create Ideas/button_Submit Ideas'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Create Ideas/h1_Submit Idea'))

WebUI.mouseOver(findTestObject('Object Repository/Create Ideas/h1_Submit Idea'))

CustomKeywords.'com.test.uploadFile.testclass.uploadFile'(findTestObject('Create Ideas/label_Cover Image'), 'C:\\Users\\User\\Downloads\\bb.jpg')

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Object Repository/Create Ideas/label_Title'), 0)

WebUI.setText(findTestObject('Create Ideas/input_Title'), 'create idea (automated)')

WebUI.selectOptionByValue(findTestObject('Create Ideas/select_Topic'), 'Other', true)

WebUI.setText(findTestObject('Create Ideas/input_New Topic'), 'Test 1')

WebUI.selectOptionByValue(findTestObject('Create Ideas/select_Sub Topic_Other'), 'Other', true)

WebUI.setText(findTestObject('Create Ideas/input_New Sub Topic'), 'test 3`')

WebUI.scrollToElement(findTestObject('Object Repository/Create Ideas/label_New Sub Topic'), 0)

WebUI.setText(findTestObject('Create Ideas/folder_iframe/pDescriptionIdea'), '  Test 123')

WebUI.uploadFile(findTestObject('Create Ideas/input_attach_fileNew'), 'C:\\\\Users\\\\User\\\\Downloads\\\\bb.jpg')

WebUI.uploadFile(findTestObject('Create Ideas/input_attach_fileNew'), 'D:\\\\automation data.xlsx')

//CustomKeywords.'com.test.uploadFile.testclass.uploadFile'(findTestObject('Create Ideas/input_attach_fileNew'), 'C:\\Users\\User\\Downloads\\bb.jpg')
//CustomKeywords.'com.test.uploadFile.testclass.uploadFile'(findTestObject(''), )
WebUI.click(findTestObject('Object Repository/Create Ideas/input_Team_typeof'))

WebUI.scrollToElement(findTestObject('Object Repository/Create Ideas/label_Team Name'), 0)

WebUI.setText(findTestObject('Create Ideas/input_Team Name'), 'test team')

WebUI.click(findTestObject('Create Ideas/input_Team Member'))

WebUI.setText(findTestObject('Create Ideas/input_Team Member'), 'Edwin')

WebUI.scrollToElement(findTestObject('Create Ideas/team member/li_EDWIN SIMJAYA'), 0)

WebUI.click(findTestObject('Create Ideas/team member/li_EDWIN SIMJAYA'))

WebUI.setText(findTestObject('Create Ideas/input_Team Member'), 'amir')

WebUI.scrollToElement(findTestObject('Create Ideas/team member/li_MOHAMMAD FAIZAL AMIRRUDIN'), 0)

WebUI.click(findTestObject('Create Ideas/team member/li_MOHAMMAD FAIZAL AMIRRUDIN'))

WebUI.scrollToElement(findTestObject('Object Repository/Create Ideas/label_Team Name'), 2)

WebUI.setText(findTestObject('Create Ideas/input_Team Member'), 'johan')

WebUI.scrollToElement(findTestObject('Create Ideas/team member/li_JOHAN DARIUS KURNIAWIDJAJA'), 0)

WebUI.click(findTestObject('Create Ideas/team member/li_JOHAN DARIUS KURNIAWIDJAJA'))

WebUI.setText(findTestObject('Create Ideas/input_Hastag'), 'tes')

WebUI.click(findTestObject('Object Repository/Create Ideas/li_cobaTestHashtag'))

WebUI.click(findTestObject('Create Ideas/button_Submit IdeaFinal'))

WebUI.waitForElementVisible(findTestObject('Create Ideas/div_My Ideas'), 3)

WebUI.verifyElementVisible(findTestObject('Create Ideas/div_My Ideas'))

WebUI.click(findTestObject('Home/My Ideas/NewIdea'))

WebUI.waitForElementVisible(findTestObject('Home/My Ideas/h1_create idea (automated)'), 0)

WebUI.verifyElementText(findTestObject('Home/My Ideas/h1_create idea (automated)'), 'create idea (automated)')

WebUI.delay(2)

WebUI.closeBrowser()

