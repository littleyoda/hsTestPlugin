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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eigenschaftswerteastrale complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="eigenschaftswerteastrale">
 *   &lt;complexContent>
 *     &lt;extension base="{}eigenschaftswertezukaufbar">
 *       &lt;sequence minOccurs="0">
 *         &lt;element ref="{}ausvornachteile"/>
 *         &lt;element ref="{}muinch2"/>
 *         &lt;element ref="{}aussonderfertigkeiten"/>
 *         &lt;element ref="{}professionmod"/>
 *         &lt;element ref="{}grossemeditation"/>
 *         &lt;element ref="{}pasprueckkaufbar"/>
 *         &lt;element ref="{}aktinklrueckkaufbarepasp"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eigenschaftswerteastrale", propOrder = {
    "ausvornachteile",
    "muinch2",
    "aussonderfertigkeiten",
    "professionmod",
    "grossemeditation",
    "pasprueckkaufbar",
    "aktinklrueckkaufbarepasp"
})
public class Eigenschaftswerteastrale
    extends Eigenschaftswertezukaufbar
{

    protected BigInteger ausvornachteile;
    protected BigInteger muinch2;
    protected BigInteger aussonderfertigkeiten;
    protected BigInteger professionmod;
    protected BigInteger grossemeditation;
    protected BigInteger pasprueckkaufbar;
    protected BigInteger aktinklrueckkaufbarepasp;

    /**
     * Gets the value of the ausvornachteile property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAusvornachteile() {
        return ausvornachteile;
    }

    /**
     * Sets the value of the ausvornachteile property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAusvornachteile(BigInteger value) {
        this.ausvornachteile = value;
    }

    /**
     * Gets the value of the muinch2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMuinch2() {
        return muinch2;
    }

    /**
     * Sets the value of the muinch2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMuinch2(BigInteger value) {
        this.muinch2 = value;
    }

    /**
     * Gets the value of the aussonderfertigkeiten property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAussonderfertigkeiten() {
        return aussonderfertigkeiten;
    }

    /**
     * Sets the value of the aussonderfertigkeiten property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAussonderfertigkeiten(BigInteger value) {
        this.aussonderfertigkeiten = value;
    }

    /**
     * Gets the value of the professionmod property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProfessionmod() {
        return professionmod;
    }

    /**
     * Sets the value of the professionmod property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setProfessionmod(BigInteger value) {
        this.professionmod = value;
    }

    /**
     * Gets the value of the grossemeditation property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGrossemeditation() {
        return grossemeditation;
    }

    /**
     * Sets the value of the grossemeditation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGrossemeditation(BigInteger value) {
        this.grossemeditation = value;
    }

    /**
     * Gets the value of the pasprueckkaufbar property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPasprueckkaufbar() {
        return pasprueckkaufbar;
    }

    /**
     * Sets the value of the pasprueckkaufbar property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPasprueckkaufbar(BigInteger value) {
        this.pasprueckkaufbar = value;
    }

    /**
     * Gets the value of the aktinklrueckkaufbarepasp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAktinklrueckkaufbarepasp() {
        return aktinklrueckkaufbarepasp;
    }

    /**
     * Sets the value of the aktinklrueckkaufbarepasp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAktinklrueckkaufbarepasp(BigInteger value) {
        this.aktinklrueckkaufbarepasp = value;
    }

}
