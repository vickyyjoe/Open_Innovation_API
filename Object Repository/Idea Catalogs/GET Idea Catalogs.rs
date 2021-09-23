<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>GET Idea Catalogs</name>
   <tag></tag>
   <elementGuidId>a95483be-21ab-46ff-9acc-eea1bb3799ce</elementGuidId>
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
      <name>OIAuthorization</name>
      <type>Main</type>
      <value>Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJVUE4iOiJ1c2VyLm9uZUBrYWxiZS5jby5pZCIsIk5hbWUiOiJVc2VyIE9uZSIsIk1vYmlsZU5vIjoiMDgwOTAwMDAxMTExIiwiQlUiOiJDb3Jwb3JhdGUgSVQgJiBTeXN0ZW0iLCJTQlUiOiJDb3Jwb3JhdGUgRnVuY3Rpb24iLCJKb2JUdGxOYW1lIjoiIiwiVXNlclJvbGUiOiIiLCJHcm91cFVzZXJJZCI6IiIsIm5iZiI6MTYyNDMzNDU5MiwiZXhwIjoxNjI0OTM5MzkyLCJpYXQiOjE2MjQzMzQ1OTJ9.-iOnzshpRJ5u5AW0iuNfNCu1xQTGmZR3JOggmwsibHU</value>
   </httpHeaderProperties>
   <katalonVersion>7.9.1</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>GET</restRequestMethod>
   <restUrl>http://10.100.4.116:8235/api/IdeaCatalogs</restUrl>
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
