package demo.jaxws.timeservice;

import javax.xml.ws.Endpoint;

public class TimeServicePublisher {

    public static void main(String[ ] args) {
        Endpoint.publish("http://127.0.0.1:9000/timeserver", new TimeServiceImpl());
    }

}
