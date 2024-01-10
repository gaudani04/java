import java.util.Scanner;
public class max3{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a");
		int a=sc.nextInt();
		System.out.println("Enter b");
		int b=sc.nextInt();
		System.out.println("Enter c");
		int c=sc.nextInt();

		//int max=Math.max(Math.max(a,b),c);
		//System.out.println("max num:"+max);
		if(a>b){
			if(a>c){
				System.out.println("a is max");
			}
			else{
				System.out.println("c is max");
			}
		}
			else if(b>c){
				System.out.println("b is max");
			}

			else{
				System.out.println("c is max");
			}

			
		

	}
}

	
