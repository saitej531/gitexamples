package exceptiondemos;

public class CustomCheckedException {
	public static void main(String[] args) {

		CustomCheckedException demo = new CustomCheckedException();
		Product product = null;
		demo.display(product);
		System.out.println("bye bye");

	}

	public void display(Product product) {
		if (product == null) {
			 try {
			InvalidArgumentCheckedException exception = new InvalidArgumentCheckedException("invalid argument");
			  throw exception;
			 } catch (Exception e) {
			 e.printStackTrace();
		 System.out.println("product is null so no information to display");
			 return;
			 }
		}
		String id = product.getId();
		String name = product.getName();
		System.out.println("product =" + id + " " + name);

	}

}
