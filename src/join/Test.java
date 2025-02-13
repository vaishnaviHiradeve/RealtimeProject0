package join;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		//DemoThread.main=Thread.currentThread();
		DemoThread d = new DemoThread();
		d.start();
		d.join(10000);

		for (int i = 1; i <= 15; i++) {

			System.out.println("main Thread");

		}
	}
}
