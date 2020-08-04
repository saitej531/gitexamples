package wrapperdemos;

public class BooleanWrapper {
	public static void main(String[]args) {
		boolean bool=false;
		Boolean boolWrapper=new Boolean(false);
		String boolString=boolWrapper.toString();
		System.out.println("string="+boolString);
	}

}
