package com.example.soapapplication.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface TimeService
{
    @WebMethod
    String getTimeFromServer();

}
