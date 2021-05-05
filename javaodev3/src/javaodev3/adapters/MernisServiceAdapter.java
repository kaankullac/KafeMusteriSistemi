package javaodev3.adapters;

import java.rmi.RemoteException;

import javaodev3.abtracts.PersonCheckService;
import javaodev3.entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements PersonCheckService {

	    @Override
	    public boolean CheckIfRealPerson(Customer customer){

	        KPSPublicSoapProxy kpsPublic=new KPSPublicSoapProxy();
	        boolean result=true;
	        try{
	        result=kpsPublic.TCKimlikNoDogrula(Long.parseLong(customer.getNationalitId()), customer.getFirstName(), customer.getLastName(),customer.getDateOfBirth().getYear());
	        }catch (RemoteException e) {
	            e.printStackTrace();
	        }

	        if(result){
	            return true;
	        }else {
	            return false;
	        }

	    }

	}
