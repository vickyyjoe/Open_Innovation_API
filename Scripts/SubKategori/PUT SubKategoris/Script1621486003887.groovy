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

String randomBannerName = 'sub Kategoris Test ' + CustomKeywords.'keyword.RandomGenerator.randomString'(30)

HashMap<String, Object> subKategoris = new HashMap<String, Object>()
subKategoris.put('id', '0')
subKategoris.put('name', randomBannerName)
subKategoris.put('status', '0')
subKategoris.put('createdOn', '2021-05-11T02:38:44.744Z')
subKategoris.put('createdBy', randomBannerName)
subKategoris.put('modifiedOn', '2021-05-11T02:38:44.744Z')
subKategoris.put('modifiedBy', randomBannerName)
subKategoris.put('kategoriId', '0')

HashMap<String, Object> kategori = new HashMap<String, Object>()
kategori.put('id', '0')
kategori.put('name', randomBannerName)
kategori.put('status', '0')
kategori.put('createdOn', '2021-05-11T02:38:44.744Z')
kategori.put('createdBy', randomBannerName)
kategori.put('modifiedOn', '2021-05-11T02:38:44.744Z')
kategori.put('modifiedBy', randomBannerName)

HashMap<String, Object> subKategoris2 = new HashMap<String, Object>()
//subMenu2.put(null,null)

List<Map<String,String>> subKategorisList = new ArrayList <Map<String,String>> ();

subKategorisList.add(subKategoris2)
kategori.put('subKategoris', subKategorisList)
subKategoris.put('kategori', kategori)
print(subKategoris)

response = CustomKeywords.'keyword.API.Post' ('api/SubKategoris/', subKategoris)

WS.verifyElementPropertyValue(response, 'name', randomBannerName)
WS.verifyResponseStatusCode(response, 201)