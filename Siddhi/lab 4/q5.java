// Write a program to find length of string and print second half of the string.
import java.util.Scanner;
public class q5{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string:");
		String st=sc.nextLine();
        System.out.println(st.length());
        int len=st.length();
        int halflen=len/2;
        System.out.println(st.subString(halflen));
}
	}
