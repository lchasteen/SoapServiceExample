//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.10.15 at 05:19:04 PM EDT 
//


package com.partnersoft.v5.soap.service.example.multispeak.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ppmBalanceAdjustment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ppmBalanceAdjustment">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_3.0}mspObject">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ppmLocationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adustmentList" type="{http://www.multispeak.org/Version_3.0}adjustmentItemList" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ppmBalanceAdjustment", propOrder = {
    "description",
    "accountNumber",
    "serviceType",
    "ppmLocationID",
    "adustmentList"
})
public class PpmBalanceAdjustment
    extends MspObject
{

    protected String description;
    protected String accountNumber;
    protected String serviceType;
    protected String ppmLocationID;
    protected AdjustmentItemList adustmentList;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the serviceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceType(String value) {
        this.serviceType = value;
    }

    /**
     * Gets the value of the ppmLocationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPpmLocationID() {
        return ppmLocationID;
    }

    /**
     * Sets the value of the ppmLocationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPpmLocationID(String value) {
        this.ppmLocationID = value;
    }

    /**
     * Gets the value of the adustmentList property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustmentItemList }
     *     
     */
    public AdjustmentItemList getAdustmentList() {
        return adustmentList;
    }

    /**
     * Sets the value of the adustmentList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustmentItemList }
     *     
     */
    public void setAdustmentList(AdjustmentItemList value) {
        this.adustmentList = value;
    }

}
