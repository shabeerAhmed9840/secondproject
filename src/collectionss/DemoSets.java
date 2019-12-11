package collectionss;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class DemoSets {
	public static void main(String[] args) {
		List<Integer> li=new ArrayList<Integer>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		li.add(10);
		li.add(10);
		li.add(70);
		
		
		
		
		
		
		
		
		
		Set<Integer> si=new HashSet<Integer>();
		
		si.add(10);
		si.add(20);
		si.add(30);
		si.add(40);
		si.add(50);
		si.add(60);
		si.add(10);
		si.add(20);
		{
			System.out.println(si);
		}
		
		Set<Integer> s1=new LinkedHashSet<Integer>();
		
		s1.add(70);
		s1.add(80);
		s1.add(90);
		
		s1.addAll(li);
		System.out.println(s1);
		
		//int i= s1.size();
		//System.out.println(i);
		
		//boolean b=s1.containsAll(si);
				//System.out.println(b);
		
		
		for(Integer x:s1)
		{
			System.out.println(x);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
