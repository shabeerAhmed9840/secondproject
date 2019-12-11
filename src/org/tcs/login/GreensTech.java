package org.tcs.login;

public class GreensTech {
	public void greensO(String name) {
		System.out.println("Name of the institue is"+name);
		}
	public void greensO(int num,String mail) {
		System.out.println("Contact number is"+num+"/t"+"Mail id is"+mail);
		}
	public void greensO(char bld,float sal,long strn) {
		System.out.println("blood group is"+bld+"/t"+"salary amount is"+sal+"strength of institues"+strn);
		}
	public static void main(String[]args) {
		GreensTech g=new GreensTech();
		g.greensO("GreensTechinology");
		g.greensO(984058575, "xyz@g,mail.com");
		g.greensO('b', 1250.50f, 9600145249l);
	}
	
			
			
		

}
