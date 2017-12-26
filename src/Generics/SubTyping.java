package Generics;

import java.util.ArrayList;
import java.util.List;

/*
 * The Get and Put Principle: 
 * use an extends wildcard when you only get values out of a structure, 
 * use a super wildcard when you only put values into a structure, 
 * and don’t use a wildcard when you both get and put.
 * */

public class SubTyping {
	public static void main(String[] args) {
		List<Integer> ints = new ArrayList<Integer>(); 
		ints.add(1);
		ints.add(2);
		List<? extends Number> nums = ints; // List<Integer> is sub-type of List<? extends Number>
		// nums.add(1); compile error. 
		// ? extends Number 唯一能确定的事情就是它的父类是 Number。它自身的类型以及它的子类是不确定的
		//所以不能调用nums.add
		
		/*
		 *Why List<Integer> is sub-type of List<? super Integer>?
		 *This is because List<? super Integer> are set(List<Integer>, List<Number>, List<Object>)
		 *The one more restrict is a sub-type. So List<Object> is also a sub-type of List<? super Integer>
		 * */
		List<? super Integer> sints = ints; // OK. List<Integer> is also sub-type of sints
		List<Object> lo = new ArrayList<>();
		sints = lo; //OK. List<Object> is a sub-type of sints
		
		
	}
}
