package arraydemo;

public class Array1 {
	public static void main(String[] args) {
		// to find sum 
		int [] a= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int sum=0;
		for(int i=0;i<a.length;i++){
		sum=sum+a[i];
		}
		System.out.println("sum of array"+sum);
		
		//to find the average
		double avg=sum/a.length;
		System.out.println("the average is "+avg);

}
}
