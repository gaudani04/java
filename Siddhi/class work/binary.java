import java.util.Scanner;
public class binary{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int [] a={1,2,3,4,55,66,77,88,99};
		System.out.println("please enter number for search:");
		int n=sc.nextInt();
		int low=0;
		int high=a.length-1;
		int mid=(low+high)/2;
		boolean isFound=false;
		while(n!=a[mid]){
			if(n>a[mid]){
				low=mid;
				mid=(low+high)/2;
				isFound=true;
				break;
			}
			else{
				high=mid;
			    mid=(low+high)/2;
			    isFound=true;
			    break;
			}
		}
		if(isFound){
			System.out.println("found");
		}
        else{
        	System.out.println(" not found");
        }
	}
}