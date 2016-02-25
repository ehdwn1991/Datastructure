package J00;

import java.util.Scanner;

public class J01 {
		int AskAge(int birthyear){
			int age=2012-birthyear+1;
			System.out.printf("나이는 %d 입니다\n",age);
			if (age<7)return 0;
			else if (age<13)return 1;
			else if (age<20)return 2;
			else if (age<30)return 3;
			else if (age<60)return 4;
			else return 5;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sup = new Scanner(System.in);
		J01 ex = new J01();
		int count[]={0,0,0,0,0,0};
		String agen[]={"유아","어린이","청소년","청년","중년","노년"};
		
		for (int i=0;i<100;i++){
			System.out.printf("%d번째 사람의 태어난 년도를 입력하시오. ",i+1);
			int birth_year = sup.nextInt();
			if (birth_year>2012)break;
			count[ex.AskAge(birth_year)]++;
		}
		for (int i=0;i<count.length;i++){
		System.out.printf("%s는 %d명 입니다.\n",agen[i],count[i]);
		}
	}

}
