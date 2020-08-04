package itemdemos;
public class Itemmain {
	public static void main(String[]args)
	{
		Item item1=new Item("rdfg","sai",20.43);
		Item item2=new Item("edey","teja",35.98);
		Item items[] =new Item[2];
		items[0]=item1;
		items[1]=item2;
		 
		for(Item item:items)
		{
			String id=item.getId();
			String name=item.getName();
			 double price=item.getPrice();
			System.out.println("id is "+id);
			System.out.println("name is"+name);
			System.out.println("price is"+price);
		}
	}
	

}
