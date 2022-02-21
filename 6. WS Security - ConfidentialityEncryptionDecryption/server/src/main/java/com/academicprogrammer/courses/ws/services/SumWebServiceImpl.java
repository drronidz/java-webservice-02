package com.academicprogrammer.courses.ws.services;

/*
PROJECT NAME : 1. SOAP Web Service Creation
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 19/02/2022 14:11
*/

import com.academicprogrammer.courses.ws.dto.SumRequest;
import com.academicprogrammer.courses.ws.dto.SumResponse;

public class SumWebServiceImpl implements SumWebService{
    @Override
    public SumResponse calculateSum(SumRequest request) {
        int result = request.getX() + request.getY();
        SumResponse response = new SumResponse();
        response.setResult(result);
        return response;
    }
}
