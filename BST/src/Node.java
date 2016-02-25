
public class Node {
	int data;
	Node right;//rightchild
	Node left; // leftchild
	Node parent;
	int count;
	
	public Node(int data,Node parent){
		this.data=data;
		left=null;
		right=null;
		this.parent=parent;
		
	}
	public int picdata(){
		return data;}
	void left(Node left){
		this.left=left;	
	}
	void right(Node right){
		this.right=right;
	}
	
	
}
