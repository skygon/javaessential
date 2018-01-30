package FirstPackage;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class MySerialize implements Serializable{
	public int count = 10;
	private int price = 100;
	
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("dump.out");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		MySerialize ms = new MySerialize();
		oos.writeObject(ms);
		oos.flush();
		oos.close();
		System.out.println("FInish write object");
	}
}
