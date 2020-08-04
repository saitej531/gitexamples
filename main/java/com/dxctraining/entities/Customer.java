package details.entities;



public class Customer {

	private String customerId;
	private String name;
	private Account account;
	
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public Customer(String customerId,String name) {
		this.name=name;
		this.customerId=customerId;
		
	}
	
	public Customer(String customerId,String name,Account account) {
		
		this(customerId,name);
		this.account=account;
		
		
	}
	public String getName() {
		return name;
		
	}
	public void setName(String name) {
		this.name=name;
	}

	public String getcustomerId() {
		return customerId;
	}
	public void setcustomerId(String CustomerId) {
		this.customerId=customerId;
		
	}
	
	
	public String toString() {
		String str= name+" "+customerId+" ";
		return str;
		
	}
}

