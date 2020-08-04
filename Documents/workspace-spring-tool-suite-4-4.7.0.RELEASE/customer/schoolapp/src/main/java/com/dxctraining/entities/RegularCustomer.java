package details.entities;

import details.Account;
import details.Customer;


public class RegularCustomer extends Customer{
	
	private String houseAddress;
	
	
	public RegularCustomer(String customerId,String name,Account account,String houseAddress) {
		super(customerId,name,account);
		this.houseAddress=houseAddress;
		
		
		
		
		
		
	}

public String getHouseAddress() {
	return houseAddress;
}
public void setHouseAddress(String houseAddress) {
	this.houseAddress = houseAddress;
}

}
