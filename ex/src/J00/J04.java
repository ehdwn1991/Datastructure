package J00;

import java.util.Scanner;

public class J04 {
		int CalcDate(int month, int day){
			int monthdays[] = {31,28,31,30,31,30,31,31,30,31,30,31};
			int dayc=0;
			if (month>12||day>monthdays[month-1]){
				System.out.println("잘못 입력하셨습니다.");
			}
			else for (int i=0;i<month-1;i++)dayc+=monthdays[i];
			return dayc+day;
			}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		J04 ex = new J04();
		@SuppressWarnings("resource")
		Scanner sup = new Scanner(System.in);
		int day_count[]= new int[2];
		int date[][] = new int[2][2];
		System.out.print("첫번째 날짜를 입력하시오. (월 일) ");
		date[0][0] = sup.nextInt(); date[0][1]= sup.nextInt();
		System.out.print("두번째 날짜를 입력하시오. (월 일) ");
		date[1][0] = sup.nextInt(); date[1][1]= sup.nextInt();
		for (int i=0;i<day_count.length;i++)day_count[i]=ex.CalcDate(date[i][0], date[i][1]);
		int days=Math.abs(day_count[0]-day_count[1]);
		System.out.printf("두 날짜의 간격은 %d일 입니다.\n",days);
		}
	}
