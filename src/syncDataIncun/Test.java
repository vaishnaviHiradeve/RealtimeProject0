package syncDataIncun;

public class Test extends Thread {
     
	Table t;
	int i;
	  
	public Test(Table t, int i) {
		this.t = t;
		this.i = i;
	}
	
	@Override
	public void run() {
		try {
			t.printTable(i);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Table tb1 = new Table();
		Table tb2 = new Table();
		Test t1 = new Test(tb1, 5);
		Test t2 = new Test(tb2, 10);
		t1.start();
		t2.start();
	}
	

}
