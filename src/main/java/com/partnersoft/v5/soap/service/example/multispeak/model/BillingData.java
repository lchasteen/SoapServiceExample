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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for billingData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="billingData">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_3.0}mspObject">
 *       &lt;sequence>
 *         &lt;element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="servLoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ppmLocationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="meterNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CISBalanceAfterBilling" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="billingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="billFromDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="billToDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
@XmlType(name = "billingData", propOrder = {
    "accountNumber",
    "serviceType",
    "servLoc",
    "ppmLocationID",
    "meterNo",
    "cisBalanceAfterBilling",
    "billingDate",
    "billFromDate",
    "billToDate"
})
public class BillingData
    extends MspObject
{

    protected String accountNumber;
    protected String serviceType;
    protected String servLoc;
    protected String ppmLocationID;
    protected String meterNo;
    @XmlElement(name = "CISBalanceAfterBilling")
    protected Float cisBalanceAfterBilling;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar billingDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar billFromDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar billToDate;

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
     * Gets the value of the servLoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServLoc() {
        return servLoc;
    }

    /**
     * Sets the value of the servLoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServLoc(String value) {
        this.servLoc = value;
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
     * Gets the value of the meterNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeterNo() {
        return meterNo;
    }

    /**
     * Sets the value of the meterNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeterNo(String value) {
        this.meterNo = value;
    }

    /**
     * Gets the value of the cisBalanceAfterBilling property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCISBalanceAfterBilling() {
        return cisBalanceAfterBilling;
    }

    /**
     * Sets the value of the cisBalanceAfterBilling property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCISBalanceAfterBilling(Float value) {
        this.cisBalanceAfterBilling = value;
    }

    /**
     * Gets the value of the billingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBillingDate() {
        return billingDate;
    }

    /**
     * Sets the value of the billingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBillingDate(XMLGregorianCalendar value) {
        this.billingDate = value;
    }

    /**
     * Gets the value of the billFromDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBillFromDate() {
        return billFromDate;
    }

    /**
     * Sets the value of the billFromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBillFromDate(XMLGregorianCalendar value) {
        this.billFromDate = value;
    }

    /**
     * Gets the value of the billToDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBillToDate() {
        return billToDate;
    }

    /**
     * Sets the value of the billToDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBillToDate(XMLGregorianCalendar value) {
        this.billToDate = value;
    }

}
