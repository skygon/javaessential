package FirstPackage;

public class MyClassObject {
	
	public static void main(String[] args) {
		String s = "helllo my class";
		Class<?> cls = s.getClass();
		System.out.println("name: " + cls.getName());
		System.out.println("Canonical name: " + cls.getCanonicalName());
		System.out.println("Modifiers: " + cls.getModifiers());
		System.out.println("Simple name: " + cls.getSimpleName());
		System.out.println("Type name: " + cls.getTypeName());
		System.out.println("cls'class name: " + cls.getClass());
		Boolean ret = cls.isInstance(s);
		
	}
}
