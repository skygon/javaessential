package test;

import java.util.concurrent.TimeUnit;

public class TestGC {
	static public void main(String[] args){
		int size = 1000000;
		Byte[] b = new Byte[size];
		int count = 10;
		while(count >= 0){
			System.out.println("allocate memory");
			b = new Byte[size];
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			count -= 1;
		}
		
		//System.gc();
		System.out.println("Finish test");
	}
}
