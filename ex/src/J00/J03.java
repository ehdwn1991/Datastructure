package J00;

import java.util.Scanner;

public class J03 {
		byte AskWater(double degree){
			if (degree<25)return 0;
			else if (degree<40)return 1;
			else if (degree<80)return 2;
			else return 3;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		J03 ex = new J03();
		@SuppressWarnings("resource")
		Scanner sup = new Scanner(System.in);
		double degrees[] = new double[10];
		String degree_name[] = {"냉수","미온수","온수","끓는물"};
		int count[] = {0,0,0,0};
		for (int i=0;i<degrees.length;i++)
		{
			System.out.printf("%d번 물의 온도를 입력하시오. ",i+1);
			degrees[i] = sup.nextDouble();
			if (degrees[i]<0){
				System.out.print("잘못입력하셨습니다.\n");
				i--;
			}
		}
		for (int i=0;i<degrees.length;i++){
			System.out.printf("%d번 물의 온도는 %.1f도 입니다.\n",i+1,degrees[i]);
			count[ex.AskWater(degrees[i])]++;
		}
		for (int i=0;i<count.length;i++)
		{
			System.out.printf("%s 입력 횟수 : %d\n",degree_name[i],count[i]);
		}
	}

}
