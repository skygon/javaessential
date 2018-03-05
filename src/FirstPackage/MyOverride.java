package FirstPackage;

import static java.lang.System.out;
class Base {
	public int add(int x, int y){
		out.println("In Base class, get " + (x + y));
		return x + y;
	}
}


class Derived extends Base {
	@Override
	public int add(int x, int y){
		out.println("In Deriverd class, get " + (x+2*y));
		return x + 2 * y;
	}
	
	public int add(int x, int y, int z){
		out.println("In Derived class");
		return x + y + z;
	}
}

public class MyOverride {
	public static void main(String[] args){
		Base b = new Base();
		Base d = new Derived();
		Derived d2 = new Derived();
		
		b.add(1, 2);
		d.add(1, 2); // In d, only override methods from derived class are visable.
		d2.add(1, 2, 3);
	}
}
