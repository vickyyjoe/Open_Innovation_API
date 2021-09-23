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

String randomBannerName = 'MenuRole Test ' + CustomKeywords.'keyword.RandomGenerator.randomString'(30)

HashMap<String, Object> MenuRole = new HashMap<String, Object>()

MenuRole.put('id', '0')
MenuRole.put('status', '0')
MenuRole.put('createdOn', '2021-05-11T02:38:44.744Z')
MenuRole.put('modifiedOn', '2021-05-11T02:38:44.744Z')
MenuRole.put('createdBy', randomBannerName)
MenuRole.put('createdName	', randomBannerName)
MenuRole.put('modifiedBy', randomBannerName)
MenuRole.put('modifiedName', randomBannerName)
MenuRole.put('menuId', '0')
MenuRole.put('subMenuId', '0')

String randomBannerName1 = 'Menu Test ' + CustomKeywords.'keyword.RandomGenerator.randomString'(30)

HashMap<String, Object> Menu = new HashMap<String, Object>()

Menu.put('id', '0')
Menu.put('status', '0')
Menu.put('createdOn', '2021-05-11T02:38:44.744Z')
Menu.put('modifiedOn', '2021-05-11T02:38:44.744Z')
Menu.put('createdBy', randomBannerName1)
Menu.put('createdName', randomBannerName1)
Menu.put('modifiedBy', randomBannerName1)
Menu.put('modifiedName', randomBannerName1)
Menu.put('name', randomBannerName1)
Menu.put('link', randomBannerName1)
Menu.put('accessLevel', '0')
Menu.put('order', '0')

HashMap<String, Object> MenuRole2 = new HashMap<String, Object>()

List<Map<String,String>> MenuRoleList = new ArrayList <Map<String,String>> ();

MenuRoleList.add(MenuRole2)
Menu.put('MenuRole', MenuRoleList)
MenuRole.put('Menu', Menu)
print(MenuRole)

String randomBannerName2 = 'SubMenu Test ' + CustomKeywords.'keyword.RandomGenerator.randomString'(30)

HashMap<String, Object> SubMenu = new HashMap<String, Object>()

SubMenu.put('id', '0')
SubMenu.put('status', '0')
SubMenu.put('createdOn', '2021-05-11T02:38:44.744Z')
SubMenu.put('modifiedOn', '2021-05-11T02:38:44.744Z')
SubMenu.put('createdBy', randomBannerName2)
SubMenu.put('createdName', randomBannerName2)
SubMenu.put('modifiedBy', randomBannerName2)
SubMenu.put('modifiedName', randomBannerName2)
SubMenu.put('name', randomBannerName2)
SubMenu.put('link', randomBannerName2)
SubMenu.put('accessLevel', '0')
SubMenu.put('order', '0')
SubMenu.put('menuId', '0')

List<Map<String,String>> subMenuList = new ArrayList <Map<String,String>> ();

subMenuList.add(SubMenu)
Menu.put('subMenu', subMenuList)
print(Menu)

HashMap<String, Object> role = new HashMap<String, Object>()
role.put('role', '0')

response = CustomKeywords.'keyword.AccessToken.Post' ('api/MenuRoles/', MenuRole)

//WS.verifyElementPropertyValue(response, 'name', randomBannerName1)
WS.verifyResponseStatusCode(response, 201)





