package serilization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Test {

	public static void main(String[] args)  {
		try {
		SerializationDemo sd = new SerializationDemo(111,"vaish");
		
		//craete string and write object
		
		
		FileOutputStream fs = new FileOutputStream("C:\\Users\\hp\\Desktop\\CoreJavaKiranSir\\intputstream.txt");
		
		ObjectOutputStream os = new ObjectOutputStream(fs);
		
		os.writeObject(sd);
		
		os.flush();
		
        os.close();
        
        System.out.println("successssssssssssssssssssssssssssssssssssssssssss");
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
