<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>PUT_Menu_ID</name>
   <tag></tag>
   <elementGuidId>065b6ea8-f517-4617-aaef-b8d86b6aafcd</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>0</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;id\&quot;: 7,\n  \&quot;name\&quot;: \&quot;TestPut\&quot;,\n  \&quot;link\&quot;: \&quot;TestPut\&quot;,\n  \&quot;accessLevel\&quot;: 0,\n  \&quot;status\&quot;: 1,\n  \&quot;createdOn\&quot;: \&quot;2021-03-30T04:26:53.992Z\&quot;,\n  \&quot;createdBy\&quot;: \&quot;string\&quot;,\n  \&quot;modifiedOn\&quot;: \&quot;2021-03-30T04:26:53.992Z\&quot;,\n  \&quot;modifiedBy\&quot;: \&quot;string-07\&quot;,\n  \&quot;subMenus\&quot;: [\n    {\n      \&quot;id\&quot;: 0,\n      \&quot;name\&quot;: \&quot;TestPut\&quot;,\n      \&quot;link\&quot;: \&quot;TestPut\&quot;,\n      \&quot;accessLevel\&quot;: 0,\n      \&quot;status\&quot;: 0,\n      \&quot;createdOn\&quot;: \&quot;2021-03-30T04:26:53.992Z\&quot;,\n      \&quot;createdBy\&quot;: \&quot;string\&quot;,\n      \&quot;modifiedOn\&quot;: \&quot;2021-03-30T04:26:53.992Z\&quot;,\n      \&quot;modifiedBy\&quot;: \&quot;string\&quot;,\n      \&quot;menuId\&quot;: 7\n    }\n  ]\n}&quot;,
  &quot;contentType&quot;: &quot;text/plain&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>text/plain</value>
   </httpHeaderProperties>
   <katalonVersion>7.9.1</katalonVersion>
   <maxResponseSize>0</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>PUT</restRequestMethod>
   <restUrl>http://10.100.4.116:8235/api/Menu/7</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>0</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
