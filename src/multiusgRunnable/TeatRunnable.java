package multiusgRunnable;

public class TeatRunnable implements Runnable{

	

	@Override
	public void run() {
		
		 
		for(int i = 0; i<=15; i++) {
			System.out.println("child THread");
		}
		
	}

}
