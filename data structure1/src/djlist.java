
public class djlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SLinkedList sl = new SLinkedList();
		
		sl.add(2);
		sl.add(3);
		sl.add(5);
		sl.add(6);
		sl.add(7);
		sl.showlist();   //2~7까지의 숫자를 삽입후에 모든 노드 들을 보여줍니다.
		sl.insert(1,1);  // 1번째 자리 즉 현재 2가 들어있는 1번째 노드에 1을 삽입합니다.
		sl.showlist();
		sl.insert(4,4); //현재 5가 있는 4번째 자리에 4를 삽입합니다.
		sl.showlist();
		sl.delete(1);   // 현재 1번 째 자리인 1을 삭제합니다.
		sl.showlist();
		sl.delete(6);  //6번째 자리인 7을 삭제합니다.
		sl.showlist();
		sl.showdata(4);  //현재 나열된 숫자  2 3 4 5 6 에서 4번째 자리인 5를 삭제합니다.
		sl.showlist();
	}

}
