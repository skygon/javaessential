package FirstPackage;

public class MyFinal {
	final int x;
	private int y;
	static final int z;
	
	// static final must be init in static block
	static {
		System.out.println("static block");
		z = 1;
	}
	
	// instance block
	{
		System.out.println("instance block");
	}
	
	//private MyFinal(){
	//final MyFinal() { // constructor can not be declared as final
	MyFinal() {
		System.out.println("in constructor");
		x = 10;
		y = 20;
	}
	
	
	public static void main(String[] args){
		int x = MyFinal.z;
		MyFinal f = new MyFinal();
	}

}


class test {
	public static void main(String[] args){
		// MyFinal f = new MyFinal(); // compile error.
	}
}