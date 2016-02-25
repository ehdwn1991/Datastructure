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
			System.out.printf("%d번 차량 주차 시작 시각 (시 분) : ", i+1);
			start_h=sup.nextInt();start_m=sup.nextInt();
			System.out.printf("%d번 차량 주차 종료 시각 (시 분) : ", i+1);
			end_h=sup.nextInt();end_m=sup.nextInt();
			fee=ex.CalcParking(start_h, start_m, end_h, end_m);
			System.out.printf("주차 요금 : %d원\n",fee);
			total+=fee;
			System.out.print("더 입력하시겠습니까?(Y/N)");
			String ch=sup.next();
			if (ch.equalsIgnoreCase("N"))break;
		}
		System.out.printf("주차차량 %d대의 총 주차 요금은 %d원 입니다.\n",i+1,total);
	}	
}
