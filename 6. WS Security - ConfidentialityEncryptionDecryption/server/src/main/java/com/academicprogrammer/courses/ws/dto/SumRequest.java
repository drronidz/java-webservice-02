package main.java.com.academicprogrammer.courses.ws.dto;

/*
PROJECT NAME : 1. SOAP Web Service Creation
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 19/02/2022 14:07
*/

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "SumRequest")
@XmlAccessorType(XmlAccessType.FIELD)
public class SumRequest {

    @XmlElement(name = "x")
    private int x;

    @XmlElement(name = "y")
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
