package exceptiondemos;

public class CustomUnCheckedException {
	public static void main(String[] args) {

		CustomUnCheckedException demo = new CustomUnCheckedException();
		Product product = null;
		demo.display(product);
		System.out.println("bye bye");

	}

	public void display(Product product) {
		if (product == null) {
			 
			InvalidArgumentUnCheckedException exception = new InvalidArgumentUnCheckedException("invalid argument");
			  throw exception;
			
		}
		String id = product.getId();
		String name = product.getName();
		System.out.println("product =" + id + " " + name);

	}


}
