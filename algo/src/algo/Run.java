package algo;
class BST{
	private Node root;
	private boolean search=false;
	
	void insert(int key){
		Node newnode = new Node(key);
		Node pointer;
		boolean insertComplete = false;
		
		if(root==null)
			root = newnode;
		
		else{
			pointer = root;
			
			while (!insertComplete) {
			    if (pointer.getKey() > key) {
			    	if (pointer.getLchild() != null) {
			    		pointer = pointer.getLchild();
				    } else {
				    	 	newnode.setParent(pointer);
				    	 	pointer.setLchild(newnode);
				    	 	insertComplete = true;
				    	 	break;
				     }
			    } else if (pointer.getKey() < key) {
				     if (pointer.getRchild() != null) {	
				    	 pointer = pointer.getRchild();
				     } else {
					    	 newnode.setParent(pointer);
					    	 pointer.setRchild(newnode);
					    	 insertComplete = true;
						     break;
				     }
			    } else {	//트리에 이미 중복되는 노드 존재, 따라서 그냥 종료.
			    	break;
			    }
			}
		}
	}
	void delete(int key){
		root.delete(key);
	}
	
	void search(int key){
		Node node = root.search(key);
		
		if(node.getKey()==key)
			System.out.println(key+"있음");
		else
			System.out.println(key+"없음");
		
		search = false;
	}
	void print_preorder(){
		System.out.print("preorder : ");
		root.preOrder();
		System.out.println();
	}
	void print_inorder(){
		System.out.print("Inorder : ");
		root.inOrder();
		System.out.println();	
	}
	void print_postorder(){
		System.out.print("postorder : ");
		root.postOrder();
		System.out.println();
	}
}

public class Run{
	public static void main(String[] args) {
		BST bst = new BST();
		
		bst.insert(5);
		bst.insert(3);
		bst.insert(2);
		bst.insert(1);
		bst.insert(4);
		bst.insert(8);
		bst.insert(6);
		bst.insert(7);
		bst.insert(10);
		bst.insert(9);
		
		bst.search(7);
		
		bst.print_preorder();
		bst.print_inorder();
		bst.print_postorder();
		
		bst.delete(8);
		bst.delete(5);
		bst.delete(2);
		
		bst.search(8);
		
		bst.print_preorder();
	}
}