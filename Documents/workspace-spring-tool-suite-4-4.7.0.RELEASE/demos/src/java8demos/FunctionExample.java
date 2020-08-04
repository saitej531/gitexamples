package java8demos;

public class FunctionExample {
	
	public static void main(String args[])
	{
		
		IStringLength function1=(arg)->arg.length();
		int length1=function1.StringLength("hello");
		int length2=function1.StringLength("sai");
		
		System.out.println("Length 1 ="+length1);

		System.out.println("Length 2 ="+length2);
		
		
		
		
		
		IStringLength function2=(arg)->{
			return arg.length();
			
			
		};
		int length3=function2.StringLength("bye");
		
		
		
		
			
		}
				
	}

