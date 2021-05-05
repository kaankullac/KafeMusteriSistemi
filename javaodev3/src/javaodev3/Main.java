package javaodev3;

import java.time.LocalDate;

import javaodev3.abtracts.BaseCustomerManager;
import javaodev3.adapters.MernisServiceAdapter;
import javaodev3.concrete.NeroCustomerManager;
import javaodev3.concrete.StarbucksCustomerManager;
import javaodev3.entities.Customer;


public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1, "Kaan", "Küllaç", LocalDate.of(1998, 2, 5), "48886766788"));
		
		

	}

}
