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

String randomBannerName = 'Judges name ' + CustomKeywords.'keyword.RandomGenerator.randomString'(30)


HashMap<String, Object> ConventionProjectResultTypes = new HashMap<String, Object>()
HashMap<String, Object> conventionProject = new HashMap<String, Object>()

ConventionProjectResultTypes.put('Id', GlobalVariable.ApiID)
ConventionProjectResultTypes.put('status', 1)
ConventionProjectResultTypes.put('createdOn', '2021-09-22T04:25:43.608Z')
ConventionProjectResultTypes.put('modifiedOn', '2021-09-22T04:25:43.608Z')
ConventionProjectResultTypes.put('createdBy', GlobalVariable.createdBy)
ConventionProjectResultTypes.put('createdName', GlobalVariable.createdName)
ConventionProjectResultTypes.put('modifiedBy', GlobalVariable.modifiedBy)
ConventionProjectResultTypes.put('modifiedName', GlobalVariable.modifiedName)
ConventionProjectResultTypes.put('description', randomBannerName)
ConventionProjectResultTypes.put('fileId', 0)
ConventionProjectResultTypes.put('filePath', randomBannerName)
ConventionProjectResultTypes.put('fileOriginalName', randomBannerName)
ConventionProjectResultTypes.put('conventionProjectId', true)
ConventionProjectResultTypes.put ('conventionProject', conventionProject)
print(ConventionProjectResultTypes)


response = CustomKeywords.'keyword.API.Put' ('api/ConventionProjectResultTypes/', ConventionProjectResultTypes)

WS.verifyResponseStatusCode(response, 204)