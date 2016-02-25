package J00;

import java.util.Scanner;

public class J02 {
		double Max(double num[]){
			double max=num[0];
			for (int i=1;i<num.length;i++){
				max=Math.max(max, num[i]);
			}
			return max;
		}
		double Min(double num[]){
			double min=num[0];
			for (int i=1;i<num.length;i++)min=Math.min(min,num[i]);
			return min;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		J02 ex = new J02();
		@SuppressWarnings("resource")
		Scanner sup = new Scanner(System.in);
		double score[] = new double[10];
		double total =0;
		for (int i=0;i<score.length;i++){
			System.out.printf("%d번 심사점수를 입력하시오. ",i+1);
			score[i]=sup.nextDouble();
			total+=score[i];
		}
		double max=ex.Max(score);
		double min=ex.Min(score);
		total=total-max-min;
		double average=total/8.0;
		System.out.printf("가장 큰 점수와 가장 작은 점수를 제외한 8개의 점수에 대한 평균은 %.1f 입니다.\n",average);
	}

}
