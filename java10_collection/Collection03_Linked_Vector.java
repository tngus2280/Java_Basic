package java10_collection;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Collection03_Linked_Vector {
	public static void main(String[] args) {
		
		List llist = new LinkedList();
		llist.add(10);
		llist.add(20);
		llist.add(30);
		
		System.out.println(llist);
		
		System.out.println("------------");
		
		List v = new Vector();
		
		v.add("A");
		v.add("B");
		v.add("C");
		
		System.out.println(v);
	}
}
