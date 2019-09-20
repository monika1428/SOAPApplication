package com.example.soapapplication.ws;

import javax.jws.WebService;
import java.util.Date;

@WebService(endpointInterface = "com.example.soapapplication.ws.TimeService", name = "TimeService")
public class TimeServiceImpl implements TimeService{
        public String getTimeFromServer(){
            return new Date().toString();
        }

}
