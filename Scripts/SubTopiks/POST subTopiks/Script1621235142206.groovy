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

String randomBannerName = 'Sub Topiks Test ' + CustomKeywords.'keyword.RandomGenerator.randomString'(30)

HashMap<String, Object> subTopiks = new HashMap<String, Object>()

subTopiks.put('id', '0')
subTopiks.put('name', randomBannerName)
subTopiks.put('status', '0')
subTopiks.put('createdOn', '2021-05-11T02:38:44.744Z')
subTopiks.put('createdBy', randomBannerName)
subTopiks.put('modifiedOn', '2021-05-11T02:38:44.744Z')
subTopiks.put('modifiedBy', randomBannerName)
subTopiks.put('topikId', '0')

HashMap<String, Object> Topiks = new HashMap<String, Object>()

Topiks.put('id', '0')
Topiks.put('name', randomBannerName)
Topiks.put('status', '0')
Topiks.put('createdOn', '2021-05-11T02:38:44.744Z')
Topiks.put('createdBy', randomBannerName)
Topiks.put('modifiedOn', '2021-05-11T02:38:44.744Z')
Topiks.put('modifiedBy', randomBannerName)

List<Map<String,String>> TopiksList = new ArrayList <Map<String,String>> ();

TopiksList.add(Topiks)

subTopiks.put('Topiks', TopiksList)

print(subTopiks)

response = CustomKeywords.'keyword.API.Post' ('api/SubTopiks/', subTopiks)

WS.verifyElementPropertyValue(response, 'name', randomBannerName)

WS.verifyResponseStatusCode(response, 201)