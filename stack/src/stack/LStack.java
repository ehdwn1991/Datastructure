package stack;


public class LStack {
	SNode top = new SNode();
	int size = 0;
	
	void Push(String data){
		SNode temp = top;
		SNode newSNode = new SNode(data);
		newSNode.next = temp;
		top = newSNode;
		++size;
	/*	System.out.print(top.data+' ');
		System.out.println();*/
		
	}
	
	void Top() throws IllegalStateException{
		if(size ==0) throw new IllegalStateException("Empty");
		
		System.out.println(this.top.data);
		
	}
	
	void Pop(){
		if(size ==0)
			System.out.println("Empty");
		else{
		SNode temp = top;
		temp.next = temp.next;
		top = temp.next;
		--size;
		System.out.println(temp.data+' ');}
	}
	
	public boolean isEmpty(){
		if(top==null)
			return true;
		else
			return false;
	}
	
	
	public void clear(){
		if(size == 0)
			System.out.println("Empty");
		else{
			for(int i=0; i<size;i++)
				Pop();
			
		}
			
	}
	
	
	public void printStack(){
		for(SNode i=top; i!=null;){
			if(i.data ==null)
				break;
			System.out.print(i.data + " ");
			i = i.next;
		}
		System.out.println();
	}
	
	
	
	String ppop(){
		String value = null;
		if(size ==0)
			System.out.println("Empty");
		else{
		SNode temp = top;
		temp.next = temp.next;
		top = temp.next;
		--size;
		value = temp.data;}
		
		return value;
	}
	
	
	
	
	
	
}
