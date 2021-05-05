package javaodev3.concrete;

import javaodev3.abtracts.PersonCheckService;
import javaodev3.entities.Customer;

public class CustomerCheckManager implements PersonCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		
		return true;
	}

}
