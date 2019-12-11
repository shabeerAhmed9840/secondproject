package userdefine;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class usermap {
	public static void main(String[] args) {
		Map<Integer,pojo> m=new LinkedHashMap<>();
		pojo p=new pojo();
		p.setId(1234);
		p.setName("ravi");
		p.setPhno(12345678l);
		p.setSal(12345.564f);
		pojo p2=new pojo();
		p2.setId(45612);
		p2.setName("raja");
		p2.setPhno(789456123l);
		p2.setSal(456789.12f);
		
		m.put(100, p);
		m.put(200, p2);
 
		
		Set<Entry<Integer, pojo>> s = m.entrySet();
		for (Entry<Integer, pojo> x : s) {
			System.out.println(x.getKey());
			System.out.println(x.getValue().getId());
			System.out.println(x.getValue().getName());
			System.out.println(x.getValue().getSal());
			System.out.println(x.getValue().getPhno());
			
			
		}
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
	}

}
