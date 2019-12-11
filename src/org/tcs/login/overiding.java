package org.tcs.login;

public class overiding {
	public void empId(int id,String name ) {
		System.out.println("Employee id is"+id+"/t"+"Employee name is"+name);
		}
	public void empId(float sal,String loc,long num) {
		System.out.println("my salary is"+sal+"my salary is"+"my phone number"+num);
		}
	public static void main(String[] args) {
		overiding o=new overiding();
		
	o.empId(1234, "shabeer ahmed");
	o.empId(1200.57f, "chennai", 9600123456l);
	
	}

}
