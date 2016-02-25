package J00;

public class J08 {
	int Ackermann(int i,int j){
		if(i==0&&j>=0) return j+1;
		else if(i>0&&j==0) return Ackermann(i-1,1);
		else return Ackermann(i-1, Ackermann(i,j-1));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		J08 ex = new J08();
		for(int i=0;i<=3;i++){
			for(int j=0;j<=3;j++){
				System.out.printf("Ackermann(%s, %s) = %d\n",i,j,ex.Ackermann(i,j));
			}
		}
	}

}
