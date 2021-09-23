<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>PUT_Category</name>
   <tag></tag>
   <elementGuidId>3faa5ea2-7ade-4170-b7e8-f05b202ea710</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>0</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;id\&quot;: 3,\n  \&quot;name\&quot;: \&quot;string-baru\&quot;,\n  \&quot;status\&quot;: 0,\n  \&quot;createdOn\&quot;: \&quot;2021-03-30T05:47:03.316Z\&quot;,\n  \&quot;createdBy\&quot;: \&quot;string-baru\&quot;,\n  \&quot;modifiedOn\&quot;: \&quot;2021-03-30T05:47:03.316Z\&quot;,\n  \&quot;modifiedBy\&quot;: \&quot;string\&quot;,\n  \&quot;subKategoris\&quot;: [\n    {\n      \&quot;id\&quot;: 0,\n      \&quot;name\&quot;: \&quot;string\&quot;,\n      \&quot;status\&quot;: 0,\n      \&quot;createdOn\&quot;: \&quot;2021-03-30T05:47:03.316Z\&quot;,\n      \&quot;createdBy\&quot;: \&quot;string\&quot;,\n      \&quot;modifiedOn\&quot;: \&quot;2021-03-30T05:47:03.316Z\&quot;,\n      \&quot;modifiedBy\&quot;: \&quot;string\&quot;,\n      \&quot;kategoriId\&quot;: 0\n    }\n  ]\n}&quot;,
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
   <restUrl>http://10.100.4.116:8235/api/Kategoris/3</restUrl>
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
