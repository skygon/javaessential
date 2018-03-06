package Generics;

import java.util.LinkedList;
import java.util.List;

class Node<T> {

    public T data;

    public Node(T data) { this.data = data; }

    public void setData(T data) {
        System.out.println("Node.setData");
        this.data = data;
    }
}

class MyNode extends Node<Integer> {
    public MyNode(Integer data) { super(data); }

    public void setData(Integer data) {
        System.out.println("MyNode.setData");
        super.setData(data);
    }
}


public class GenericsGeneral {
	public static void main(String[] args){
		MyNode mn = new MyNode(5);
		Node n = mn;            // A raw type - compiler throws an unchecked warning
		n.setData("Hello");     
		Integer x = mn.data;    // Causes a ClassCastException to be thrown.
	}
}
