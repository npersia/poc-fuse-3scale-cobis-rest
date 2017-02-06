
package com.semperti.hipotecario.poc.fuse.cobis;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tarjetasCreditoPatrimoniales complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tarjetasCreditoPatrimoniales"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
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
@XmlType(name = "tarjetasCreditoPatrimoniales", propOrder = {
    "tarjetasCreditoPatrimoniales"
})
public class TarjetasCreditoPatrimoniales {

    @XmlElement(nillable = true)
    protected List<TarjetaCreditoPatrimonial> tarjetasCreditoPatrimoniales;

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
