package inter;



public class Child implements Parent1,Parent2{
	
	public void childAge() {
		System.out.println("child age is 16");

	}

	@Override
	public void SchoolName() {
		System.out.println("School name is FMHSS");
		
	}

	@Override
	public void SchoolLoc() {
		System.out.println("school locatedin chennai");
		
	}

	@Override
	public void StudId() {
		System.out.println("student id is 1234");
		
	}

	@Override
	public void studName() {
		System.out.println("student name is raja");
	}
		
		public static void main(String[] args) {
			Child c=new Child();
			c.childAge();
			c.SchoolLoc();
			c.SchoolName();
			c.StudId();
			c.studName();
		
	}

}
