
package com.semperti.hipotecario.poc.fuse.cobis;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for persona complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="persona"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="apellidos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="esPersonaFisica" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="esPersonaJuridica" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="idNumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="idSexo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nombres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numeroDocumento" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="prestamosPatrimoniales" type="{http://cobis.poc.hipotecario.semperti.com/}prestamoPatrimonial" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="tarjetasCreditoPatrimoniales" type="{http://cobis.poc.hipotecario.semperti.com/}tarjetaCreditoPatrimonial" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "persona", propOrder = {
    "apellidos",
    "esPersonaFisica",
    "esPersonaJuridica",
    "id",
    "idNumeroDocumento",
    "idSexo",
    "nombres",
    "numeroDocumento",
    "prestamosPatrimoniales",
    "tarjetasCreditoPatrimoniales"
})
public class Persona {

    protected String apellidos;
    protected boolean esPersonaFisica;
    protected boolean esPersonaJuridica;
    protected int id;
    protected int idNumeroDocumento;
    protected int idSexo;
    protected String nombres;
    protected int numeroDocumento;
    @XmlElement(nillable = true)
    protected List<PrestamoPatrimonial> prestamosPatrimoniales;
    @XmlElement(nillable = true)
    protected List<TarjetaCreditoPatrimonial> tarjetasCreditoPatrimoniales;

    /**
     * Gets the value of the apellidos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Sets the value of the apellidos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellidos(String value) {
        this.apellidos = value;
    }

    /**
     * Gets the value of the esPersonaFisica property.
     * 
     */
    public boolean isEsPersonaFisica() {
        return esPersonaFisica;
    }

    /**
     * Sets the value of the esPersonaFisica property.
     * 
     */
    public void setEsPersonaFisica(boolean value) {
        this.esPersonaFisica = value;
    }

    /**
     * Gets the value of the esPersonaJuridica property.
     * 
     */
    public boolean isEsPersonaJuridica() {
        return esPersonaJuridica;
    }

    /**
     * Sets the value of the esPersonaJuridica property.
     * 
     */
    public void setEsPersonaJuridica(boolean value) {
        this.esPersonaJuridica = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the idNumeroDocumento property.
     * 
     */
    public int getIdNumeroDocumento() {
        return idNumeroDocumento;
    }

    /**
     * Sets the value of the idNumeroDocumento property.
     * 
     */
    public void setIdNumeroDocumento(int value) {
        this.idNumeroDocumento = value;
    }

    /**
     * Gets the value of the idSexo property.
     * 
     */
    public int getIdSexo() {
        return idSexo;
    }

    /**
     * Sets the value of the idSexo property.
     * 
     */
    public void setIdSexo(int value) {
        this.idSexo = value;
    }

    /**
     * Gets the value of the nombres property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * Sets the value of the nombres property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombres(String value) {
        this.nombres = value;
    }

    /**
     * Gets the value of the numeroDocumento property.
     * 
     */
    public int getNumeroDocumento() {
        return numeroDocumento;
    }

    /**
     * Sets the value of the numeroDocumento property.
     * 
     */
    public void setNumeroDocumento(int value) {
        this.numeroDocumento = value;
    }

    /**
     * Gets the value of the prestamosPatrimoniales property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prestamosPatrimoniales property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrestamosPatrimoniales().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrestamoPatrimonial }
     * 
     * 
     */
    public List<PrestamoPatrimonial> getPrestamosPatrimoniales() {
        if (prestamosPatrimoniales == null) {
            prestamosPatrimoniales = new ArrayList<PrestamoPatrimonial>();
        }
        return this.prestamosPatrimoniales;
    }

    /**
     * Gets the value of the tarjetasCreditoPatrimoniales property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tarjetasCreditoPatrimoniales property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTarjetasCreditoPatrimoniales().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TarjetaCreditoPatrimonial }
     * 
     * 
     */
    public List<TarjetaCreditoPatrimonial> getTarjetasCreditoPatrimoniales() {
        if (tarjetasCreditoPatrimoniales == null) {
            tarjetasCreditoPatrimoniales = new ArrayList<TarjetaCreditoPatrimonial>();
        }
        return this.tarjetasCreditoPatrimoniales;
    }

}
