package yield;



public class Test {
	public static void main(String[] args) throws InterruptedException {
		DemoThread d = new DemoThread();
		d.start();
		
		for(int i =1; i<=15; i++) {
			//Thread.yield();
			System.out.println("main Thread");
			
		}
	}
}
