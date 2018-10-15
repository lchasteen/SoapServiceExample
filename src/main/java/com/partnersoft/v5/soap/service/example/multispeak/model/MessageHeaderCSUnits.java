//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.10.15 at 05:19:04 PM EDT 
//


package com.partnersoft.v5.soap.service.example.multispeak.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageHeaderCSUnits.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MessageHeaderCSUnits">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="feet"/>
 *     &lt;enumeration value="meters"/>
 *     &lt;enumeration value="USSurveyFeet"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MessageHeaderCSUnits")
@XmlEnum
public enum MessageHeaderCSUnits {

    @XmlEnumValue("feet")
    FEET("feet"),
    @XmlEnumValue("meters")
    METERS("meters"),
    @XmlEnumValue("USSurveyFeet")
    US_SURVEY_FEET("USSurveyFeet"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    MessageHeaderCSUnits(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MessageHeaderCSUnits fromValue(String v) {
        for (MessageHeaderCSUnits c: MessageHeaderCSUnits.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
