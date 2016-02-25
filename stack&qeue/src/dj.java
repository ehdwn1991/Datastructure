

public class dj {
	Queue front; 	
	Queue rear;
	int size=0;
	LStack st = new LStack();
	void putstring(String a){
		char []k = a.toCharArray();
		char q;
		for(int i=0;i<k.length;i++){
			q=k[i];
			Enqueue(q);}
		System.out.println("Print all queue");
		 PrintQ();
		removeall();
	}
	void Enqueue(char data){
		Queue newqu = new Queue(data);
		Queue temp =front;
		if(size==0){
		front = newqu;
		rear = newqu;   //rear is not  next to front
		}
		else{
			for(int i =1;i<size;i++)
				temp= temp.next;   //1(front) 2 3(rear) size=3 newqu
			temp.next= newqu;
			rear=newqu;
		}
		++size;
	//System.out.print(newqu.data);
	}
	
	char Dequeue(){
		Queue temp = front;
		Queue temp1 = front;
		char nq;
	/*if(front == null){
		System.out.println("error");
		return temp1.data;
	}*/
	if(size ==1){
		
		nq=temp.data;
		front= null;
		rear=null;
		--size;
		 return nq;
		}
	else if(size!=0){
		nq=temp.data;
		temp=temp.next;
		front= temp;
		--size;
		 return nq;}
	else{		
		System.out.println("error");

	}
	
	/*else if(size==0){
			qu.front=qu.rear;
			return 0;}*/
	return nq=temp1.data;
	}

	void removeall(){ //다 지우면서 여는 괄호면 스택에 넣음
	
	while(empty()==false){
		char c = Dequeue();
		/*if(qu.empty()){
			//st.Push(c);
			if(st.size!=0){
				System.out.println("Not match");}
		     System.out.println("Queue is empty");}*/
			if(c=='('){
				st.Push(c);
				}
		
			else if(c==')'){
				if(empty()==true && st.isEmpty()==true){
				/*	System.out.println("Error because stack is Eampty");
					System.out.println();*/
						return;}
				else{
					char s= st.Pop();}
					/*if(s==c){
						System.out.println("error");}
					else
						System.out.println("ok");*/
					}
		}

		if(empty()==true && st.isEmpty()==true){  // 큐도 비고 스택도 비어있을때
			System.out.println("Okay");
			System.out.println();}
		else{
			System.out.println("Not correct because stack is Eampty");
			System.out.println();
			return;}
		
	}
	
	
	void PrintQ(){
		Queue temp= front;
	/*	for(int i =1;i<size;++i){
			temp=temp.next;
		System.out.print(" "+temp.data);}*/	
		System.out.print(" ");
		for(Queue i = front;i!=null;i=i.next)
			System.out.print(i.data);
		System.out.println();
	}	
	
	public boolean empty(){
		if(front ==null)
			return true;
		else
		return false;
	}
}
