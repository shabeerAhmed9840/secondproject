package controlst;

import java.util.Scanner;

public class oddEven {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Give the input");
		int n=s.nextInt();
		if(n%2==0)
		{
			System.out.println("Even");
		}
		else if(n%2==1)
		{
			System.out.println("odd");
		}
				}

}
