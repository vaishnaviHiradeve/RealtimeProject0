package yield;

public class DemoThread extends Thread{
	

		@Override
		public void run() {
			for(int i =1; i<=15; i++) {
			Thread.yield();
				System.out.println("child thread");
				
		}

		

		
		}
}
