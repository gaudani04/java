import java.util.Scanner;
public class palindrom{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		int rem;
		int sum=0;
        int temp=n;
		while(temp!=0){
			rem=temp%10;
			sum=(sum*10)+rem;
			temp=temp/10;
			

		}
       
		if(sum==n){
			System.out.println("Given Number is palindrom!");
		}
		else{
            System.out.println("Given Number is not palindrom!");
		}
		
	}
}