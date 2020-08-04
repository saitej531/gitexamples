package multithread;

public class NumberThread extends Thread{
	
	  public NumberThread(String name) {
		super(name);
	}

	public void run() {
		 super.run();
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println(getName() + " i=" + i);
				Thread.sleep(1000);
			}
		}  catch (Exception e) {
           e.printStackTrace(); 
		}
	}


}

