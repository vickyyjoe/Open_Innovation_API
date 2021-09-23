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

String randomBannerName = 'groupUsers Test ' + CustomKeywords.'keyword.RandomGenerator.randomString'(30)

HashMap<String, Object> groupUsers = new HashMap<String, Object>()

groupUsers.put('id', '0')
groupUsers.put('upn', randomBannerName)
groupUsers.put('name', randomBannerName)
groupUsers.put('email', randomBannerName)
groupUsers.put('year', '0')
groupUsers.put('type', '0')
groupUsers.put('role', '0')
groupUsers.put('wildcard', randomBannerName)
groupUsers.put('status', '0')
groupUsers.put('createdOn', '2021-05-11T02:38:44.744Z')
groupUsers.put('createdBy', randomBannerName)
groupUsers.put('modifiedOn', '2021-05-11T02:38:44.744Z')
groupUsers.put('modifiedBy', randomBannerName)


HashMap<String, Object> groupUserSBUs = new HashMap<String, Object>()

groupUserSBUs.put('id', '0')
groupUserSBUs.put('sbuId', randomBannerName)
groupUserSBUs.put('name', randomBannerName)
groupUserSBUs.put('status', '0')
groupUserSBUs.put('createdOn', '2021-05-11T02:38:44.744Z')
groupUserSBUs.put('createdBy', randomBannerName)
groupUserSBUs.put('modifiedOn', '2021-05-11T02:38:44.744Z')
groupUserSBUs.put('modifiedBy', randomBannerName)
groupUserSBUs.put('groupUserId', '0')

List<Map<String,String>> groupUserSBUslist = new ArrayList <Map<String,String>> ();

groupUserSBUslist.add(groupUserSBUs)
groupUsers.put('groupUserSBUs', groupUserSBUslist)
print(groupUsers)

HashMap<String, Object> groupUserBUs = new HashMap<String, Object>()

groupUserBUs.put('id', '0')
groupUserBUs.put('sbuId', randomBannerName)
groupUserBUs.put('sbuName', randomBannerName)
groupUserBUs.put('buId', randomBannerName)
groupUserBUs.put('buName', randomBannerName)
groupUserBUs.put('status', '0')
groupUserBUs.put('createdOn', '2021-05-11T02:38:44.744Z')
groupUserBUs.put('createdBy', randomBannerName)
groupUserBUs.put('modifiedOn', '2021-05-11T02:38:44.744Z')
groupUserBUs.put('modifiedBy', randomBannerName)
groupUserBUs.put('groupUserId', '0')

List<Map<String,String>> groupUserBUslist = new ArrayList <Map<String,String>> ();
groupUserBUslist.add(groupUserBUs)
groupUsers.put('groupUserSBUs', groupUserSBUslist)
print(groupUsers)
HashMap<String, Object> groupUserKategoris = new HashMap<String, Object>()

groupUserKategoris.put('id', '0')
groupUserKategoris.put('status', '0')
groupUserKategoris.put('createdOn', '2021-05-11T02:38:44.744Z')
groupUserKategoris.put('createdBy', randomBannerName)
groupUserKategoris.put('modifiedOn', '2021-05-11T02:38:44.744Z')
groupUserKategoris.put('modifiedBy', randomBannerName)
groupUserKategoris.put('groupUserId', '0')
groupUserKategoris.put('kategoriId', '0')
groupUserKategoris.put('subKategoriId', '0')
groupUserKategoris.put('sbuId', randomBannerName)
groupUserKategoris.put('sbuName', randomBannerName)
groupUserKategoris.put('buId', randomBannerName)
groupUserKategoris.put('buName', randomBannerName)
groupUserKategoris.put('status', '0')

HashMap<String, Object> kategori = new HashMap<String, Object>()

kategori.put('id', '0')
kategori.put('name', randomBannerName)
kategori.put('status', '0')
kategori.put('createdOn', '2021-05-11T02:38:44.744Z')
kategori.put('createdBy', randomBannerName)
kategori.put('modifiedOn', '2021-05-11T02:38:44.744Z')
kategori.put('modifiedBy', randomBannerName)

HashMap<String, Object> subKategoris = new HashMap<String, Object>()

subKategoris.put('id', '0')
subKategoris.put('name', randomBannerName)
subKategoris.put('status', '0')
subKategoris.put('createdOn', '2021-05-11T02:38:44.744Z')
subKategoris.put('createdBy', randomBannerName)
subKategoris.put('modifiedOn', '2021-05-11T02:38:44.744Z')
subKategoris.put('modifiedBy', randomBannerName)
subKategoris.put('kategoriId', '0')

List<Map<String,String>> subKategorisList = new ArrayList <Map<String,String>> ();

subKategorisList.add(subKategoris)
kategori.put('subKategoris', subKategorisList)
groupUserKategoris.put('kategori', kategori)
print(groupUserKategoris)

HashMap<String, Object> subKategori = new HashMap<String, Object>()

subKategori.put('id', '0')
subKategori.put('name', randomBannerName)
subKategori.put('status', '0')
subKategori.put('createdOn', '2021-05-11T02:38:44.744Z')
subKategori.put('createdBy', randomBannerName)
subKategori.put('modifiedOn', '2021-05-11T02:38:44.744Z')
subKategori.put('modifiedBy', randomBannerName)
subKategori.put('kategoriId', '0')

response = CustomKeywords.'keyword.API.Post' ('/api/GroupUsers', groupUsers)

WS.verifyElementPropertyValue(response, 'upn', randomBannerName)
WS.verifyResponseStatusCode(response, 201)