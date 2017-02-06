
package com.semperti.hipotecario.poc.fuse.cobis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tarjetaCreditoPatrimonial complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tarjetaCreditoPatrimonial"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="deuda" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="idEntidad" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="idMarcaTCPatrimonial" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="idPersona" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="limiteCompra" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="pagoPromedio" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tarjetaCreditoPatrimonial", propOrder = {
    "deuda",
    "id",
    "idEntidad",
    "idMarcaTCPatrimonial",
    "idPersona",
    "limiteCompra",
    "pagoPromedio"
})
public class TarjetaCreditoPatrimonial {

    protected float deuda;
    protected int id;
    protected int idEntidad;
    protected int idMarcaTCPatrimonial;
    protected int idPersona;
    protected float limiteCompra;
    protected float pagoPromedio;

    /**
     * Gets the value of the deuda property.
     * 
     */
    public float getDeuda() {
        return deuda;
    }

    /**
     * Sets the value of the deuda property.
     * 
     */
    public void setDeuda(float value) {
        this.deuda = value;
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
     * Gets the value of the idEntidad property.
     * 
     */
    public int getIdEntidad() {
        return idEntidad;
    }

    /**
     * Sets the value of the idEntidad property.
     * 
     */
    public void setIdEntidad(int value) {
        this.idEntidad = value;
    }

    /**
     * Gets the value of the idMarcaTCPatrimonial property.
     * 
     */
    public int getIdMarcaTCPatrimonial() {
        return idMarcaTCPatrimonial;
    }

    /**
     * Sets the value of the idMarcaTCPatrimonial property.
     * 
     */
    public void setIdMarcaTCPatrimonial(int value) {
        this.idMarcaTCPatrimonial = value;
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
     * Gets the value of the limiteCompra property.
     * 
     */
    public float getLimiteCompra() {
        return limiteCompra;
    }

    /**
     * Sets the value of the limiteCompra property.
     * 
     */
    public void setLimiteCompra(float value) {
        this.limiteCompra = value;
    }

    /**
     * Gets the value of the pagoPromedio property.
     * 
     */
    public float getPagoPromedio() {
        return pagoPromedio;
    }

    /**
     * Sets the value of the pagoPromedio property.
     * 
     */
    public void setPagoPromedio(float value) {
        this.pagoPromedio = value;
    }

}
