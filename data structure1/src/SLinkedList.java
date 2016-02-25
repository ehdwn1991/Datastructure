
public class SLinkedList {
	Node head = new Node();
	int count=0;
	void add(int data){
//		if(head==null) {
//			head.next = new Node(data);
//			
//		}
//		else{
		Node temp = head;
		for(int i=0; i<count;i++){
//			if(temp.next==null)
//				temp.next= new Node(data);
			temp = temp.next;
		}
		temp.next= new Node(data);
//		}
		count++;
	}
	
	void insert(int data, int position){
		
		/*if(position==0){
			add(data);
			Node nNode = new Node(data);
			nNode.next = head;
			head = nNode;
			count++;}*/
			Node temp = head;
			for(int i=1; i<position;i++)  //position-1
				temp =temp.next;
			/*Node temp1 = temp;
			Node temp2 = temp1.next;*/
		    Node newNode = new Node(data);
		    newNode.next = temp.next;
		    temp.next = newNode; 
			/*temp1.next = newNode;*/
			count++;
		
			
		
	}
	
	
	void delete(int position){
//		if(position ==0){
//			Node temp = head;
//			Node temp1 = temp;
//			Node temp2 = temp1.next;
//			head.next = temp2;
//			Node temp1.next= null;
//		}
//		
		Node temp = head;
		for(int i=1; i<position;i++)  //position-1
			temp =temp.next;
			
		temp.next = temp.next.next;
		
		
		
		
/*		Node temp1 = temp;
		Node temp2 = temp1.next;
		Node temp3 = temp2.next;
		
		
		temp1.next=temp3;
		temp2.next= null;
		*/
		count--;
		
		
		
		
	}
	
	void showlist(){
		for(Node i=head.next; i!=null;i = i.next){
			System.out.print(i.data + " ");
		}
		System.out.println();
		// for(int i; i<count; i++){
		//       System.out.println(i.data);                     }
	}
	
	void showdata(int position){
		Node temp = head;
		for(int i=1; i<position;i++)  
			temp =temp.next;
		temp.next= temp.next;
		System.out.print(temp.next.data+" \n");
		
		
		
	}
	
}
