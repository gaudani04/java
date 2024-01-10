import java.util.Scanner;
public class q1{
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter Total");
	double total=sc.nextDouble();
	System.out.println("Enter marks of 5 subject:");
	
	
	System.out.println("Enter s1:");
	int s1;
	if( int s1<0 &&  s1>30){
		System.out.println("Please Enter s1:");
	}
	 s1=sc.nextInt();
	System.out.println("Enter s2:");
	int s2=sc.nextInt();
	System.out.println("Enter s3:");
	int s3=sc.nextInt();
	System.out.println("Enter s4:");
	int s4=sc.nextInt();
	System.out.println("Enter s5:");
	int s5=sc.nextInt();
	
    double per=((s1+s2+s3+s4+s5)*100)/(total);
    System.out.println(per);
    if(s1>=12 && s2>=12 && s3>=12 && s4>=12 && s5>=12 ){
     if(per>=60){
    	System.out.println("First class");

    }
    else if(per>50){
    	System.out.println("second class");
    }
    else if(per>40){
    	System.out.println("Third class");
    }
    }
    else{
    	System.out.println("Fail");
    }
	}
}
