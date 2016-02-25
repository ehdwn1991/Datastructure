
public class LStack {
	SNode top;
	int size = 0;
	
	void Push(char data){   //푸쉬를 통해서 스택에 값을 삽입
		SNode temp = top;
		SNode newSNode = new SNode(data);
		newSNode.next = temp;
		top = newSNode;
		++size;
		//System.out.println("             "+top.data);
	}
	
	char Top() throws IllegalStateException{  //탑에서 가장 위의 값을 출력해주는데 스택이 비어있으면 에러 출력
		SNode temp = top;
		char s = temp.data;
		if(size ==0) throw new IllegalStateException("Top Empty");
		
		//System.out.println(this.top.data);
		return s;
	}
	
	char Pop(){  //팝을 통해 스택에서값을 뺀다. 또한 스택이 비어있으면 Empty 출력
		SNode temp = top;
		
		char s = temp.data;
		if(size ==0)
			System.out.println("Pop Empty");
		else{
		temp.next = temp.next;
		top = temp.next;
		--size;
		//System.out.println(temp.data+' ');
		}
		return s;
	}
	
	public boolean isEmpty(){  //Isempty를 통해 탑이 비어있으면 true 아니면 false 출력
		if(top==null)
			return true;
		else
			return false;
	}
	
	
	void printStack(){
		for(SNode i=top; i!=null;){
			if(i.data =='0')
				break;
			System.out.print(i.data + " ");
			i = i.next;
		}
		System.out.println();
	}
	



}


