package collectionss;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Arraylisttest {
public static void main(String[] args) {
	List <Integer>li=new ArrayList<Integer>();
	li.add(10);
	li.add(20);
	li.add(30);
	li.add(40);
	li.add(50);
	li.add(10);
	li.add(10);
	li.add(70);
	
	
	//for loop
	for (int i = 0; i < li.size(); i++) {
		System.out.println(li.get(i));
	}
	
	//enhaced for loop
	for (Object x : li) {
		System.out.println(x);
	}
	
	
	List<Integer> si=new LinkedList<Integer>();
	
	si.add(100);
	si.add(200);
	si.add(300);
	si.add(10);
	si.add(500);
	si.add(10);
	si.add(700);
	
	//adding variable in si
	si.addAll(li);
	System.out.println(si);
	
	
	//finding size
	int s1=si.size();
	System.out.println(s1); 
	
	
	//finding comman value
	si.retainAll(li);
	System.out.println(si);
	
			
	//removing comman value
si.removeAll(li);
System.out.println(si);
	
	
	
}
}
