	package J00;

public class J10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		J06 ex = new J06();
		
		for(int i=1;i>0;i++){
			System.out.printf("%s번째 비율 (%s / %s) : %.6f\n",i+1,ex.fibonacci(i+2),ex.fibonacci(i+1),(float)ex.fibonacci(i+2)/ex.fibonacci(i+1));
			if(i!=1&&(Math.abs((float)ex.fibonacci(i+1)/ex.fibonacci(i)-(float)ex.fibonacci(i+2)/ex.fibonacci(i+1))<0.000001))break;
		}
	}
}