package caluclatordemos;



public class Calculatormain {
	public static void main(String arg[]) {
	
	Calculator calcy1=new Calculator();
	
  calcy1.add(10, 20);
 int result1=calcy1.getResult();
  System.out.println("Caluclator1 is"+result1);
  Calculator calcy2=new Calculator();
  calcy2.add(1,5);
  int result2=calcy2.getResult();
  System.out.println("Caluclator2 is"+result2);
}
}