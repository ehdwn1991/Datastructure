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
			System.out.printf("%d�� �ɻ������� �Է��Ͻÿ�. ",i+1);
			score[i]=sup.nextDouble();
			total+=score[i];
		}
		double max=ex.Max(score);
		double min=ex.Min(score);
		total=total-max-min;
		double average=total/8.0;
		System.out.printf("���� ū ������ ���� ���� ������ ������ 8���� ������ ���� ����� %.1f �Դϴ�.\n",average);
	}

}
