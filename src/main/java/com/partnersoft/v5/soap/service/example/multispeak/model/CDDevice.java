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
 * <p>Java class for CDDevice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CDDevice">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_3.0}mspDevice">
 *       &lt;sequence>
 *         &lt;element name="manufacturer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="meterBaseID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ratedVoltage" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="ratedCurrent" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="moduleList" type="{http://www.multispeak.org/Version_3.0}moduleList" minOccurs="0"/>
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
@XmlType(name = "CDDevice", propOrder = {
    "manufacturer",
    "serialNumber",
    "meterBaseID",
    "ratedVoltage",
    "ratedCurrent",
    "moduleList"
})
public class CDDevice
    extends MspDevice
{

    protected String manufacturer;
    protected String serialNumber;
    protected String meterBaseID;
    protected Float ratedVoltage;
    protected Float ratedCurrent;
    protected ModuleList moduleList;

    /**
     * Gets the value of the manufacturer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * Sets the value of the manufacturer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturer(String value) {
        this.manufacturer = value;
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the meterBaseID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeterBaseID() {
        return meterBaseID;
    }

    /**
     * Sets the value of the meterBaseID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeterBaseID(String value) {
        this.meterBaseID = value;
    }

    /**
     * Gets the value of the ratedVoltage property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRatedVoltage() {
        return ratedVoltage;
    }

    /**
     * Sets the value of the ratedVoltage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRatedVoltage(Float value) {
        this.ratedVoltage = value;
    }

    /**
     * Gets the value of the ratedCurrent property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRatedCurrent() {
        return ratedCurrent;
    }

    /**
     * Sets the value of the ratedCurrent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRatedCurrent(Float value) {
        this.ratedCurrent = value;
    }

    /**
     * Gets the value of the moduleList property.
     * 
     * @return
     *     possible object is
     *     {@link ModuleList }
     *     
     */
    public ModuleList getModuleList() {
        return moduleList;
    }

    /**
     * Sets the value of the moduleList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModuleList }
     *     
     */
    public void setModuleList(ModuleList value) {
        this.moduleList = value;
    }

}
