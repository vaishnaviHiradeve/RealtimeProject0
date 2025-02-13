package Sleep;

public class DemoThread extends Thread{

	@Override
	public void run() {
		for(int i =1; i<=15; i++) {
			System.out.println("child thread");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	

	
	}
	

}
