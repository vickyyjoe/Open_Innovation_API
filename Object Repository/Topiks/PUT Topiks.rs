<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>PUT Topiks</name>
   <tag></tag>
   <elementGuidId>d220d3d9-02e4-4603-809a-3722a904b1d0</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;id\&quot;: 11,\n  \&quot;name\&quot;: \&quot;Test Baru\&quot;,\n  \&quot;status\&quot;: 2,\n  \&quot;createdOn\&quot;: \&quot;2021-03-31T02:26:56.442Z\&quot;,\n  \&quot;createdBy\&quot;: \&quot;abs\&quot;,\n  \&quot;modifiedOn\&quot;: \&quot;2021-03-31T02:26:56.442Z\&quot;,\n  \&quot;modifiedBy\&quot;: \&quot;tes\&quot;,\n  \&quot;subTopiks\&quot;: [\n    {\n      \&quot;id\&quot;: 3,\n      \&quot;name\&quot;: \&quot;apiTest\&quot;,\n      \&quot;status\&quot;: 1,\n      \&quot;createdOn\&quot;: \&quot;2021-03-31T02:26:56.442Z\&quot;,\n      \&quot;createdBy\&quot;: \&quot;123\&quot;,\n      \&quot;modifiedOn\&quot;: \&quot;2021-03-31T02:26:56.442Z\&quot;,\n      \&quot;modifiedBy\&quot;: \&quot;ok\&quot;,\n      \&quot;topikId\&quot;: 0\n    }\n  ]\n}&quot;,
  &quot;contentType&quot;: &quot;text/plain&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
   </httpHeaderProperties>
   <katalonVersion>7.9.1</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>PUT</restRequestMethod>
   <restUrl>http://10.100.4.116:8235/api/Topiks/11</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
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
