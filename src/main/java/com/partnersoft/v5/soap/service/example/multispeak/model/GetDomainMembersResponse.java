//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.10.15 at 05:19:04 PM EDT 
//


package com.partnersoft.v5.soap.service.example.multispeak.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetDomainMembersResult" type="{http://www.multispeak.org/Version_3.0}ArrayOfDomainMember" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getDomainMembersResult"
})
@XmlRootElement(name = "GetDomainMembersResponse")
public class GetDomainMembersResponse {

    @XmlElement(name = "GetDomainMembersResult")
    protected ArrayOfDomainMember getDomainMembersResult;

    /**
     * Gets the value of the getDomainMembersResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDomainMember }
     *     
     */
    public ArrayOfDomainMember getGetDomainMembersResult() {
        return getDomainMembersResult;
    }

    /**
     * Sets the value of the getDomainMembersResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDomainMember }
     *     
     */
    public void setGetDomainMembersResult(ArrayOfDomainMember value) {
        this.getDomainMembersResult = value;
    }

}
