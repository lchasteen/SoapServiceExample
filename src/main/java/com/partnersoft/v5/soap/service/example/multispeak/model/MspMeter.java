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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mspMeter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mspMeter">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_3.0}mspObject">
 *       &lt;sequence>
 *         &lt;element name="meterNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="manufacturer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="catalogNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="metrologyFirmwareVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="metrologyFirmwareRevision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="meterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AMRDeviceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AMRVendor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transponderID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "mspMeter", propOrder = {
    "meterNo",
    "manufacturer",
    "catalogNumber",
    "serialNumber",
    "metrologyFirmwareVersion",
    "metrologyFirmwareRevision",
    "meterType",
    "amrDeviceType",
    "amrVendor",
    "transponderID",
    "moduleList"
})
@XmlSeeAlso({
    ElectricMeter.class,
    ReceivedElectricMeter.class,
    GasMeter.class,
    WaterMeter.class,
    PropaneMeter.class
})
public abstract class MspMeter
    extends MspObject
{

    protected String meterNo;
    protected String manufacturer;
    protected String catalogNumber;
    protected String serialNumber;
    protected String metrologyFirmwareVersion;
    protected String metrologyFirmwareRevision;
    protected String meterType;
    @XmlElement(name = "AMRDeviceType")
    protected String amrDeviceType;
    @XmlElement(name = "AMRVendor")
    protected String amrVendor;
    protected String transponderID;
    protected ModuleList moduleList;

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
     * Gets the value of the catalogNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatalogNumber() {
        return catalogNumber;
    }

    /**
     * Sets the value of the catalogNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatalogNumber(String value) {
        this.catalogNumber = value;
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
     * Gets the value of the metrologyFirmwareVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetrologyFirmwareVersion() {
        return metrologyFirmwareVersion;
    }

    /**
     * Sets the value of the metrologyFirmwareVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetrologyFirmwareVersion(String value) {
        this.metrologyFirmwareVersion = value;
    }

    /**
     * Gets the value of the metrologyFirmwareRevision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetrologyFirmwareRevision() {
        return metrologyFirmwareRevision;
    }

    /**
     * Sets the value of the metrologyFirmwareRevision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetrologyFirmwareRevision(String value) {
        this.metrologyFirmwareRevision = value;
    }

    /**
     * Gets the value of the meterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeterType() {
        return meterType;
    }

    /**
     * Sets the value of the meterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeterType(String value) {
        this.meterType = value;
    }

    /**
     * Gets the value of the amrDeviceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAMRDeviceType() {
        return amrDeviceType;
    }

    /**
     * Sets the value of the amrDeviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAMRDeviceType(String value) {
        this.amrDeviceType = value;
    }

    /**
     * Gets the value of the amrVendor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAMRVendor() {
        return amrVendor;
    }

    /**
     * Sets the value of the amrVendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAMRVendor(String value) {
        this.amrVendor = value;
    }

    /**
     * Gets the value of the transponderID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransponderID() {
        return transponderID;
    }

    /**
     * Sets the value of the transponderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransponderID(String value) {
        this.transponderID = value;
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
