//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.08.15 at 08:44:39 PM EDT 
//


package org.sierraecg.schema.jaxb._1_04;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element ref="{http://www3.medical.philips.com}repbeat" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="dataencoding" use="required" type="{http://www3.medical.philips.com}TYPEdataencoding" />
 *       &lt;attribute name="compression" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="samplespersec" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="resolution" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="repbeatmethod" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "repbeat"
})
@XmlRootElement(name = "repbeats")
public class Repbeats {

    @XmlElement(required = true)
    protected List<Repbeat> repbeat;
    @XmlAttribute(name = "dataencoding", required = true)
    protected TYPEdataencoding dataencoding;
    @XmlAttribute(name = "compression")
    protected String compression;
    @XmlAttribute(name = "samplespersec", required = true)
    protected float samplespersec;
    @XmlAttribute(name = "resolution", required = true)
    protected float resolution;
    @XmlAttribute(name = "repbeatmethod")
    protected String repbeatmethod;

    /**
     * Gets the value of the repbeat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the repbeat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRepbeat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Repbeat }
     * 
     * 
     */
    public List<Repbeat> getRepbeat() {
        if (repbeat == null) {
            repbeat = new ArrayList<Repbeat>();
        }
        return this.repbeat;
    }

    /**
     * Gets the value of the dataencoding property.
     * 
     * @return
     *     possible object is
     *     {@link TYPEdataencoding }
     *     
     */
    public TYPEdataencoding getDataencoding() {
        return dataencoding;
    }

    /**
     * Sets the value of the dataencoding property.
     * 
     * @param value
     *     allowed object is
     *     {@link TYPEdataencoding }
     *     
     */
    public void setDataencoding(TYPEdataencoding value) {
        this.dataencoding = value;
    }

    /**
     * Gets the value of the compression property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompression() {
        return compression;
    }

    /**
     * Sets the value of the compression property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompression(String value) {
        this.compression = value;
    }

    /**
     * Gets the value of the samplespersec property.
     * 
     */
    public float getSamplespersec() {
        return samplespersec;
    }

    /**
     * Sets the value of the samplespersec property.
     * 
     */
    public void setSamplespersec(float value) {
        this.samplespersec = value;
    }

    /**
     * Gets the value of the resolution property.
     * 
     */
    public float getResolution() {
        return resolution;
    }

    /**
     * Sets the value of the resolution property.
     * 
     */
    public void setResolution(float value) {
        this.resolution = value;
    }

    /**
     * Gets the value of the repbeatmethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepbeatmethod() {
        return repbeatmethod;
    }

    /**
     * Sets the value of the repbeatmethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepbeatmethod(String value) {
        this.repbeatmethod = value;
    }

}
