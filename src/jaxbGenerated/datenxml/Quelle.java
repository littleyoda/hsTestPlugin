//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.11 at 08:41:59 PM CET 
//


package jaxbGenerated.datenxml;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="buch" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="seite" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "content"
})
@XmlRootElement(name = "quelle")
public class Quelle {

    @XmlValue
    protected String content;
    @XmlAttribute(name = "buch", required = true)
    protected String buch;
    @XmlAttribute(name = "seite", required = true)
    protected BigInteger seite;

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent(String value) {
        this.content = value;
    }

    /**
     * Gets the value of the buch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuch() {
        return buch;
    }

    /**
     * Sets the value of the buch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuch(String value) {
        this.buch = value;
    }

    /**
     * Gets the value of the seite property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSeite() {
        return seite;
    }

    /**
     * Sets the value of the seite property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSeite(BigInteger value) {
        this.seite = value;
    }

}
