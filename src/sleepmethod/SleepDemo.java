package sleepmethod;

public class SleepDemo extends Thread  {
	public void run() {
		for(int i=0; i<=10 ; i++) {
			System.out.println(i);
			try {
			Thread.sleep(1000);
				//Thread.sleep(-1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	public static void main(String[] args) {
		SleepDemo sd = new SleepDemo();
		sd.start();

	}

}
