import java.util.Scanner;
public class pat{
   public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int arr[]=new int[4];
     int temp;
     System.out.println("Enter elements");
     for(int i=0;i<4;i++){
      arr[i]=sc.nextInt();
     }
     for(int i=0;i<4;i++){
      for(int j=i+1;j<4;j++){
           if(arr[i]>arr[j]){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
           }
      }
     }
     for(int i=0;i<4;i++){
      System.out.print(arr[i]);
     }
     for(int i=0;i<arr.length-1;i+=2){
      temp=arr[i];
      arr[i]=arr[i+1];
      temp=arr[i+1];
     }
     for(int i=0;i<4;i++){
      System.out.println(arr[i]);
     }
   }
}