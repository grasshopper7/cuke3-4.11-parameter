package annonymous;

import cucumber.api.java.en.Given;

public class Stepdefs {
	
	@Given("Customer {customer} orders {beverage}")
	public void customerOrders(Customer customer, Beverage beverage) {
		System.out.println("Customer name is " + customer.getName() + " orders " + beverage);
	}
}
