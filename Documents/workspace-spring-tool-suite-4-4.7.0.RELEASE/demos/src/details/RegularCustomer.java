package details;

public class RegularCustomer extends Customer  {
	
	private String houseAddress;
	
	
		public RegularCustomer(String CustomerId,String Name,String houseAddress,Account account) {
			super(Name,CustomerId,account);
			this.houseAddress=houseAddress;
			
			
			
			
			
		}
	public String getHouseAddress() {
		return houseAddress;
	}
	public void setHouseAddress(String houseAddress) {
		this.houseAddress = houseAddress;
	}
	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
