package itemdemos;

public class Item {
	String id;
	String name;
	double price;

	Item(String id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	Item(String id, double price) {
		this(id, "", 30.5);
	}

	String getId() {
		return id;
	}

	void setId(String id) {
		this.id = id;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	double getPrice() {
		return price;
	}

	void setPrice(double price) {
		this.price = price;
	}

}
