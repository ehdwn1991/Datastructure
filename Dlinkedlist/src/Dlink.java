
public class Dlink {
	Node head = new Node();
	int count=0;
	void add(int data){
		
		Node temp = head;
		Node temp1=head;
		Node newnod = new Node(data);
		if(count ==0){
			temp.next = newnod;
			newnod.prev=temp;
			head = newnod;
		}
		else{
		for(int i=1; i<count;i++){
			temp = temp.next;}
		temp.next= newnod;
		newnod.prev=temp;
		newnod.next=head;
		head.prev=newnod;
		
		}
		count++;
		System.out.print(data+" ");
	}
	void insert(int data, int position){
			System.out.println("Insert data in position");
			Node temp = head;
			for(int i=1; i<position-1;i++)  //position-1
				temp =temp.next;
		    Node newNode = new Node(data);
		    newNode.next = temp.next;
		    temp.next.prev = newNode;
		    temp.next = newNode;
		    newNode.prev=temp; 
			count++;
			System.out.println("position : "+position+" data : "+data);
	}
	void delete(int position){
		Node temp = head;
		Node temp1;
		Node temp2;
		for(int i=1; i<position-1;i++)  //position-1
			temp =temp.next;
		temp1=temp.next;
		temp2=temp1;
		temp2=temp1.next;
		temp.next = temp2;
		temp2.prev= temp;
		temp1.prev=null;
		temp1.next=null;
		
		count--;		
	}	
	void showlist(){
		System.out.println("Show all list");
		Node temp=head;
		for(int i=0;i<count;i++){
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	void reverseshowlist(int position){
		Node temp = head;
		Node temp1;
		for(int i=0;i<position;i++){
			temp=temp.next;
		}
		temp1= temp;
		for(int i=0;i<count;i++){
			System.out.print(temp1.data+" ");
			temp1=temp1.prev;}
		
		System.out.println();
	}
	void showdata(int position){
		//System.out.println("Showdata in position");
		Node temp = head;
		for(int i=1; i<position;i++)  
			temp =temp.next;
		System.out.print(temp.data+" ");
	}
	void showposition(int position){
		System.out.println("Show list from position to others");
		for(int i=position;i<count+position;i++)
			showdata(i);
		System.out.println();
	}
	void reverseshowposition(int position){
		System.out.println("In reverse Show list from position to others");
			reverseshowlist(position);
	
	}
	void mrandinput(int num){
		System.out.println("Insert Random for"+num+" : ");
		int k,l,j=0;
		for(int i=0;i<num;i++){
			k= (int)(Math.random()*10);
			l=(int)(k%(Math.random()*10));
			j= (int)(l+k);
			add(j);
		}
		jump();
	}
	
	void jump(){
		System.out.println();
	}
	void space(){
		System.out.print(" ");
		
	}
	}
