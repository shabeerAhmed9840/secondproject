package userdefine;

import java.util.LinkedHashSet;
import java.util.Set;

public class UserDemo1 {
	public static void main(String[] args) {
		Set <pojo>s=new LinkedHashSet<>();
		pojo p=new pojo();
		p.setId(784864);
		p.setName("shabeer");
		p.setPhno(9600145249l);
		p.setSal(12500.50f);
		pojo p2=new pojo();
		p2.setId(1497239);
		p2.setName("Ahmed");
		p2.setPhno(9840585752l);
		p2.setSal(50000.50f);
		
		s.add(p);
		s.add(p2);
		
	for (pojo x : s) {
		System.out.println(x.getId());
		System.out.println(x.getName());
		System.out.println(x.getSal());
		System.out.println(x.getPhno());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
