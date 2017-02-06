
package com.semperti.hipotecario.poc.fuse.cobis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for obtenerTarjetasCreditoPatrimonialesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="obtenerTarjetasCreditoPatrimonialesResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return" type="{http://cobis.poc.hipotecario.semperti.com/}tarjetasCreditoPatrimoniales" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerTarjetasCreditoPatrimonialesResponse", propOrder = {
    "_return"
})
public class ObtenerTarjetasCreditoPatrimonialesResponse {

    @XmlElement(name = "return")
    protected TarjetasCreditoPatrimoniales _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link TarjetasCreditoPatrimoniales }
     *     
     */
    public TarjetasCreditoPatrimoniales getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link TarjetasCreditoPatrimoniales }
     *     
     */
    public void setReturn(TarjetasCreditoPatrimoniales value) {
        this._return = value;
    }

}
