package Reflection;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import FirstPackage.Tutorial;

public class MyReflection {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		Tutorial t = new Tutorial();
		Class<?> cls = t.getClass();
		Method m = cls.getDeclaredMethod("add", new Class[]{int.class, int.class});
		m.setAccessible(true);
		int r = (int) m.invoke(t, 1,2);
		System.out.println("result is " + r);
	}
}
