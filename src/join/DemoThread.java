package join;

public class DemoThread extends Thread {
	//public static Thread main;

	@Override
	public void run() {
		for (int i = 1; i <= 15; i++) {
			try {
				//main.join();
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("child thread");

		}

	}
}
