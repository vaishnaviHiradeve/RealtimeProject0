package syncDataIncun;

public class Table {
  // public static synchronized void printTable(int n) throws InterruptedException {
	 public void printTable(int n) throws InterruptedException {
	   synchronized (this){
			 for(int i=0; i<=10 ; i++) {
		 
		   System.out.println(i*n);
		   //Thread.sleep(500);
	   }
   }
}
}