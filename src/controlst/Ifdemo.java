package controlst;

import java.util.Scanner;

public class Ifdemo {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the age");
		int age =s.nextInt();
		
		if(age>=18)
		{
			System.out.println("Eleigibel to vote");
		}
		else if (age<=18)
		{
			System.out.println("Not Eleigibel");
		}
	}

}
