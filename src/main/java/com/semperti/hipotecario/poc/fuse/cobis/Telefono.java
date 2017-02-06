
package com.semperti.hipotecario.poc.fuse.cobis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for telefono complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="telefono"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="caracteristica" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="codigoArea" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="codigoPais" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="idPersona" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="idTipoTelefono" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="interno" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="numero" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="numeroNormalizado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="prefijo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "telefono", propOrder = {
    "caracteristica",
    "codigoArea",
    "codigoPais",
    "id",
    "idPersona",
    "idTipoTelefono",
    "interno",
    "numero",
    "numeroNormalizado",
    "prefijo"
})
public class Telefono {

    protected int caracteristica;
    protected int codigoArea;
    protected int codigoPais;
    protected int id;
    protected int idPersona;
    protected int idTipoTelefono;
    protected int interno;
    protected int numero;
    protected String numeroNormalizado;
    protected int prefijo;

    /**
     * Gets the value of the caracteristica property.
     * 
     */
    public int getCaracteristica() {
        return caracteristica;
    }

    /**
     * Sets the value of the caracteristica property.
     * 
     */
    public void setCaracteristica(int value) {
        this.caracteristica = value;
    }

    /**
     * Gets the value of the codigoArea property.
     * 
     */
    public int getCodigoArea() {
        return codigoArea;
    }

    /**
     * Sets the value of the codigoArea property.
     * 
     */
    public void setCodigoArea(int value) {
        this.codigoArea = value;
    }

    /**
     * Gets the value of the codigoPais property.
     * 
     */
    public int getCodigoPais() {
        return codigoPais;
    }

    /**
     * Sets the value of the codigoPais property.
     * 
     */
    public void setCodigoPais(int value) {
        this.codigoPais = value;
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
     * Gets the value of the idPersona property.
     * 
     */
    public int getIdPersona() {
        return idPersona;
    }

    /**
     * Sets the value of the idPersona property.
     * 
     */
    public void setIdPersona(int value) {
        this.idPersona = value;
    }

    /**
     * Gets the value of the idTipoTelefono property.
     * 
     */
    public int getIdTipoTelefono() {
        return idTipoTelefono;
    }

    /**
     * Sets the value of the idTipoTelefono property.
     * 
     */
    public void setIdTipoTelefono(int value) {
        this.idTipoTelefono = value;
    }

    /**
     * Gets the value of the interno property.
     * 
     */
    public int getInterno() {
        return interno;
    }

    /**
     * Sets the value of the interno property.
     * 
     */
    public void setInterno(int value) {
        this.interno = value;
    }

    /**
     * Gets the value of the numero property.
     * 
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Sets the value of the numero property.
     * 
     */
    public void setNumero(int value) {
        this.numero = value;
    }

    /**
     * Gets the value of the numeroNormalizado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroNormalizado() {
        return numeroNormalizado;
    }

    /**
     * Sets the value of the numeroNormalizado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroNormalizado(String value) {
        this.numeroNormalizado = value;
    }

    /**
     * Gets the value of the prefijo property.
     * 
     */
    public int getPrefijo() {
        return prefijo;
    }

    /**
     * Sets the value of the prefijo property.
     * 
     */
    public void setPrefijo(int value) {
        this.prefijo = value;
    }

}
