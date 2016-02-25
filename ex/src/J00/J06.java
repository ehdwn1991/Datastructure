package J00;

public class J06 {
		int fibonacci(int n){
			if (n==1||n==2)return 1;
			else return fibonacci(n-1) + fibonacci(n-2);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		J06 ex = new J06();
		System.out.println("1부터 20까지 피보나치 수는 다음과 같습니다.");
		for (int i=1;i<21;i++){
			System.out.printf(" %d번째 : %d\n",i,ex.fibonacci(i));
		}
	}

}
