package J00;

import java.util.Scanner;

public class J07 {
		int poweroftwo(int n){
			if(n==0)return 1;
			else return 2*poweroftwo(n-1);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		J07 ex = new J07();
		Scanner sup = new Scanner(System.in);
		int n;
		while(true){
			System.out.print("���ڸ� �Է��Ͻÿ�. (0.����) : ");
			n=sup.nextInt();
			if(n==0)break;
			System.out.printf("2�� %s���� : %s\n",n,ex.poweroftwo(n));
		}
	}
}
