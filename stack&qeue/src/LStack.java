
public class LStack {
	SNode top;
	int size = 0;
	
	void Push(char data){   //Ǫ���� ���ؼ� ���ÿ� ���� ����
		SNode temp = top;
		SNode newSNode = new SNode(data);
		newSNode.next = temp;
		top = newSNode;
		++size;
		//System.out.println("             "+top.data);
	}
	
	char Top() throws IllegalStateException{  //ž���� ���� ���� ���� ������ִµ� ������ ��������� ���� ���
		SNode temp = top;
		char s = temp.data;
		if(size ==0) throw new IllegalStateException("Top Empty");
		
		//System.out.println(this.top.data);
		return s;
	}
	
	char Pop(){  //���� ���� ���ÿ������� ����. ���� ������ ��������� Empty ���
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
	
	public boolean isEmpty(){  //Isempty�� ���� ž�� ��������� true �ƴϸ� false ���
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


