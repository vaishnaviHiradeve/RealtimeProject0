package multiusingThreadClass;

public class Test {

	public static void main(String[] args) {
		Thread.currentThread().setName("main1");
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setPriority(8);
		System.out.println(Thread.currentThread().getPriority());
		DemoThread d = new DemoThread();
		d.start();
		d.setName("Thread111");
		
		System.out.println(d.getName());
		//d.setPriority(10);
		System.out.println(d.getPriority());
		
		
		for(int i =1; i<=15; i++) {
			System.out.println("main Thread");
		}
		

	}

}
