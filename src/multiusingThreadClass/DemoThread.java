package multiusingThreadClass;

public class DemoThread extends Thread{

	@Override
	public synchronized void start() {
		// TODO Auto-generated method stub
		super.start();
		System.out.println("overrided start method");
	}

	
	
	

}
