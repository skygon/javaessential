package InsideJVM;

import java.net.URL;

import static java.lang.System.*;

public class InspectClassLoader {
	ClassLoader loader = getClass().getClassLoader();
	
	public void printSystemProperties(){
		out.println(getProperty("java.ext.dirs"));
	}
	
	public void getResource(){
		System.out.println("Class loader is " + loader);
		System.out.println(System.getProperty("java.class.path"));
		URL res = loader.getResource("mysql-connector.jar");
		System.out.println("Find resource url is " + res);
		
	}
	
	public void loadClass(String name) throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		// Each Class has only one corresponding Class object in JVM.
		System.out.println("Class object address " + InspectClassLoader.class.hashCode());
		Object obj = getClass().getClassLoader().loadClass("InsideJVM.InspectClassLoader").newInstance();
		System.out.println("Same class object: " + (obj.getClass() == InspectClassLoader.class));
		
		// Class<?> object's class is ???
		Class<?> s = getClass().getClassLoader().loadClass("InsideJVM.InspectClassLoader");
		System.out.println(s.getClass()); // output: java.land.Class
		
		System.out.println("class loader hashcode " + getClass().getClassLoader().hashCode());
	}
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		InspectClassLoader ICL = new InspectClassLoader();
		ICL.printSystemProperties();
		ICL.loadClass("InsideJVM.InspectClassLoader");
	}
}
