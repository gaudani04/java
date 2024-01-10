import java.util.Scanner;
public class q1{
	public static void main(String[] args) {
		//print sum using cml
		/*int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		System.out.println(a+b);
*/
		// print sum using scanner
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter a:");
        int a=sc.nextInt();
        System.out.println("please enter b:");
        int b=sc.nextInt();
System.out.println(a+b);
	}
}