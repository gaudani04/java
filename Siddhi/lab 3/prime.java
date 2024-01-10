import java.util.Scanner;
public class prime{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter a number");
		int n=sc.nextInt();
		int count=0;
		for(int i=2;i<=n-1;i++){
			if(n%i==0){
				count=1;
				break;
			}
		}
		if(count==0){
			System.out.println(n+"is prime");
		}
		else{
			System.out.println(n+"is not prime");
		}
	}
}