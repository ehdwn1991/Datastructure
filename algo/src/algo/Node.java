package algo;

class Node{
	private int key;
	
	private Node lchild=null;
	private Node rchild=null;
	private Node parent=null;
	
	Node(int key){
		this.key = key;
	}
	
	public int getKey(){
		return key;
	}

	public Node getParent(){
		return this.parent;
	}
	
	public Node getLchild(){
		return this.lchild;
	}
	
	public Node getRchild(){
		return this.rchild;
	}
	
	public void setKey(int key){
		this.key = key;
	}
	
	public void setParent(Node node){
		this.parent = node;
	}
	
	public void setLchild(Node node){
		this.lchild = node;
	}
	
	public void setRchild(Node node){
		this.rchild = node;
	}
	
	public void preOrder() {
			
			  System.out.print(key+" ");
			  
			  if (lchild != null) {
				  lchild.preOrder();
			  }
			  
			  if (rchild != null) {
				  rchild.preOrder();
			  }
	}
	
	public void inOrder() {
		  
		  if (lchild != null) {
			  lchild.inOrder();
		  }
		  
		  System.out.print(key+" ");
		  
		  if (rchild != null) {
			  rchild.inOrder();
		  }
	}
	
	public void postOrder() {
		  
		  if (lchild != null) {
			  lchild.postOrder();
		  }
		  
		  if (rchild != null) {
			  rchild.postOrder();
		  }
		  
		  System.out.print(key+" ");
	}
	
	public Node search(int key){
		if(this.key==key)	//해당 키값을 있으므로 
			return this;
		
		else if(this.key<key){
			if(this.rchild==null)
				return this;
			else
				return rchild.search(key);
		}
		
		else{
			if(this.lchild==null)
				return this;
			else
				return lchild.search(key);
		}
	}
	
	public void delete(int key){
		Node node = search(key);
		
		if(node.getKey()==key&&node.getLchild()==null&&node.getRchild()==null){	//삭제하려는 노드가 단말 노드인 경우
			if(node.getParent().getLchild().getKey()==key)
				node.getParent().setLchild(null);
			else
				node.getParent().setRchild(null);
		}else if(node.getKey()==key&&node.getLchild()==null){	//삭제려는 노드의 오른쪽이 비어있는 경우
			if(node.getParent().getLchild().getKey()==key){
				node.getParent().setLchild(node.getRchild());
				node.setParent(node.getParent());
			}
			else{
				node.getParent().setRchild(node.getRchild());
				node.setParent(node.getParent());
			}
		}else if(node.getKey()==key&&node.getRchild()==null){	//삭제려는 노드의 왼쪽이 비어있는 경우
			if(node.getParent().getLchild().getKey()==key){
				node.getParent().setLchild(node.getLchild());
				node.setParent(node.getParent());
			}
			else{
				node.getParent().setRchild(node.getLchild());
				node.setParent(node.getParent());
			}
		}else if(node.getKey()==key){
			Node temp = node.rchild;
				if(temp!=null){
					while(true){
						if(temp.getLchild()==null){
							node.setKey(temp.getKey());
							if(temp.getRchild()!=null)
								temp.getParent().setLchild(temp.getRchild());
							else
								temp.getParent().setLchild(null);
							break;
						}
						else	
							temp = temp.lchild; 
					}
				}else{
					node.setKey(node.getLchild().getKey());
					node.setLchild(null);	
				}
		}
	}	
}