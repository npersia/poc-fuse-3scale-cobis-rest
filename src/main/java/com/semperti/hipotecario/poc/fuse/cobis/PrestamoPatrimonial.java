
package com.semperti.hipotecario.poc.fuse.cobis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for prestamoPatrimonial complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="prestamoPatrimonial"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="deuda" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="esACancelar" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="idEntidad" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="idPersona" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="idTipoPrestamo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="plazoRestante" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="valorCuota" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "prestamoPatrimonial", propOrder = {
    "deuda",
    "esACancelar",
    "id",
    "idEntidad",
    "idPersona",
    "idTipoPrestamo",
    "plazoRestante",
    "valorCuota"
})
public class PrestamoPatrimonial {

    protected float deuda;
    protected boolean esACancelar;
    protected int id;
    protected int idEntidad;
    protected int idPersona;
    protected int idTipoPrestamo;
    protected int plazoRestante;
    protected float valorCuota;

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
     * Gets the value of the esACancelar property.
     * 
     */
    public boolean isEsACancelar() {
        return esACancelar;
    }

    /**
     * Sets the value of the esACancelar property.
     * 
     */
    public void setEsACancelar(boolean value) {
        this.esACancelar = value;
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
     * Gets the value of the idTipoPrestamo property.
     * 
     */
    public int getIdTipoPrestamo() {
        return idTipoPrestamo;
    }

    /**
     * Sets the value of the idTipoPrestamo property.
     * 
     */
    public void setIdTipoPrestamo(int value) {
        this.idTipoPrestamo = value;
    }

    /**
     * Gets the value of the plazoRestante property.
     * 
     */
    public int getPlazoRestante() {
        return plazoRestante;
    }

    /**
     * Sets the value of the plazoRestante property.
     * 
     */
    public void setPlazoRestante(int value) {
        this.plazoRestante = value;
    }

    /**
     * Gets the value of the valorCuota property.
     * 
     */
    public float getValorCuota() {
        return valorCuota;
    }

    /**
     * Sets the value of the valorCuota property.
     * 
     */
    public void setValorCuota(float value) {
        this.valorCuota = value;
    }

}
