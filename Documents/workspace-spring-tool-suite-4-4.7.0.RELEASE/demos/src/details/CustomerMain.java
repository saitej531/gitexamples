package details;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CustomerMain {
	private Map<String, Customer> store = new HashMap<>();

	public static void main(String args[]) {
		CustomerMain demo = new CustomerMain();
		demo.runApp();
	}

	public void runApp() {

		try {
			Account account1 = new Account(125, "harsha");
			Account account2 = new Account(567, "tarun");
			Account account3 = new Account(500, "gopi");
			Account account4 = new Account(1000, "ram");

			RegularCustomer customer1 = new RegularCustomer("1a2s", "tejas", "chennai", account1);
			BussinessCustomer customer2 = new BussinessCustomer("3edr4", "sai", "hyderabad", account2);
			RegularCustomer customer3 = new RegularCustomer("23de", "sainadh", "banglore", account3);
			BussinessCustomer customer4 = new BussinessCustomer("w234", "rajesh", "vijayawada", account4);

			store.put(customer1.getId(), customer1);
			store.put(customer2.getId(), customer2);
			store.put(customer3.getId(), customer3);
			store.put(customer4.getId(), customer4);

			displayAll();
		}

		catch (Exception e) {
			System.out.println("some error occurred in program");
		}

	}

	public void displayAll() {
		Set<String> keys = store.keySet();
		for (String key : keys) {
			Customer current = store.get(key);

			boolean isBC = current instanceof BussinessCustomer;
			if (isBC) {
				BussinessCustomer BC = (BussinessCustomer) current;
				display(BC);
			}
			boolean isRC = current instanceof RegularCustomer;
			if (isRC) {

				RegularCustomer RC = (RegularCustomer) current;
				display(RC);

			}

		}
	}

	public void checkNull(Customer customer) {
		if (customer == null) {
			InvalidCustomerArgumentException exception = new InvalidCustomerArgumentException("null argument");
			

		}
	}

	public void displayCustomer(Customer customer) {
		checkNull(customer);
		String customerId = customer.getcustomerId();
		String name = customer.getName();
		System.out.println("customerId is " + customerId + " name is " + name);

	}

	public void display(RegularCustomer customer) {
		checkNull(customer);
		displayCustomer(customer);
		System.out.println("houseAddress=" + customer.getHouseAddress());

	}

	public void display(BussinessCustomer customer) {
		checkNull(customer);
		displayCustomer(customer);
		System.out.println("bussinessAddress=" + customer.getBussinessAddress());

	}

}
