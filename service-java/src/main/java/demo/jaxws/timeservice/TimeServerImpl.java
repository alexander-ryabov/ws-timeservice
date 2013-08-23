package demo.jaxws.timeservice;

import javax.jws.WebService;
import java.util.Date;

@WebService(endpointInterface = "demo.jaxws.timeservice.TimeServer")
public class TimeServerImpl implements TimeServer {

    public String getTimeAsString() {
        return (new Date()).toString();
    }

    public long getTimeAsLong() {
        return (new Date()).getTime();
    }
}
