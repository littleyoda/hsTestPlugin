//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.11 at 08:41:59 PM CET 
//


package jaxbGenerated.datenxml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element ref="{}sonderfertigkeit" maxOccurs="unbounded" minOccurs="0"/>
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
    "sonderfertigkeit"
})
@XmlRootElement(name = "sonderfertigkeiten")
public class Sonderfertigkeiten {

    protected List<Sonderfertigkeit> sonderfertigkeit;

    /**
     * Gets the value of the sonderfertigkeit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sonderfertigkeit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSonderfertigkeit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Sonderfertigkeit }
     * 
     * 
     */
    public List<Sonderfertigkeit> getSonderfertigkeit() {
        if (sonderfertigkeit == null) {
            sonderfertigkeit = new ArrayList<Sonderfertigkeit>();
        }
        return this.sonderfertigkeit;
    }

}