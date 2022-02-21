package com.academicprogrammer.courses.ws.services;

/*
PROJECT NAME : 1. SOAP Web Service Creation
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 19/02/2022 14:10
*/

import com.academicprogrammer.courses.ws.dto.SumRequest;
import com.academicprogrammer.courses.ws.dto.SumResponse;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(name = "SumWebService")
public interface SumWebService {

    @WebResult(name = "CalculateSumResponse") SumResponse calculateSum(@WebParam(name = "CalculateSumRequest") SumRequest request);
}
