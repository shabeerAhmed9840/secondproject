package controlst;

public class Even {
	public static void main(String[] args) {
		int sum=0;
		int count=0;
		int count1=0;
		int sum1=0;
		for(int i=1;i<=100;i++)
		if(i%2==0)
		{
			System.out.println("Even"+i);
			sum+=i;
			count++;
		}
		else if(i%2==1)
		{
			System.out.println("odd"+i);
			sum1+=i;
			count1++;
		}
		{
			System.out.println("sum of even"+sum);
			System.out.println("count of even number"+count);
		}
		{
			System.out.println("sum of odd"+sum1);
			System.out.println("count of odd number"+count1);
		}
	
		}

}
