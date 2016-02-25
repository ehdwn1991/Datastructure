import java.awt.List;



public class DCLinkedList {
	private Node head;    ///return insert
	private Node tail;
	private int count;
	public DCLinkedList()
	{
		head = new Node(0);
		count = 0;
	}
	private class Node
	{
		int data;
		Node next;
		Node prev;
		Node(int input){
			this.data=input;
		}
	}
/*	
	public int recursionInsert(int size){
		insert li = new insert();
		
		if(size==0)
			return 0;
	
		else if(size!=0)

			
		return size;
	
	}
*/
	void add(int input){
		Node temp = head;
		for(int i=0; i<count;i++){
			temp = temp.next;
		}
		
		temp.next= new Node(input);
		Node temp2 = temp.next;
		head.next = temp.next;
		temp.next = temp;
		temp.prev = temp;
		count++;}
	
	
	public void insert(int position, int input)
	{
		Node node = new Node(input);
		if(count == 0)
		{
			head.next = node;
			node.next = node;
			node.prev = node;
		}
		else
		{
					
				Node temp = head;
				for(int i = 1; i < position; i++)
				{
					temp = temp.next;
				}
				
					Node temp2 = temp.next;
					temp.next= node;
					node.next = temp2;
					node.prev = temp2.prev;
					temp2.prev= node;
				
		}
		
		count++;
	}
	
	
	
	public void delete(int position)
	{
		if(position == 1)
		{
			head.next = head.next.next;
			tail.prev.next = head.next;
			head.prev = tail.prev;
		}
		else
		{
			Node node;
			if(count / 2 < position)
			{
				node = tail.prev;
				for(int i = 0; i < count - position; i++)
				{
					node = node.prev;
				}
				node.next.prev = node.prev;
				node.prev.next = node.next;
			}
			else
			{
				node = head.next;
				for(int i = 1; i < position; i++)
				{
					node = node.next;
				}
				node.next.prev = node.prev;
				node.prev.next = node.next;
			}
			if(node.next == null)
			{
				tail.prev = node;
				node.next = head.next;
			}
		}
		count--;
	}
	
	public void print_list_backward(int position)
	{
		Node node;
		if(count / 2 < position)
		{
			node = tail.prev;
			for(int i = 0; i < count - position; i++)
			{
				node = node.prev;
			}
		}
		else
		{
			node = head.next;
			for(int i = 1; i < position; i++)
			{
				node = node.next;
			}
		}
		for(int i = 0; i < count; i++)
		{
			System.out.print(node.data + ", ");
			node = node.prev;
		}
		System.out.println("");
	}
	
}