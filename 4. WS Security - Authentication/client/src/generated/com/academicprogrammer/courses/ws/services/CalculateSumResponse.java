
package com.academicprogrammer.courses.ws.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for calculateSumResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="calculateSumResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CalculateSumResponse" type="{http://services.ws.courses.academicprogrammer.com/}SumResponse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calculateSumResponse", propOrder = {
    "calculateSumResponse"
})
public class CalculateSumResponse {

    @XmlElement(name = "CalculateSumResponse")
    protected SumResponse calculateSumResponse;

    /**
     * Gets the value of the calculateSumResponse property.
     * 
     * @return
     *     possible object is
     *     {@link SumResponse }
     *     
     */
    public SumResponse getCalculateSumResponse() {
        return calculateSumResponse;
    }

    /**
     * Sets the value of the calculateSumResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link SumResponse }
     *     
     */
    public void setCalculateSumResponse(SumResponse value) {
        this.calculateSumResponse = value;
    }

}
