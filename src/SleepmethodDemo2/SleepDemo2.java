package SleepmethodDemo2;

public class SleepDemo2 extends Thread{
	public  void run() {
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
		// TODO Auto-generated method stub
		SleepDemo2 sd = new SleepDemo2();
		sd.start();
		
		SleepDemo2 sd2 = new SleepDemo2();
		sd2.start();
		
	}

}
