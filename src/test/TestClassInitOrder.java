package test;

import FirstPackage.ClassInitOrder;

public class TestClassInitOrder {
	public static void main(String[] args) throws ClassNotFoundException{
		System.out.println("Start test...");
		
		// static initialize will take when static field is accessed.
		//System.out.println("static number is " + ClassInitOrder.num);
		
		// Class.forName will also trigger static initialize
		//Class<?> cls = Class.forName("FirstPackage.ClassInitOrder");
		//System.out.println("full class name " + cls.getName());
		//System.out.println("static number is " + ClassInitOrder.num);
		
		// Create new instance will trigger all
		ClassInitOrder clsOrd = new ClassInitOrder();
		System.out.println("static number is " + ClassInitOrder.num);
		
	}
}
