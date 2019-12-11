package org.tcs.login;

public class overiding2 extends overiding{
	@Override
	public void empId(int id, String name) {
		System.out.println("Employee id is"+id+"/t"+"Employee name is"+name);
		}
	@Override
	public void empId(float sal, String loc, long num) {
		System.out.println("my salary is"+sal+"my salary is"+"my phone number"+num);
		}
	public void compId(int coid) {
		System.out.println("com[pany id is"+coid); 
		}
	public static void main(String[] args) {
		overiding2 o=new overiding2();
		o.compId(123);
		o.empId(007, "Ahmed");
		o.empId(1252.55f,"chennai", 9600145240l);
	}

}
