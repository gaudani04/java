import java.util.Scanner;
public class calculator3{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a ");
		int a=sc.nextInt();
		System.out.println("Enter b ");
		int b=sc.nextInt();
		System.out.println("addition: "+(a+b));
		System.out.println("subtraction: "+(a-b));
		System.out.println("multiplication: "+(a*b));
		if(b!=0){
		System.out.println("division: "+(a/b));
       }
       else{
       	System.out.println("not divisable");
       }
	}
}