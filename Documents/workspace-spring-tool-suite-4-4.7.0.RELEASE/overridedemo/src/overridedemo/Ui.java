package overridedemo;

public class Ui {
	public static void main(String args[]) {
		Vehicle car=new Car("c11");
		car.move();
		String carNumber=car.getNumberPlate();
		System.out.println("car number="+carNumber);
	
		Vehicle bike=new Bike("b11");
		bike.move();
		String bikeNumber=bike.getNumberPlate();
		System.out.println("bike number="+bikeNumber);
	
		
	}

}

