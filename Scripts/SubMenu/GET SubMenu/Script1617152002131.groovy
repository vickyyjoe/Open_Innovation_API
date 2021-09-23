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
import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

import com.kms.katalon.core.testobject.TestObjectProperty
import com.kms.katalon.core.testobject.ConditionType


HashMap<String, Object> innerBodyContentMap = new HashMap<>();
HashMap<String, Object> projectMap = new HashMap<>();


projectMap.put('key', 'KD')
innerBodyContentMap.put('project', projectMap)

innerBodyContentMap.put('summary', 'REST - Create new issue using API')
innerBodyContentMap.put('description', 'Creating of an issue using project keys and issue type names using the REST API')

HashMap<String, Object> issueTypeMap = new HashMap<>()
issueTypeMap.put('name', 'Story')
innerBodyContentMap.put('issuetype', issueTypeMap)


HashMap<String, Object> priorityMap = new HashMap<>()
priorityMap.put('name', 'High')
innerBodyContentMap.put('priority', priorityMap)

// Convert map into Json
def jsonBodyContent = new groovy.json.JsonBuilder()
jsonBodyContent fields: innerBodyContentMap

// Convert Json into String 
String bodyContent =  jsonBodyContent.toString()
// Create body content property
//HttpTextBodyContent httpBodyContent = new HttpTextBodyContent(bodyContent);

// Create header properties
List<TestObjectProperty> httpHeaderProperties = new ArrayList<>()
httpHeaderProperties.add(new TestObjectProperty("Content-Type", ConditionType.EQUALS, 'application/json'))
//httpHeaderProperties.add(new TestObjectProperty("Authorization", ConditionType.EQUALS, 'Basic ZGVtb0BrYXRhbG9uLmNvbTpWQm5jZXRPU083MEU0TlZMWVFuaDlCMkQ='))

RequestObject scriptedWso = new RequestObject('Create a new issue with script')
//scriptedWso.setBodyContent(httpBodyContent)
scriptedWso.setServiceType('REST')
scriptedWso.setHttpHeaderProperties(httpHeaderProperties)
scriptedWso.setRestUrl('http://10.100.4.116:8235/api/SubMenu')
scriptedWso.setRestRequestMethod('GET')

// Send the request and get the response
response = WS.sendRequest(scriptedWso)


//response = WS.sendRequest(findTestObject('Banners/GET_Banners'))
WS.verifyResponseStatusCode(response, 200)