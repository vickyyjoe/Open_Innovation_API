<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>GET Idea Catalog Likes</name>
   <tag></tag>
   <elementGuidId>2eac55b2-9a68-4d20-8539-918c7bad9424</elementGuidId>
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
      <value>Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJVUE4iOiJ1c2VyLm9uZUBrYWxiZS5jby5pZCIsIk5hbWUiOiJVc2VyIE9uZSIsIk1vYmlsZU5vIjoiMDgwOTAwMDAxMTExIiwiQlUiOiJDb3Jwb3JhdGUgSVQgJiBTeXN0ZW0iLCJTQlUiOiJDb3Jwb3JhdGUgRnVuY3Rpb24iLCJCVUlkIjoiNDkzNDRlZTQtZjI0Ni00M2I0LTk2ZGYtMjM3MjRmZWU1OWI0IiwiU0JVSWQiOiIzNWI3YTRlMS04MTg2LTQzNTctODkwMC1iYTMzZjAzYjdkYmEiLCJKb2JUdGxOYW1lIjoiIiwiVXNlclJvbGUiOiIiLCJHcm91cFVzZXJJZCI6IiIsIklkZWFDYXRhbG9nVmlld0FjY2Vzc0xldmVsIjoiMCIsIm5iZiI6MTYyNDg1MTYwMCwiZXhwIjoxNjI1NDU2NDAwLCJpYXQiOjE2MjQ4NTE2MDB9.LlyJ15nygZgte8856runlt2a1Gtw4ymTVs6GJ9iXNTE</value>
   </httpHeaderProperties>
   <katalonVersion>7.9.1</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>GET</restRequestMethod>
   <restUrl>http://10.100.4.116:8235/api/IdeaCatalogLikes</restUrl>
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
