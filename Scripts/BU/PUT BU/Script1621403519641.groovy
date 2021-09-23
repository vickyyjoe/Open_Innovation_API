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
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testobject.RequestObject as RequestObject
import com.kms.katalon.core.testobject.RestRequestObjectBuilder as RestRequestObjectBuilder
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.testobject.TestObjectProperty as TestObjectProperty
import com.kms.katalon.core.testobject.UrlEncodedBodyParameter as UrlEncodedBodyParameter
import com.kms.katalon.core.testobject.impl.HttpTextBodyContent as HttpTextBodyContent
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import groovy.json.JsonSlurper as JsonSlurper
import internal.GlobalVariable as GlobalVariable
import keyword.RandomGenerator as RandomGenerator
import org.json.JSONObject as JSONObject
import org.openqa.selenium.Keys as Keys

String randomBannerName = 'BU code ' + CustomKeywords.'keyword.RandomGenerator.randomString'(30)
String randomBannerName2 = 'BU name2 ' + CustomKeywords.'keyword.RandomGenerator.randomString'(30)
String randomBannerName3 = 'BU TEST2 ' + CustomKeywords.'keyword.RandomGenerator.randomString'(30)
String randomBannerName4 = 'BU ID ' + CustomKeywords.'keyword.RandomGenerator.randomString'(30)

HashMap<String, Object> BU = new HashMap<String, Object>()
BU.put('Id',  GlobalVariable.buId)
BU.put('sbuId',  GlobalVariable.ApiID)
BU.put('sbuCode', GlobalVariable.sbuCode)
BU.put('sbuName', GlobalVariable.sbuName)
BU.put('code', randomBannerName)
BU.put('name', randomBannerName2)
print(BU)

response = CustomKeywords.'keyword.APIport8241.Put' ('api/BU/', BU)
WS.verifyResponseStatusCode(response, 204)