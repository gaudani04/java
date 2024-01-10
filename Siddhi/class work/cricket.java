import java.util.Scanner;
public class cricket{
	public static void main(String[] args) {
		//56=wide
		//66=no ball
		//70=wicket
		Scanner sc=new Scanner(System.in);
		int [][][]runperover={
			{
			{1,56,4,2,66,6},
			{70,4,6,6,2,1}
                   },
                   {
			{1,66,4,2,6,6},
			{1,70,6,70,2,1}
		}
		
		};
		int t=0,wideball=0,noball=0,wicket=0;
		for(int k=0;k<2;k++){
			for(int i=0;i<2;i++){
				for(int j=0;j<6;j++){
					t=t+runperover[k][i][j];
				      if(runperover[k][i][j]==56){
				      	runperover[k][i][j]=1;
				      	t=t+runperover[k][i][j]-56;
				      	wideball++;
				      }
				      if(runperover[k][i][j]==66){
				      	runperover[k][i][j]=1;
				      	t=t+runperover[k][i][j]-66;
				      	noball++;

				      }	
				      if(runperover[k][i][j]==70){
				      	runperover[k][i][j]=0;
				      	t=t+runperover[k][i][j]-70;
				      	wicket++;

				      }
				}
			}
		}
		
        System.out.println("total runs=" +t);
        System.out.println("wideball=" +wideball);
        System.out.println("no ball=" +noball);
        System.out.println("wicket=" +wicket);
	}
}
