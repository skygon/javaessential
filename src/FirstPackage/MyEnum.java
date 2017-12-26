package FirstPackage;

public enum MyEnum {
	APPLE  { int apply(){return 10;} },
	ORANGE { int apply(){return 15;} },
	BANANA { int apply(){return 20;} };
	
	// abstract method in enum
	// 特定于常量的方法
	abstract int apply();
	
	public static void main(String args[]) throws InstantiationException, IllegalAccessException {
		// value
		for (MyEnum e : MyEnum.values()) {
			System.out.println(e.ordinal());
			System.out.println(e.toString());
		}
		
		// Object obj = new MyEnum(); //compile error. We can not create instance of enum
		
		// the class
		Class<?> cls = MyEnum.APPLE.getClass();
		System.out.println("MyEnum class: " + cls.getName());
		
		// What about create instance through class object
		// Object obj = cls.newInstance();  // Run time error. InstantiationException will throw.
		
	}
}
