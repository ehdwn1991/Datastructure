package J00;

import java.util.Scanner;

public class J01 {
		int AskAge(int birthyear){
			int age=2012-birthyear+1;
			System.out.printf("���̴� %d �Դϴ�\n",age);
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
		String agen[]={"����","���","û�ҳ�","û��","�߳�","���"};
		
		for (int i=0;i<100;i++){
			System.out.printf("%d��° ����� �¾ �⵵�� �Է��Ͻÿ�. ",i+1);
			int birth_year = sup.nextInt();
			if (birth_year>2012)break;
			count[ex.AskAge(birth_year)]++;
		}
		for (int i=0;i<count.length;i++){
		System.out.printf("%s�� %d�� �Դϴ�.\n",agen[i],count[i]);
		}
	}

}
