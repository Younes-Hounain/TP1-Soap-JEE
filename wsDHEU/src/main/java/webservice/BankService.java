package webservice;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;

@WebService(serviceName = "BankWS")
public class BankService {
    @WebMethod(operationName = "Convert")
    public double conversion(@WebParam(name = "montant") double mt){
        return mt*10.55;
    }
    @WebMethod(operationName = "ConversionDhToEuro")
    public double conversionDhToEuro(double montant) {
        return montant / 10.55;
    }

    @WebMethod(operationName = "ConversionEuroToDh")
    public double conversionEuroToDh( @WebParam(name = "montant")  double mt) {
        return mt * 10.55;
    }
    @WebMethod(operationName = "getCompte")
    public Compte getCompte(@WebParam(name = "code") int code) {
        return new Compte(code, Math.random()*8000,new Date());
    }
    @WebMethod(operationName = "getComptesList")
    public List<Compte> listComptes(){
        return List.of(
                new Compte(1, Math.random()*1000, new Date()),
                new Compte(2, Math.random()*1500, new Date()),
                new Compte(3, Math.random()*2000, new Date()),
                new Compte(4, Math.random()*2500, new Date()),
                new Compte(5, Math.random()*3000, new Date()));
        );
    }
}
