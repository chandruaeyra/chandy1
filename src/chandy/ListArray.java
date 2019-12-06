package chandy;

import java.util.*;


public class ListArray {
	public static void main(String[] args) {
		
		//QUESTION 4.1
		List<Integer> a = new ArrayList<>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(90);
		a.add(10);
		a.add(10);
		a.add(40);
		a.add(50);
		int i = a.size();
		System.out.println(i);
		
		//QUESTION 4.2
		List<Integer> b = new LinkedList<>();
		b.add(100);
		b.add(200);
		b.add(300);
		b.add(400);
		b.add(500);
		b.add(600);
		b.add(700);
		
		int jj = b.size();
		System.out.println(jj);
		
		
		//QUESTION 4.3
		
		List<Integer> c = new Vector<>();
		c.add(105);
		c.add(205);
		c.add(305);
		c.add(405);
		c.add(505);
		c.add(605);
		c.add(705);
		c.add(805);
		System.out.println(c.size());
		
			
		
	}

}
