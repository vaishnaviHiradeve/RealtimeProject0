package demoanthread;

public class DoemonThraedDemo extends Thread {
	public void run()
	{
		if(Thread.currentThread().isDaemon())
		{
			System.out.println("deamon");
		}
		else
		{
			System.out.println("child");
		}
		
	}

	public static void main(String[] args) {
		System.out.println("main thread");
		DoemonThraedDemo dt = new DoemonThraedDemo();
		dt.setDaemon(true);
		dt.start();

}
}