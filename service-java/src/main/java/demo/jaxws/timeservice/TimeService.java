package demo.jaxws.timeservice;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * SEI -Service Endpoint Interface
 */
@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface TimeService {

    @WebMethod
    String getTimeAsString();

    @WebMethod
    long getTimeAsLong();

}
