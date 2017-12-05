package Multithreading;

import java.lang.Thread;
import static java.lang.System.out;

class MyThread extends Thread{
	@Override
	public void run() {
		try {
			out.println("Child/ Current thread id: " + Thread.currentThread().getId());
		}catch (Exception e) {
			out.println("Run MyThread error");
		}
	}
}

public class DemoBasic {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		out.println("Current status " + mt.getState());
		//mt.start();
		mt.run();
		out.println("Current status " + mt.getState());
		try {
			mt.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		out.println("Current status " + mt.getState());
		out.println("Main thread id: " + Thread.currentThread().getId());
	}
}
