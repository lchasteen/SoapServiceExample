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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mspOverCurrentDeviceList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mspOverCurrentDeviceList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="breaker" type="{http://www.multispeak.org/Version_3.0}breaker" minOccurs="0"/>
 *           &lt;element name="sectionalizer" type="{http://www.multispeak.org/Version_3.0}sectionalizer" minOccurs="0"/>
 *           &lt;element name="recloser" type="{http://www.multispeak.org/Version_3.0}recloser" minOccurs="0"/>
 *           &lt;element name="mspOverCurrentDevice" type="{http://www.multispeak.org/Version_3.0}mspOverCurrentDevice" minOccurs="0"/>
 *           &lt;element name="fuse" type="{http://www.multispeak.org/Version_3.0}fuse" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mspOverCurrentDeviceList", propOrder = {
    "breakerOrSectionalizerOrRecloser"
})
public class MspOverCurrentDeviceList {

    @XmlElements({
        @XmlElement(name = "breaker", type = Breaker.class),
        @XmlElement(name = "sectionalizer", type = Sectionalizer.class),
        @XmlElement(name = "recloser", type = Recloser.class),
        @XmlElement(name = "mspOverCurrentDevice"),
        @XmlElement(name = "fuse", type = Fuse.class)
    })
    protected List<MspOverCurrentDevice> breakerOrSectionalizerOrRecloser;

    /**
     * Gets the value of the breakerOrSectionalizerOrRecloser property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the breakerOrSectionalizerOrRecloser property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBreakerOrSectionalizerOrRecloser().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Breaker }
     * {@link Sectionalizer }
     * {@link Recloser }
     * {@link MspOverCurrentDevice }
     * {@link Fuse }
     * 
     * 
     */
    public List<MspOverCurrentDevice> getBreakerOrSectionalizerOrRecloser() {
        if (breakerOrSectionalizerOrRecloser == null) {
            breakerOrSectionalizerOrRecloser = new ArrayList<MspOverCurrentDevice>();
        }
        return this.breakerOrSectionalizerOrRecloser;
    }

}