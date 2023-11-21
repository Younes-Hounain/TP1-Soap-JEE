import jakarta.xml.ws.Endpoint;
import webservice.BankService;

public class ServerJWS {
    public static void main(String[] args) {

        var add = "http://0:0:0:0:9191/";

        Endpoint.publish(add, new BankService());
        System.out.println("Server is running on " + add + " ...");
    }
}
