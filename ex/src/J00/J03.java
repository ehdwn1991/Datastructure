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
		String degree_name[] = {"�ü�","�̿¼�","�¼�","���¹�"};
		int count[] = {0,0,0,0};
		for (int i=0;i<degrees.length;i++)
		{
			System.out.printf("%d�� ���� �µ��� �Է��Ͻÿ�. ",i+1);
			degrees[i] = sup.nextDouble();
			if (degrees[i]<0){
				System.out.print("�߸��Է��ϼ̽��ϴ�.\n");
				i--;
			}
		}
		for (int i=0;i<degrees.length;i++){
			System.out.printf("%d�� ���� �µ��� %.1f�� �Դϴ�.\n",i+1,degrees[i]);
			count[ex.AskWater(degrees[i])]++;
		}
		for (int i=0;i<count.length;i++)
		{
			System.out.printf("%s �Է� Ƚ�� : %d\n",degree_name[i],count[i]);
		}
	}

}
