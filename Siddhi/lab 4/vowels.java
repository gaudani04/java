import java.util.Scanner;
public class vowels{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String st=sc.nextLine();
		int vcount=0;
		int ccount=0;

		for(int i=0;i<st.length();i++){
			char ch=st.charAt(i);
			if(ch>='a' && ch<='z'){
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
              vcount++;
			}
			else{
				ccount++;
			}
			}
			

		}
		System.out.println("Vowels:"+vcount);
		System.out.println("consonant:"+ccount);
	}
}