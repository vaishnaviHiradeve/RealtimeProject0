package getsetname;

public class ThreadNmaeDemo extends Thread {
	public void run() {
		System.out.println("run");
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().isAlive());
	}
	
	

	public static void main(String[] args) {
//		System.out.println("hello");
//		System.out.println(Thread.currentThread().getName());
//		Thread.currentThread().setName("vaish");
//		System.out.println(Thread.currentThread().getName());
//		System.out.println(10/0);
		ThreadNmaeDemo td = new ThreadNmaeDemo();
		td.setName("hira");
		td.start();
		System.out.println(Thread.currentThread().isAlive());
		System.out.println(td.isAlive());

	}

}
