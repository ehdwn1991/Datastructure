package recursive;
public class SLinkedList {
	Node head = new Node();
	int count=0;
	void add(int data){
		Node temp = head;
		Node newnod = new Node(data);
		if(count ==0){
			temp.next = newnod;
			head = newnod;
		}
		else{
		for(int i=1; i<count;i++){
			temp = temp.next;}
		temp.next= new Node(data);}
		count++;}
	void insert(int data, int position){
			Node temp = head;
			for(int i=1; i<position;i++)  //position-1
				temp =temp.next;
		    Node newNode = new Node(data);
		    newNode.next = temp.next;
		    temp.next = newNode; 
			count++;
	}
	void delete(int position){
		Node temp = head;
		for(int i=1; i<position-1;i++)  //position-1
			temp =temp.next;			
		temp.next = temp.next.next;
		count--;		
	}	
	void showlist(){
		for(Node i=head; i!=null;i = i.next){
			System.out.print(i.data + " ");
		}
		System.out.println();
	}
	void showdata(int position){
		Node temp = head;
		for(int i=1; i<position;i++)  
			temp =temp.next;
		temp.next= temp.next;
		System.out.print(temp.next.data+" \n");
	}	
	public int recurinsert(int num){
		if(num==0){
			System.out.println("recursive insert result");
			return 0;}
		else{
			int k = (int)(num*5);
			add(k);}		
		return recurinsert(num-1);
	}
	public int recurdelete(int num){
		if(num==0){
			System.out.println("recursive delete result");
			return 0;}
		else{
			delete(count);
		}
	return recurdelete(num-1);
		
	}
}
