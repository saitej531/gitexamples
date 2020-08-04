package details;

public class BussinessCustomer extends Customer {

	private String bussinessAddress;
	

	public BussinessCustomer(String CustomerId, String Name, String bussinessAddress,Account account) {
		super(CustomerId, Name,account);
		this.bussinessAddress = bussinessAddress;
		
		

	}

	public String getBussinessAddress() {
		return bussinessAddress;
	}

	public void setBussinessAddress(String BussinessAddress) {
		this.bussinessAddress = bussinessAddress;
	}

	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}

}
