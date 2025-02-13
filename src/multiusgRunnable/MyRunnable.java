package multiusgRunnable;

public class MyRunnable {

	public static void main(String[] args) {
		TeatRunnable target = new TeatRunnable();
		Thread t = new Thread(target);
		t.start();
		
		for(int i = 0; i<=15; i++) {
			System.out.println("main THread");
		}

	}

}