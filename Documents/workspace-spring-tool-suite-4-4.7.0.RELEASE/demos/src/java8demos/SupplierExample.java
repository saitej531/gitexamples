package java8demos;

public class SupplierExample {
	
	
	public static void main(String args[]) {
		IGreet greet1=new IGreet() {
			public String greet() {
				return "hello";
			}
		};
		
		
		IGreet greet2=() -> "hello";
		String msg2=greet2.greet();
		
	
		
		
		IGreet greet3=() -> {
			String msg3="hello";
			return msg3;
		};
		
		greet3.greet();
		
		
	}

}
