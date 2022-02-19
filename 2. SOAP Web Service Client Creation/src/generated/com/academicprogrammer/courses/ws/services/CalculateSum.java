
package com.academicprogrammer.courses.ws.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for calculateSum complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="calculateSum"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CalculateSumRequest" type="{http://services.ws.courses.academicprogrammer.com/}SumRequest" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calculateSum", propOrder = {
    "calculateSumRequest"
})
public class CalculateSum {

    @XmlElement(name = "CalculateSumRequest")
    protected SumRequest calculateSumRequest;

    /**
     * Gets the value of the calculateSumRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SumRequest }
     *     
     */
    public SumRequest getCalculateSumRequest() {
        return calculateSumRequest;
    }

    /**
     * Sets the value of the calculateSumRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SumRequest }
     *     
     */
    public void setCalculateSumRequest(SumRequest value) {
        this.calculateSumRequest = value;
    }

}
