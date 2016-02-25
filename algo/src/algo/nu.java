package algo;
import java.util.Scanner;
public class nu{	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int result=0;
		int c=scan.nextInt();
		
		for(int i=0;i<c;++i){
			
			int n=scan.nextInt();
			int m=scan.nextInt();
			int a=n,b=m;
		        for(int j=1;j<=n;j++){
				      for(int k=1;k<=m;k++){
				                  result +=j*k*a*b;
				                  --b;
				                  System.out.println(result);
				              }
				              --a;
				              b=m;
				          }
			}
	
		
		
		
			
		}
		
		
		
}
