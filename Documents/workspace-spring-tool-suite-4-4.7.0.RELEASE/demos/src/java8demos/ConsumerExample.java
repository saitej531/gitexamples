package java8demos;

public class ConsumerExample {
	
	public static void main(String args[]) {
		

	
		IPrint print1 =(msg) -> {
			
			System.out.println(msg);  ///// lamda within the body
		};
		System.out.println("***lambda defined with body****");
		print1.print(  "hello");
		
		
		
			
		IPrint print2 =(msg) -> System.out.println(msg);
			
			System.out.println("***lamda defined inline**");  //// lamda with in the line
			
			print2.print(  "hello");
			
			
		
		
	
}
	
}

