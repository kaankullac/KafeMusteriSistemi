package javaodev3.abtracts;

import javaodev3.entities.Customer;

public abstract  class BaseCustomerManager implements CustomerService {

	@Override
	public void save(Customer customer) {
		System.out.println("Veri tabanýna kaydedildi : " + customer.getFirstName());
		 
	}



	

}
