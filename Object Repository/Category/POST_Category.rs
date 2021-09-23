<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>POST_Category</name>
   <tag></tag>
   <elementGuidId>8d5e603d-1df6-4d11-a48e-7b66393b83b8</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;id\&quot;: 0,\n  \&quot;name\&quot;: \&quot;string\&quot;,\n  \&quot;status\&quot;: 0,\n  \&quot;createdOn\&quot;: \&quot;2021-03-30T05:43:42.491Z\&quot;,\n  \&quot;createdBy\&quot;: \&quot;string\&quot;,\n  \&quot;modifiedOn\&quot;: \&quot;2021-03-30T05:43:42.491Z\&quot;,\n  \&quot;modifiedBy\&quot;: \&quot;string\&quot;,\n  \&quot;subKategoris\&quot;: [\n    {\n      \&quot;id\&quot;: 0,\n      \&quot;name\&quot;: \&quot;string\&quot;,\n      \&quot;status\&quot;: 0,\n      \&quot;createdOn\&quot;: \&quot;2021-03-30T05:43:42.491Z\&quot;,\n      \&quot;createdBy\&quot;: \&quot;string\&quot;,\n      \&quot;modifiedOn\&quot;: \&quot;2021-03-30T05:43:42.491Z\&quot;,\n      \&quot;modifiedBy\&quot;: \&quot;string\&quot;,\n      \&quot;kategoriId\&quot;: 0\n    }\n  ]\n}&quot;,
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
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>http://10.100.4.116:8235/api/Kategoris</restUrl>
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
