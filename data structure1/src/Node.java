
public class Node {
	int data;
	Node next;
	
	public Node(int data){
		this.data=data;
	}
	public Node(int data, Node next){
		this.data=data;
		this.next=next;
	}
	public Node(){  //데이터가 없는 헤드를 만들기 위해 값이 들어오지않는 노드도 정의해 준다.
		
		
	}

}
