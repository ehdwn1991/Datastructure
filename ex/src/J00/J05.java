package J00;

import java.util.Scanner;

public class J05 {
		int CalcParking(int start_h,int start_m,int end_h,int end_m){
			int fee=0;
			fee=((end_h-start_h)*6+(int)Math.ceil((end_m-start_m)*0.1))*500;
			return fee;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		J05 ex = new J05();
		@SuppressWarnings("resource")
		Scanner sup = new Scanner(System.in);
		int total=0;
		int start_h, start_m,end_h,end_m,fee,i;
		for (i=0;i>=0;i++){
			System.out.printf("%d�� ���� ���� ���� �ð� (�� ��) : ", i+1);
			start_h=sup.nextInt();start_m=sup.nextInt();
			System.out.printf("%d�� ���� ���� ���� �ð� (�� ��) : ", i+1);
			end_h=sup.nextInt();end_m=sup.nextInt();
			fee=ex.CalcParking(start_h, start_m, end_h, end_m);
			System.out.printf("���� ��� : %d��\n",fee);
			total+=fee;
			System.out.print("�� �Է��Ͻðڽ��ϱ�?(Y/N)");
			String ch=sup.next();
			if (ch.equalsIgnoreCase("N"))break;
		}
		System.out.printf("�������� %d���� �� ���� ����� %d�� �Դϴ�.\n",i+1,total);
	}	
}
