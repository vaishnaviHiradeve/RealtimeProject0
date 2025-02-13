package yieldmethod;

import yieldmethod.JoinDemo;

public class JoinDemo extends Thread {
	public void run() {
		Thread.yield();
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		JoinDemo yd = new JoinDemo();
		yd.start();
		yd.join();

		for (int i = 1; i <= 5; i++) {

			System.out.println(i);
			Thread.sleep(1000);
			
			
		}

	}

}
