package demo.jaxws.timeservice.client;

import demo.jaxws.timeservice.TimeService;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

public class TimeServiceClient {


    public static void main(String[] args) throws MalformedURLException {
        Service service = Service.create(
            new URL("http://127.0.0.1:9000/timeserver"),
            new QName("http://timeservice.jaxws.demo/","TimeServiceImplService") //Qualified name is taken from wsdl: {http://timeservice.jaxws.demo/}TimeServerImplService
        );
        TimeService timeService = service.getPort(TimeService.class);  // Service endpoint interface
        System.out.println("Time as long:   " + timeService.getTimeAsLong());
        System.out.println("Time as string: " + timeService.getTimeAsString());
    }

}
