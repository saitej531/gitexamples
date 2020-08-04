package accountdemos;
public class Current extends Account {
	
	String country;
	Current(String businessadd, String name, String country ){
	 	super(businessadd);
		this.country=country;
	}
	String getCountry() {
		return country;
	}
	void setCountry(String country) {
		this.country=country;
 	}
}