package deserilization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import serilization.SerializationDemo;

public class Deserilization {

	public static void main(String[] args) {
		public class EmpDeserilizationDemo {
			
			FileInputStream fs = new FileInputStream("C:\\Users\\hp\\Desktop\\CoreJavaKiranSir\\intputstream.txt");
			
			ObjectInputStream ob = new ObjectInputStream(fs);
			
			SerializationDemo sd =(SerializationDemo) ob.readObject();
			
			

		}
		

	}

}
