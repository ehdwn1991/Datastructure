package J00;

import java.util.Scanner;

public class J09 {
	int power(int num1, int num2){
		if(num2==0) return 1;
		else if(num2==1) return num1;
		else if(num2>1&&num2%2==0) return power(num1,num2/2)*power(num1,num2/2);
		else return power(num1,num2/2)*power(num1,num2/2)*num1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		J09 ex = new J09();
		Scanner sup = new Scanner(System.in);
		
		System.out.print("���� 2���� �Է��Ͻÿ�. ");
		int n1=sup.nextInt();int n2=sup.nextInt();
		
		System.out.printf("%s�� %s���� %s �Դϴ�.\n",n1,n2,ex.power(n1, n2));
	}

}
