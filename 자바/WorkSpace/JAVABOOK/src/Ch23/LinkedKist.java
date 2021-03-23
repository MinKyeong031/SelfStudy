package Ch23;

import java.util.LinkedList;

public class LinkedKist {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ml = new LinkedList<String>();
		ml.add("A");
		ml.add("B");
		ml.add("C");
		
		System.out.println(ml);
		
		ml.add(1, "D");
		System.out.println(ml);
		
		ml.addFirst("0");
		System.out.println(ml);
		
		System.out.println(ml.removeLast());
		System.out.println(ml);
	}
}
