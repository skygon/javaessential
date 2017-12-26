package FirstPackage;

public enum MyEnum {
	APPLE,
	ORANGE,
	BANANA;
	
	public static void main(String args[]) {
		for (MyEnum e : MyEnum.values()) {
			System.out.println(e.ordinal());
			System.out.println(e.toString());
		}
	}
}
