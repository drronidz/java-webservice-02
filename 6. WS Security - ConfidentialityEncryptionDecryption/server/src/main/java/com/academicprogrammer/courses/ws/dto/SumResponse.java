package main.java.com.academicprogrammer.courses.ws.dto;

/*
PROJECT NAME : 1. SOAP Web Service Creation
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 19/02/2022 14:09
*/

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "SumResponse")
@XmlAccessorType(XmlAccessType.FIELD)
public class SumResponse {

    // Leaving it as default
    private int result;

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
