package chandy;

import java.util.*;

public class ArrayIndex {
	public static void main(String[] args) {
		
		//QUESTION 5.1: Description : Get the first index value of 10  Input:  List = 10,20,30,90.
		List<Integer> li = new ArrayList<>();
		li.add(10); li.add(20); li.add(30); li.add(90); 
		System.out.println(li);
		
		int ind = li.indexOf(10);
		System.out.println("index value of 10 : "+ind);
		
		//QUESTION 5.2: Get the last index value of 10. Input:   List = 10,20,30,90,10,10,40,50
		List<Integer> dd = new ArrayList<>();
		dd.add(10); dd.add(20); dd.add(30); dd.add(90); dd.add(10); dd.add(10); dd.add(40); dd.add(50);
		System.out.println("\n"+dd);
		
		System.out.println("Last index value of 10: "+ dd.lastIndexOf(10));
		
		System.out.println("\nIndex value of 50: "+ dd.indexOf(50));
		
		//Get the each index value of 10 present in below list 
		for (int i = 0; i < dd.size(); i++) {
			
			if (dd.get(i)==10) {
				System.out.println(i);
				}
		}
		
		
	}

}
