package InsideJVM;

import java.net.URL;

public class InspectClassLoader {
	public void getResource(){
		ClassLoader loader = getClass().getClassLoader();
		System.out.println("Class loader is " + loader);
		System.out.println(System.getProperty("java.class.path"));
		URL res = loader.getResource("E:\\Java\\project\\javaessential\\resources\\mysql-connector.jar");
		System.out.println("Find resource url is " + res);
	}
	
	public static void main(String[] args){
		InspectClassLoader ICL = new InspectClassLoader();
		ICL.getResource();
	}
}
