package yieldmethod;

public class YieldDemo extends Thread {
	public void run() {
		Thread.yield();
		for (int i = 1; i <= 5; i++) {
			System.out.println("child");
		}
	}

	public static void main(String[] args) {
		YieldDemo yd = new YieldDemo();
		yd.start();

		for (int i = 1; i <= 5; i++) {
//			Thread.yield();
			System.out.println("main");
			
		}

	}

}
