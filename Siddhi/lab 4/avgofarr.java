import java.util.Scanner;
public class avgofarr{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int []arr={1,7,5,4};
		int sum=0;
		
		System.out.println("elements");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		sum=sum+arr[i];

	
		}
		System.out.println(sum);
		double avg=(double)sum/(arr.length);
		System.out.println(avg);
		

	}
}