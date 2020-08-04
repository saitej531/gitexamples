package accountdemos;

public class Accountmain {

	public static void main(String[]args);
	

	{
		
		
	Account accounts[]=new Account[4];
	Current account1=new Current("shiping","vinay","india");
	Current account2=new Current("marketing","ashok","india");
	Saving account3=new Saving("personal","sai teja","hdfc");
	Saving account4=new Saving("personal2","ravi","axis");
	accounts[0]=account1;
	accounts[1]=account2;
	accounts[2]=account3;
	accounts[3]=account4;
	for(int i=0;i<accounts.length;i++) {
		Account iterate=account[i];
		String businessadd=iterate.getBusinessadd();
		String name=iterate.getName();
		boolean isCurrent=iterate instanceof Current;
		if(isCurrent) {
			Current current= (Current)iterate;
			
		String country=current.getCountry();
	System.out.println("businessadd" +businessadd+ "name" +name+ "country" +country);
		}
}
 boolean isSaving=iterate instanceof Saving;
		 if(isSaving) {
			 Saving current =(Saving)iterate;
			 System.out.println("businessadd" +businessadd+ "name" +name);
		 }
}
