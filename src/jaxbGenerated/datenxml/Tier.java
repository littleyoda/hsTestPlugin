//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.11 at 08:41:59 PM CET 
//


package jaxbGenerated.datenxml;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *       &lt;sequence>
 *         &lt;element name="eigenschaften">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="astralenergie" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="ausdauer" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="charisma" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="fingerfertigkeit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="gefahrenwert" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="geschwindigkeit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="geschwindigkeit2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="geschwindigkeit3" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="gewandtheit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="intuition" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="klugheit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="konstitution" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="koerperkraft" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="lebensenergie" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="loyalitaet" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="magieresistenz" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="magieresistenz2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="mut" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="ruestungsschutz" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{}vorteile"/>
 *         &lt;element ref="{}sonderfertigkeiten"/>
 *         &lt;element name="gattung" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="familie" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="groesse" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ini">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="mul" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="sum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="w" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="angriffe">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="angriff" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="at" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="dk" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                           &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                           &lt;attribute name="pa" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="tp" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "eigenschaften",
    "vorteile",
    "sonderfertigkeiten",
    "gattung",
    "familie",
    "groesse",
    "ini",
    "angriffe"
})
@XmlRootElement(name = "tier")
public class Tier {

    @XmlElement(required = true)
    protected Tier.Eigenschaften eigenschaften;
    @XmlElement(required = true)
    protected Vorteile vorteile;
    @XmlElement(required = true)
    protected Sonderfertigkeiten sonderfertigkeiten;
    @XmlElement(required = true)
    protected String gattung;
    @XmlElement(required = true)
    protected String familie;
    @XmlElement(required = true)
    protected String groesse;
    @XmlElement(required = true)
    protected Tier.Ini ini;
    @XmlElement(required = true)
    protected Tier.Angriffe angriffe;

    /**
     * Gets the value of the eigenschaften property.
     * 
     * @return
     *     possible object is
     *     {@link Tier.Eigenschaften }
     *     
     */
    public Tier.Eigenschaften getEigenschaften() {
        return eigenschaften;
    }

    /**
     * Sets the value of the eigenschaften property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tier.Eigenschaften }
     *     
     */
    public void setEigenschaften(Tier.Eigenschaften value) {
        this.eigenschaften = value;
    }

    /**
     * Gets the value of the vorteile property.
     * 
     * @return
     *     possible object is
     *     {@link Vorteile }
     *     
     */
    public Vorteile getVorteile() {
        return vorteile;
    }

    /**
     * Sets the value of the vorteile property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vorteile }
     *     
     */
    public void setVorteile(Vorteile value) {
        this.vorteile = value;
    }

    /**
     * Gets the value of the sonderfertigkeiten property.
     * 
     * @return
     *     possible object is
     *     {@link Sonderfertigkeiten }
     *     
     */
    public Sonderfertigkeiten getSonderfertigkeiten() {
        return sonderfertigkeiten;
    }

    /**
     * Sets the value of the sonderfertigkeiten property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sonderfertigkeiten }
     *     
     */
    public void setSonderfertigkeiten(Sonderfertigkeiten value) {
        this.sonderfertigkeiten = value;
    }

    /**
     * Gets the value of the gattung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGattung() {
        return gattung;
    }

    /**
     * Sets the value of the gattung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGattung(String value) {
        this.gattung = value;
    }

    /**
     * Gets the value of the familie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamilie() {
        return familie;
    }

    /**
     * Sets the value of the familie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamilie(String value) {
        this.familie = value;
    }

    /**
     * Gets the value of the groesse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroesse() {
        return groesse;
    }

    /**
     * Sets the value of the groesse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroesse(String value) {
        this.groesse = value;
    }

    /**
     * Gets the value of the ini property.
     * 
     * @return
     *     possible object is
     *     {@link Tier.Ini }
     *     
     */
    public Tier.Ini getIni() {
        return ini;
    }

    /**
     * Sets the value of the ini property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tier.Ini }
     *     
     */
    public void setIni(Tier.Ini value) {
        this.ini = value;
    }

    /**
     * Gets the value of the angriffe property.
     * 
     * @return
     *     possible object is
     *     {@link Tier.Angriffe }
     *     
     */
    public Tier.Angriffe getAngriffe() {
        return angriffe;
    }

    /**
     * Sets the value of the angriffe property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tier.Angriffe }
     *     
     */
    public void setAngriffe(Tier.Angriffe value) {
        this.angriffe = value;
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
     *         &lt;element name="angriff" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="at" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                 &lt;attribute name="dk" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                 &lt;attribute name="pa" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                 &lt;attribute name="tp" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "angriff"
    })
    public static class Angriffe {

        protected List<Tier.Angriffe.Angriff> angriff;

        /**
         * Gets the value of the angriff property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the angriff property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAngriff().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Tier.Angriffe.Angriff }
         * 
         * 
         */
        public List<Tier.Angriffe.Angriff> getAngriff() {
            if (angriff == null) {
                angriff = new ArrayList<Tier.Angriffe.Angriff>();
            }
            return this.angriff;
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
         *       &lt;attribute name="at" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *       &lt;attribute name="dk" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *       &lt;attribute name="pa" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *       &lt;attribute name="tp" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Angriff {

            @XmlAttribute(name = "at", required = true)
            protected BigInteger at;
            @XmlAttribute(name = "dk", required = true)
            @XmlSchemaType(name = "anySimpleType")
            protected String dk;
            @XmlAttribute(name = "name", required = true)
            @XmlSchemaType(name = "anySimpleType")
            protected String name;
            @XmlAttribute(name = "pa", required = true)
            protected BigInteger pa;
            @XmlAttribute(name = "tp", required = true)
            @XmlSchemaType(name = "anySimpleType")
            protected String tp;

            /**
             * Gets the value of the at property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getAt() {
                return at;
            }

            /**
             * Sets the value of the at property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setAt(BigInteger value) {
                this.at = value;
            }

            /**
             * Gets the value of the dk property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDk() {
                return dk;
            }

            /**
             * Sets the value of the dk property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDk(String value) {
                this.dk = value;
            }

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

            /**
             * Gets the value of the pa property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getPa() {
                return pa;
            }

            /**
             * Sets the value of the pa property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setPa(BigInteger value) {
                this.pa = value;
            }

            /**
             * Gets the value of the tp property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTp() {
                return tp;
            }

            /**
             * Sets the value of the tp property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTp(String value) {
                this.tp = value;
            }

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
     *         &lt;element name="astralenergie" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="ausdauer" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="charisma" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="fingerfertigkeit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="gefahrenwert" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="geschwindigkeit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="geschwindigkeit2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="geschwindigkeit3" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="gewandtheit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="intuition" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="klugheit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="konstitution" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="koerperkraft" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="lebensenergie" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="loyalitaet" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="magieresistenz" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="magieresistenz2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="mut" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="ruestungsschutz" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
        "astralenergie",
        "ausdauer",
        "charisma",
        "fingerfertigkeit",
        "gefahrenwert",
        "geschwindigkeit",
        "geschwindigkeit2",
        "geschwindigkeit3",
        "gewandtheit",
        "intuition",
        "klugheit",
        "konstitution",
        "koerperkraft",
        "lebensenergie",
        "loyalitaet",
        "magieresistenz",
        "magieresistenz2",
        "mut",
        "ruestungsschutz"
    })
    public static class Eigenschaften {

        protected BigDecimal astralenergie;
        protected BigDecimal ausdauer;
        protected BigDecimal charisma;
        protected BigDecimal fingerfertigkeit;
        protected BigDecimal gefahrenwert;
        protected BigDecimal geschwindigkeit;
        protected BigDecimal geschwindigkeit2;
        protected BigDecimal geschwindigkeit3;
        protected BigDecimal gewandtheit;
        protected BigDecimal intuition;
        protected BigDecimal klugheit;
        protected BigDecimal konstitution;
        protected BigDecimal koerperkraft;
        protected BigDecimal lebensenergie;
        protected BigDecimal loyalitaet;
        protected BigDecimal magieresistenz;
        protected BigDecimal magieresistenz2;
        protected BigDecimal mut;
        protected BigDecimal ruestungsschutz;

        /**
         * Gets the value of the astralenergie property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAstralenergie() {
            return astralenergie;
        }

        /**
         * Sets the value of the astralenergie property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAstralenergie(BigDecimal value) {
            this.astralenergie = value;
        }

        /**
         * Gets the value of the ausdauer property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAusdauer() {
            return ausdauer;
        }

        /**
         * Sets the value of the ausdauer property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAusdauer(BigDecimal value) {
            this.ausdauer = value;
        }

        /**
         * Gets the value of the charisma property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getCharisma() {
            return charisma;
        }

        /**
         * Sets the value of the charisma property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setCharisma(BigDecimal value) {
            this.charisma = value;
        }

        /**
         * Gets the value of the fingerfertigkeit property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getFingerfertigkeit() {
            return fingerfertigkeit;
        }

        /**
         * Sets the value of the fingerfertigkeit property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setFingerfertigkeit(BigDecimal value) {
            this.fingerfertigkeit = value;
        }

        /**
         * Gets the value of the gefahrenwert property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getGefahrenwert() {
            return gefahrenwert;
        }

        /**
         * Sets the value of the gefahrenwert property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setGefahrenwert(BigDecimal value) {
            this.gefahrenwert = value;
        }

        /**
         * Gets the value of the geschwindigkeit property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getGeschwindigkeit() {
            return geschwindigkeit;
        }

        /**
         * Sets the value of the geschwindigkeit property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setGeschwindigkeit(BigDecimal value) {
            this.geschwindigkeit = value;
        }

        /**
         * Gets the value of the geschwindigkeit2 property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getGeschwindigkeit2() {
            return geschwindigkeit2;
        }

        /**
         * Sets the value of the geschwindigkeit2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setGeschwindigkeit2(BigDecimal value) {
            this.geschwindigkeit2 = value;
        }

        /**
         * Gets the value of the geschwindigkeit3 property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getGeschwindigkeit3() {
            return geschwindigkeit3;
        }

        /**
         * Sets the value of the geschwindigkeit3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setGeschwindigkeit3(BigDecimal value) {
            this.geschwindigkeit3 = value;
        }

        /**
         * Gets the value of the gewandtheit property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getGewandtheit() {
            return gewandtheit;
        }

        /**
         * Sets the value of the gewandtheit property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setGewandtheit(BigDecimal value) {
            this.gewandtheit = value;
        }

        /**
         * Gets the value of the intuition property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getIntuition() {
            return intuition;
        }

        /**
         * Sets the value of the intuition property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setIntuition(BigDecimal value) {
            this.intuition = value;
        }

        /**
         * Gets the value of the klugheit property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getKlugheit() {
            return klugheit;
        }

        /**
         * Sets the value of the klugheit property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setKlugheit(BigDecimal value) {
            this.klugheit = value;
        }

        /**
         * Gets the value of the konstitution property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getKonstitution() {
            return konstitution;
        }

        /**
         * Sets the value of the konstitution property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setKonstitution(BigDecimal value) {
            this.konstitution = value;
        }

        /**
         * Gets the value of the koerperkraft property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getKoerperkraft() {
            return koerperkraft;
        }

        /**
         * Sets the value of the koerperkraft property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setKoerperkraft(BigDecimal value) {
            this.koerperkraft = value;
        }

        /**
         * Gets the value of the lebensenergie property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getLebensenergie() {
            return lebensenergie;
        }

        /**
         * Sets the value of the lebensenergie property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setLebensenergie(BigDecimal value) {
            this.lebensenergie = value;
        }

        /**
         * Gets the value of the loyalitaet property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getLoyalitaet() {
            return loyalitaet;
        }

        /**
         * Sets the value of the loyalitaet property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setLoyalitaet(BigDecimal value) {
            this.loyalitaet = value;
        }

        /**
         * Gets the value of the magieresistenz property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getMagieresistenz() {
            return magieresistenz;
        }

        /**
         * Sets the value of the magieresistenz property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setMagieresistenz(BigDecimal value) {
            this.magieresistenz = value;
        }

        /**
         * Gets the value of the magieresistenz2 property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getMagieresistenz2() {
            return magieresistenz2;
        }

        /**
         * Sets the value of the magieresistenz2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setMagieresistenz2(BigDecimal value) {
            this.magieresistenz2 = value;
        }

        /**
         * Gets the value of the mut property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getMut() {
            return mut;
        }

        /**
         * Sets the value of the mut property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setMut(BigDecimal value) {
            this.mut = value;
        }

        /**
         * Gets the value of the ruestungsschutz property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getRuestungsschutz() {
            return ruestungsschutz;
        }

        /**
         * Sets the value of the ruestungsschutz property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setRuestungsschutz(BigDecimal value) {
            this.ruestungsschutz = value;
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
     *       &lt;attribute name="mul" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="sum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="w" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
    public static class Ini {

        @XmlValue
        protected String content;
        @XmlAttribute(name = "mul")
        protected BigInteger mul;
        @XmlAttribute(name = "sum")
        protected BigInteger sum;
        @XmlAttribute(name = "w")
        protected BigInteger w;

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
         * Gets the value of the mul property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMul() {
            return mul;
        }

        /**
         * Sets the value of the mul property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMul(BigInteger value) {
            this.mul = value;
        }

        /**
         * Gets the value of the sum property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getSum() {
            return sum;
        }

        /**
         * Sets the value of the sum property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setSum(BigInteger value) {
            this.sum = value;
        }

        /**
         * Gets the value of the w property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getW() {
            return w;
        }

        /**
         * Sets the value of the w property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setW(BigInteger value) {
            this.w = value;
        }

    }

}