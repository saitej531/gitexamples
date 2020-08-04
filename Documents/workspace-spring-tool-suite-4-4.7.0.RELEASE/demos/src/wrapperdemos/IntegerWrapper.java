package wrapperdemos;

public class IntegerWrapper {
	
	public static void main(String[]args) {
		int i1=20;
		Integer i2=new Integer(20); *// Auto boxing
		int i3=new Integer(20); */// Auto unboxing
		byte b=i2.byteValue();
		String str=i2.toString();
		double doubleValue=i2.doubleValue();
		float floatValue=i2.floatValue();
		long longValue=i2.longValue();
		
		System.out.println("integer="+i2);
		System.out.println("string="+str);
		System.out.println("double="+doubleValue);
		System.out.println("long="+longValue);
		
	}

}
