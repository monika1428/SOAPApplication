import com.example.soapapplication.ws.TimeServiceImpl;
import javax.xml.ws.Endpoint;

public class TimeServicePublisher {
    public static void main(String[] args)
    {
        Endpoint endpoint = Endpoint.create(new TimeServiceImpl());
        endpoint.publish("http://localhost:8888/ws");

    }

}
