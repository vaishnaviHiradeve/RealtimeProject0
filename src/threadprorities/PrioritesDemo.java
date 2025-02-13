package threadprorities;

public class PrioritesDemo extends Thread {
	
	public void run(){
		System.out.println(Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		Thread.currentThread().setPriority(MAX_PRIORITY);
		System.out.println(Thread.currentThread().getPriority());
		
		PrioritesDemo pd = new PrioritesDemo();
		//pd.setPriority(MAX_PRIORITY)
		//pd.setPriority(8);
		pd.start();

	}

}
