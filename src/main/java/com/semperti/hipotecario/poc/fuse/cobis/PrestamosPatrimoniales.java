
package com.semperti.hipotecario.poc.fuse.cobis;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for prestamosPatrimoniales complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="prestamosPatrimoniales"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="prestamosPatrimoniales" type="{http://cobis.poc.hipotecario.semperti.com/}prestamoPatrimonial" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "prestamosPatrimoniales", propOrder = {
    "prestamosPatrimoniales"
})
public class PrestamosPatrimoniales {

    @XmlElement(nillable = true)
    protected List<PrestamoPatrimonial> prestamosPatrimoniales;

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

}
