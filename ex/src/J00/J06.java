package J00;

public class J06 {
		int fibonacci(int n){
			if (n==1||n==2)return 1;
			else return fibonacci(n-1) + fibonacci(n-2);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		J06 ex = new J06();
		System.out.println("1���� 20���� �Ǻ���ġ ���� ������ �����ϴ�.");
		for (int i=1;i<21;i++){
			System.out.printf(" %d��° : %d\n",i,ex.fibonacci(i));
		}
	}

}
