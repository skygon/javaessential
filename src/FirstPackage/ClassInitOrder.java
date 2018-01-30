package FirstPackage;

public class ClassInitOrder {
	private int flag = 0;
	public static int num = 0;
	
	// static block
	static {
		System.out.println("This is static initialize block");
		num = 10;
	}
	
	// instance block
	{
		System.out.println("This is instance initialize block");
		flag = 1;
		num = 20;
	}
	
	public ClassInitOrder(){
		System.out.println("This is constructor method");
		num = 30;
	}
	
	public int getFlag(){return flag;}
}
