//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.10.15 at 05:19:04 PM EDT 
//


package com.partnersoft.v5.soap.service.example.multispeak.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for premise complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="premise">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_3.0}mspPointObject">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceLocationList" type="{http://www.multispeak.org/Version_3.0}serviceLocationList" minOccurs="0"/>
 *         &lt;element name="owner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parcelID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="premiseServiceList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="premiseService" type="{http://www.multispeak.org/Version_3.0}premiseService" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
@XmlType(name = "premise", propOrder = {
    "description",
    "serviceLocationList",
    "owner",
    "parcelID",
    "premiseServiceList"
})
public class Premise
    extends MspPointObject
{

    protected String description;
    protected ServiceLocationList serviceLocationList;
    protected String owner;
    protected String parcelID;
    protected Premise.PremiseServiceList premiseServiceList;

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
     * Gets the value of the serviceLocationList property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceLocationList }
     *     
     */
    public ServiceLocationList getServiceLocationList() {
        return serviceLocationList;
    }

    /**
     * Sets the value of the serviceLocationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceLocationList }
     *     
     */
    public void setServiceLocationList(ServiceLocationList value) {
        this.serviceLocationList = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwner(String value) {
        this.owner = value;
    }

    /**
     * Gets the value of the parcelID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParcelID() {
        return parcelID;
    }

    /**
     * Sets the value of the parcelID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParcelID(String value) {
        this.parcelID = value;
    }

    /**
     * Gets the value of the premiseServiceList property.
     * 
     * @return
     *     possible object is
     *     {@link Premise.PremiseServiceList }
     *     
     */
    public Premise.PremiseServiceList getPremiseServiceList() {
        return premiseServiceList;
    }

    /**
     * Sets the value of the premiseServiceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Premise.PremiseServiceList }
     *     
     */
    public void setPremiseServiceList(Premise.PremiseServiceList value) {
        this.premiseServiceList = value;
    }


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
     *         &lt;element name="premiseService" type="{http://www.multispeak.org/Version_3.0}premiseService" maxOccurs="unbounded" minOccurs="0"/>
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
        "premiseService"
    })
    public static class PremiseServiceList {

        protected List<PremiseService> premiseService;

        /**
         * Gets the value of the premiseService property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the premiseService property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPremiseService().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PremiseService }
         * 
         * 
         */
        public List<PremiseService> getPremiseService() {
            if (premiseService == null) {
                premiseService = new ArrayList<PremiseService>();
            }
            return this.premiseService;
        }

    }

}
