package stack;

public class djStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LStack dj = new LStack();
		dj.Pop();
		dj.Push("2");
		dj.Push("4");
		dj.Push("6");
		dj.Push("8");
		dj.Push("10");
	//	dj.ppop();
		dj.printStack();
		dj.printStack();
		/*dj.Pop();
		System.out.println(dj.ppop());
		dj.Pop();
		dj.Pop();
		dj.Push("1");
		dj.printStack();
		*/

	}

}
