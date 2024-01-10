import java.util.Scanner;
public class linear{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int [] a={1,77,3,4,5,99,54,6};
		boolean isFound=false;
		System.out.println("please enter number for search:");
		int n=sc.nextInt();
		for(int i=0;i<a.length;i++){
			if(n==a[i]){
              isFound=true;
              break;
			}
			
		}
		if(isFound){
			System.out.println("found");
		}
		else{
			System.out.println("not found");
		}

}
}