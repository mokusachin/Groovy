package com.mokugoovy
import java.util.regex.*;

def text = "\"## rel/4.27.0-20210222090730\\n### Fix\\n -  Add consistent IDP group mapping field names in API output(#2867)\\n -  Input validation for trust configuration (HIS-1696)(#2868)\\n -  allow SAML login and SLO in iframe(#2866)\\n -  breaking PR Links in Product Repository.(#2869)\\n\""
def pattern = /\(#\d{4}\)/
def result = text.replaceAll("\\(","[").replaceAll("\\)","](https://github.wdf.sap.corp/CPSecurity/xsuaa/pull/)").replaceAll("\n","\\\\n")
println " $result"





