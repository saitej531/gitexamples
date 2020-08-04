package accountdemos;

public class Account {
	String businessadd;
	String name;
	Account(String businessadd,String name){
		this.businessadd=businessadd;
		this.name=name;
	}
	String getBusinessadd() {
		return businessadd;
	}
	void setBusinessAdd(String bussinessArg) {
		businessadd=businessArg;
	}
	String getName() {
		return name;
	}
	void setName(String nameArg) {
		name=nameArg;
	}
}