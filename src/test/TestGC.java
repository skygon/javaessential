package test;

import java.util.concurrent.TimeUnit;

/*
 * Use the following config at vm setting to let gc log displayed:
 * -XX:+PrintGCDetails
 * -Xmx64m  --> total jvm memory 64 MB
 * -Xmn16m  --> young generation 16 MB
 * */
public class TestGC {
	static public void main(String[] args){
		int size = 1024*1024; // 1MB
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
