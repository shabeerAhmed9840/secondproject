package collectionss;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class list {
	public static void main(String[] args) {
		//ArrayList
		List<Integer> li=new ArrayList<Integer>();
		
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(120);
		li.add(60);
		li.add(10);
		li.add(80);
		
		//adding a value based on index
		li.add(5, 100);
		System.out.println(li);
		//removing a value based on index
		li.remove(5);
		System.out.println(li);
		
		li.set(5, 001);
		System.out.println(li);
		
		boolean b=li.contains(100);
		System.out.println(b);
		//finding index value 
		int i=li.indexOf(40);
		System.out.println(i);
		//finding value of last index
		int i2=li.lastIndexOf(10);
		System.out.println(i2);
		
		
		//LinkedList
		List<Integer>si=new LinkedList<Integer>();
		System.out.println(si);
		
		boolean b2=si.isEmpty();
		System.out.println(b2);
		
		
		si.addAll(li);
		si.add(200);
		si.add(300);
		si.add(400);
		
		System.out.println(si);
		
		int i3=si.size();
		System.out.println(i3);
		
		
        
        si.removeAll(li);
        System.out.println(si);
        
        //for(int s=0;s<=li.size();s++) {
        //System.out.println(li.get(s));}
		for(Integer x:li) {
		System.out.println(x);}
		
		
		
		
		
		
				
		
		
		
		
		
		
		
		
		
		
	}

}
