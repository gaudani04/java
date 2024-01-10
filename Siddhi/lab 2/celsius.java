import java.util.Scanner;
public class celsius{
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Convert fahrenhit to celsius");
	System.out.println("Enter F:");
	double f=sc.nextDouble();
	double c=(((f-32)*5)/9);
	System.out.println(c);
}
}