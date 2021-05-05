package javaodev3.concrete;


import javaodev3.abtracts.BaseCustomerManager;
import javaodev3.abtracts.PersonCheckService;
import javaodev3.entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	private PersonCheckService customerCheckService;
	
	public StarbucksCustomerManager(PersonCheckService customerCheckManager) {
	
		this.customerCheckService = customerCheckManager;
	
	}
	
	
	
	
	
	
	
	
	@Override
	public void save(Customer customer) {
		if(customerCheckService.CheckIfRealPerson(customer)) {
		System.out.println("Veri tabanýna kaydedildi : " + customer.getFirstName());
		}
		else {
			System.out.println("Geçerli biri deðil");
		}
	}


}
