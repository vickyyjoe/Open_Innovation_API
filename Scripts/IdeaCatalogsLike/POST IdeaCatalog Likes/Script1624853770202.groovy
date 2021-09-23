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

String randomBannerName = 'Like Test ' + CustomKeywords.'keyword.RandomGenerator.randomString'(30)

HashMap<String, Object> Like = new HashMap<String, Object>()

Like.put('id', '0')
Like.put('status', '0')
Like.put('createdOn', '2021-05-11T02:38:44.744Z')
Like.put('modifiedOn', '2021-05-11T02:38:44.744Z')
Like.put('createdBy', randomBannerName)
Like.put('createdName', randomBannerName)
Like.put('modifiedBy', randomBannerName)
Like.put('modifiedName', randomBannerName)
Like.put('ideaCatalogId', '0')

String randomBannerName1 = 'IdeaCatalog Test ' + CustomKeywords.'keyword.RandomGenerator.randomString'(30)
HashMap<String, Object> IdeaCatalog = new HashMap<String, Object>()

IdeaCatalog.put('id', '0')
IdeaCatalog.put('status', '0')
IdeaCatalog.put('createdOn', '2021-05-11T02:38:44.744Z')
IdeaCatalog.put('modifiedOn', '2021-05-11T02:38:44.744Z')
IdeaCatalog.put('createdBy', randomBannerName1)
IdeaCatalog.put('createdName', randomBannerName1)
IdeaCatalog.put('modifiedBy', randomBannerName1)
IdeaCatalog.put('modifiedName', randomBannerName1)
IdeaCatalog.put('topikId', '0')

String randomBannerName2 = 'topik Test ' + CustomKeywords.'keyword.RandomGenerator.randomString'(30)
HashMap<String, Object> topik = new HashMap<String, Object>()

topik.put('id', '0')
topik.put('status', '0')
topik.put('createdOn', '2021-05-11T02:38:44.744Z')
topik.put('modifiedOn', '2021-05-11T02:38:44.744Z')
topik.put('createdBy', randomBannerName2)
topik.put('createdName', randomBannerName2)
topik.put('modifiedBy', randomBannerName2)
topik.put('modifiedName', randomBannerName2)
topik.put('name', randomBannerName2)
topik.put('topikId', '0')

String randomBannerName3 = 'subtopik Test ' + CustomKeywords.'keyword.RandomGenerator.randomString'(30)
HashMap<String, Object> subTopiks = new HashMap<String, Object>()

subTopiks.put('id', '0')
subTopiks.put('status', '0')
subTopiks.put('createdOn', '2021-05-11T02:38:44.744Z')
subTopiks.put('modifiedOn', '2021-05-11T02:38:44.744Z')
subTopiks.put('createdBy', randomBannerName3)
subTopiks.put('createdName', randomBannerName3)
subTopiks.put('modifiedBy', randomBannerName3)
subTopiks.put('modifiedName', randomBannerName3)
subTopiks.put('name', randomBannerName3)
subTopiks.put('topikId', '0')

List<Map<String,String>> subTopiksList = new ArrayList <Map<String,String>> ();

subTopiksList.add(subTopiks)
topik.put('subTopiks', subTopiksList)
print(topik)





