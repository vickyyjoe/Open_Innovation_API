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

String randomBannerName = 'sub Menu Test ' + CustomKeywords.'keyword.RandomGenerator.randomString'(30)

HashMap<String, Object> subMenu = new HashMap<String, Object>()
subMenu.put('id', '0')
subMenu.put('name', randomBannerName)
subMenu.put('link', randomBannerName)
subMenu.put('accessLevel', '0')
subMenu.put('status', '0')
subMenu.put('createdOn', '2021-05-11T02:38:44.744Z')
subMenu.put('createdBy', randomBannerName)
subMenu.put('modifiedOn', '2021-05-11T02:38:44.744Z')
subMenu.put('modifiedBy', randomBannerName)
subMenu.put('menuId', '0')

HashMap<String, Object> Menu = new HashMap<String, Object>()
Menu.put('id', '0')
Menu.put('name', randomBannerName)
Menu.put('link', randomBannerName)
Menu.put('accessLevel', '0')
Menu.put('status', '0')
Menu.put('createdOn', '2021-05-11T02:38:44.744Z')
Menu.put('createdBy', randomBannerName)
Menu.put('modifiedOn', '2021-05-11T02:38:44.744Z')
Menu.put('modifiedBy', randomBannerName)

HashMap<String, Object> subMenu2 = new HashMap<String, Object>()
//subMenu2.put(null,null)

List<Map<String,String>> subMenuList = new ArrayList <Map<String,String>> ();

subMenuList.add(subMenu2)
Menu.put('subMenus', subMenuList)
subMenu.put('menu', Menu)
print(subMenu)

response = CustomKeywords.'keyword.API.Post' ('/api/subMenu', subMenu)

WS.verifyElementPropertyValue(response, 'name', randomBannerName)
WS.verifyResponseStatusCode(response, 201)