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
 * <p>Java class for meters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="meters">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_3.0}mspObject">
 *       &lt;sequence>
 *         &lt;element name="electricMeters" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="electricMeter" type="{http://www.multispeak.org/Version_3.0}electricMeter" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="waterMeters" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="waterMeter" type="{http://www.multispeak.org/Version_3.0}waterMeter" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="gasMeters" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="gasMeter" type="{http://www.multispeak.org/Version_3.0}gasMeter" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="propaneMeters" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="propaneMeter" type="{http://www.multispeak.org/Version_3.0}propaneMeter" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "meters", propOrder = {
    "electricMeters",
    "waterMeters",
    "gasMeters",
    "propaneMeters"
})
public class Meters
    extends MspObject
{

    protected Meters.ElectricMeters electricMeters;
    protected Meters.WaterMeters waterMeters;
    protected Meters.GasMeters gasMeters;
    protected Meters.PropaneMeters propaneMeters;

    /**
     * Gets the value of the electricMeters property.
     * 
     * @return
     *     possible object is
     *     {@link Meters.ElectricMeters }
     *     
     */
    public Meters.ElectricMeters getElectricMeters() {
        return electricMeters;
    }

    /**
     * Sets the value of the electricMeters property.
     * 
     * @param value
     *     allowed object is
     *     {@link Meters.ElectricMeters }
     *     
     */
    public void setElectricMeters(Meters.ElectricMeters value) {
        this.electricMeters = value;
    }

    /**
     * Gets the value of the waterMeters property.
     * 
     * @return
     *     possible object is
     *     {@link Meters.WaterMeters }
     *     
     */
    public Meters.WaterMeters getWaterMeters() {
        return waterMeters;
    }

    /**
     * Sets the value of the waterMeters property.
     * 
     * @param value
     *     allowed object is
     *     {@link Meters.WaterMeters }
     *     
     */
    public void setWaterMeters(Meters.WaterMeters value) {
        this.waterMeters = value;
    }

    /**
     * Gets the value of the gasMeters property.
     * 
     * @return
     *     possible object is
     *     {@link Meters.GasMeters }
     *     
     */
    public Meters.GasMeters getGasMeters() {
        return gasMeters;
    }

    /**
     * Sets the value of the gasMeters property.
     * 
     * @param value
     *     allowed object is
     *     {@link Meters.GasMeters }
     *     
     */
    public void setGasMeters(Meters.GasMeters value) {
        this.gasMeters = value;
    }

    /**
     * Gets the value of the propaneMeters property.
     * 
     * @return
     *     possible object is
     *     {@link Meters.PropaneMeters }
     *     
     */
    public Meters.PropaneMeters getPropaneMeters() {
        return propaneMeters;
    }

    /**
     * Sets the value of the propaneMeters property.
     * 
     * @param value
     *     allowed object is
     *     {@link Meters.PropaneMeters }
     *     
     */
    public void setPropaneMeters(Meters.PropaneMeters value) {
        this.propaneMeters = value;
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
     *         &lt;element name="electricMeter" type="{http://www.multispeak.org/Version_3.0}electricMeter" maxOccurs="unbounded" minOccurs="0"/>
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
        "electricMeter"
    })
    public static class ElectricMeters {

        protected List<ElectricMeter> electricMeter;

        /**
         * Gets the value of the electricMeter property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the electricMeter property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getElectricMeter().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ElectricMeter }
         * 
         * 
         */
        public List<ElectricMeter> getElectricMeter() {
            if (electricMeter == null) {
                electricMeter = new ArrayList<ElectricMeter>();
            }
            return this.electricMeter;
        }

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
     *         &lt;element name="gasMeter" type="{http://www.multispeak.org/Version_3.0}gasMeter" maxOccurs="unbounded" minOccurs="0"/>
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
        "gasMeter"
    })
    public static class GasMeters {

        protected List<GasMeter> gasMeter;

        /**
         * Gets the value of the gasMeter property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the gasMeter property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGasMeter().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GasMeter }
         * 
         * 
         */
        public List<GasMeter> getGasMeter() {
            if (gasMeter == null) {
                gasMeter = new ArrayList<GasMeter>();
            }
            return this.gasMeter;
        }

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
     *         &lt;element name="propaneMeter" type="{http://www.multispeak.org/Version_3.0}propaneMeter" maxOccurs="unbounded" minOccurs="0"/>
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
        "propaneMeter"
    })
    public static class PropaneMeters {

        protected List<PropaneMeter> propaneMeter;

        /**
         * Gets the value of the propaneMeter property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the propaneMeter property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPropaneMeter().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PropaneMeter }
         * 
         * 
         */
        public List<PropaneMeter> getPropaneMeter() {
            if (propaneMeter == null) {
                propaneMeter = new ArrayList<PropaneMeter>();
            }
            return this.propaneMeter;
        }

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
     *         &lt;element name="waterMeter" type="{http://www.multispeak.org/Version_3.0}waterMeter" maxOccurs="unbounded" minOccurs="0"/>
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
        "waterMeter"
    })
    public static class WaterMeters {

        protected List<WaterMeter> waterMeter;

        /**
         * Gets the value of the waterMeter property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the waterMeter property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWaterMeter().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link WaterMeter }
         * 
         * 
         */
        public List<WaterMeter> getWaterMeter() {
            if (waterMeter == null) {
                waterMeter = new ArrayList<WaterMeter>();
            }
            return this.waterMeter;
        }

    }

}
