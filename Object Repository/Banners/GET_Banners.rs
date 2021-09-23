<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>GET_Banners</name>
   <tag></tag>
   <elementGuidId>88274eca-5171-48bd-ac71-51b4e8dce978</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent></httpBodyContent>
   <httpBodyType></httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>text/plain</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>OIAuthorization</name>
      <type>Main</type>
      <value>Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJVUE4iOiJ1c2VyLm9uZUBrYWxiZS5jby5pZCIsIk5hbWUiOiJVc2VyIE9uZSIsIk1vYmlsZU5vIjoiMDgwOTAwMDAxMTExIiwiQlUiOiJDb3Jwb3JhdGUgSVQgJiBTeXN0ZW0iLCJTQlUiOiJDb3Jwb3JhdGUgRnVuY3Rpb24iLCJVc2VyUm9sZSI6IiIsIm5iZiI6MTYyMjYyNzU0OSwiZXhwIjoxNjIzMjMyMzQ5LCJpYXQiOjE2MjI2Mjc1NDl9.5bC5A396ewYU3Qqm4uHzQIZdFTmKngC5S6sIe1az31U</value>
   </httpHeaderProperties>
   <katalonVersion>7.9.1</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>GET</restRequestMethod>
   <restUrl>http://10.100.4.116:8235/api/Banners/</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>59f70fd2-0d91-481a-8d5e-0605910b05e0</id>
      <masked>false</masked>
      <name>variable</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>282ff1b6-b43f-4bab-8084-b9d1a9913bd1</id>
      <masked>false</masked>
      <name>variable_0</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>7c83a302-81d1-42a1-a76b-9fceeaf88a30</id>
      <masked>false</masked>
      <name>variable_1</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>3403dbf2-0525-446c-b37e-489a800702f4</id>
      <masked>false</masked>
      <name>variable_2</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>e96c68de-86cf-4f0d-a570-0f9b0099bc7d</id>
      <masked>false</masked>
      <name>variable_3</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()

WS.verifyElementText(response, 'id','9')

WS.verifyElementPropertyValue(response, '[58].id', 64)</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
