
public class m {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dj que = new dj();
		LStack st = new LStack();
		String a1 = "(142+2324)+1414+(14-11)";
		String a2 = "(142+2(32)4+14((1))4+(1(4-11)";
		String a3 = "(142+2324)+1414)+14 ";
		String a4 = "(((((())))()()))((((((()))()))(((())((((()))))))))";
		
		que.putstring(a1);
		que.putstring(a2);
		que.putstring(a3);
		que.putstring(a4);
		
		
		
		
/* 		que.PrintQ();
 
  */

	}

}
