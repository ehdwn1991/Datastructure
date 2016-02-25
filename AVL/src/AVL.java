public class AVL {
	private Node root;
	private class Node{
		private int key;
		private Node lchild;
		private Node rchild;
		Node(int key){
			this.lchild = null;
			this.rchild = null;
			this.key = key;
		}
	}
	Node rotate_LL(Node par){
		Node child = par.lchild;      //LL로테이션
		par.lchild = child.rchild;
		child.rchild = par;
		return child;
	}
	Node rotate_LR(Node par){
		Node child = par.lchild;
		par.lchild = rotate_RR(child);
		return rotate_LL(par);		
	}
	Node rotate_RR(Node par){
		Node child = par.rchild;
		par.rchild = child.lchild;
		child.lchild = par;
		return child;
	}
	Node rotate_RL(Node par){
		Node child = par.rchild;
		par.rchild = rotate_LL(child);
		return rotate_RR(par);
	}
	int get_height(Node node){				//높이 
		int height = 0;
		if(node != null){
			height  = 1+max(get_height(node.lchild),get_height(node.rchild));
		}
		return height;	
	}
	int max(int a, int b){					//두 개 파라미터 중 최대값 리
		return ((a>b)?a:b);
	}
	int get_balance(Node node){				//균형 
		if(node == null){
			return 0;
		}
		return get_height(node.lchild) - get_height(node.rchild);
	}
	public Node balance_tree(Node node){		//균형 맞추는 메소드 
		int height_diff = get_balance(node);
		if(height_diff >1){
			if(get_balance(node.lchild) > 0){
				node = rotate_LL(node);
			}else{
				node  = rotate_LR(node);
			}
		}else if(height_diff <-1){
			if(get_balance(node.rchild) < 0){
				node = rotate_RR(node);
			}else{
				node = rotate_RL(node);
			}
		}
		return node;
	}	
	public Node getroot(){						//리턴 루
		return root;
	}
	public void insert(int key){
		insert(key,getroot());
	}
	public void balance_check(Node x){		  // 추가 노드나 삭제 노드 루트를 그대로 가서 균형 체크.
		Node y = root;
		Node pre = null;
		while(true){
			if(y.key > x.key && (get_balance(y.lchild)<-1 || 1<get_balance(y.lchild))){
				pre = y;
				y = y.lchild;
			}else if(y.key < x.key&& (get_balance(y.rchild)<-1 || 1<get_balance(y.rchild))){
				pre = y;
				y = y.rchild;
			}else{
				break;
			}
		}
		Node tmp = y;
		if(y == root){
			root = balance_tree(root);
		}else{
			y = balance_tree(y);
			if(pre.lchild == tmp){
				pre.lchild = y;
			}else{
				pre.rchild = y;
			}
			
		}
	}
	public void insert(int key,Node x){    //노드가 키값과 특정 노드의 부모 노드가 있은 걳음

		Node newnode = new Node(key);
		if(root == null){
			root = newnode;
			return;
		}
		if(x.key > key && x.lchild == null){
			x.lchild = newnode;
			balance_check(newnode);
		}else if(x.key < key && x.rchild == null){
			x.rchild = newnode;
			balance_check(newnode);
		}else if(x.key > key){
			insert(key,x.lchild);
		}else if(x.key < key){
			insert(key,x.rchild);
		}
	}
	public void delete(int key){  //
		Node x = root;     // 탐색 노드 
		Node pre = null;   // 부모 노드 
		Node child = null;   // 자식 노드 
		Node s = null;
		Node maxs = null;
		if(x.key == key && x.lchild ==null && x.rchild == null){
			x = null;
			return;
		}
		while(true){       
				if(x.key > key && x.lchild != null){
					pre = x;
					x = x.lchild;
				}else if(x.key < key && x.rchild != null){
					pre = x;
					x = x.rchild;
				}else{
					break;
				}
		}
		if(x.lchild == null && x.rchild == null){   //서브 트리인 경우 .
			if(pre != null){                
				if(pre.lchild == x){     
					pre.lchild = null;
				}else{
					pre.rchild = null;
				}
			}else{					// 부모 노드가 null 인 경우 삭제 노드는 root. 
				root = null;
			}
		}else if(x.lchild == null || x.rchild ==null){   //한쪽 노드만 있는 경우 .
			if(x.lchild != null){				//왼쪽 노드가 있는 경우 바로 왼쪽 자식이 최대.
				child = x.lchild;
			}else{								//오른쪽 노드가 있는 경우 바로 오른쪽 자식이 최소.
				child = x.rchild;
			}
			if(pre != null){					
				if(pre.lchild == x){			
					pre.lchild = child;			//부모 왼쪽 자식에 삭제노드 왼쪽 자식 저장.
				}else{
					pre.rchild = child;			//부모 오른쪽 자식에 삭제노드 오른쪽 자식 저장. 
				}
			}else{
				root = child;					
			}
		}else{									//양쪽 다 노드가 있는 경우. 
			s = x;
			maxs = x.lchild;					//왼쪽 노드의 최대값 저장.
			while(maxs.rchild != null){
				s = maxs;
				maxs = maxs.rchild;
			}
			if(s.rchild == maxs){				//최대값의 노드와 그 부모노드 일치할 
				s.rchild = maxs.lchild;			//최대값 자식 노드를 부모노드 자식으로 저장.
			}else{
				s.lchild = maxs.lchild;			//아닐 경우는 나가리. 
			}
			x.key = maxs.key;					//최대값 키  삭제노드 키에 저장.
			x = maxs;							//삭제노드는 최대값노드.
		}
		balance_check(x);
		return;
	}
	Boolean search(int key){                	                         
		Node x = root;
		if(x == null){
			System.out.println("지었음 ");
			return false;
		}else{
			while(true){
				if(x.key == key){
					System.out.println(key+" 있음");
					return true;
				}else if(x.key > key && x.lchild != null){
					x = x.lchild;
				}else if(x.key < key && x.rchild != null){
					x = x.rchild;
				}else{
					System.out.println(key+" 없음");
					return false;
				}
			}
		}
	}
	void print_preorder(){
		print_preorder(getroot());
	}
	void print_inorder(){
		print_inorder(getroot());
	}
	void print_postorder(){
		print_postorder(getroot());
	}
	void print_preorder_diff(){
		print_preorder_diff(getroot());
	}
	void print_preorder(Node x){
		if(x != null){
			System.out.print(x.key+" ");
			print_preorder(x.lchild);
			print_preorder(x.rchild);
		}
	}
	void print_inorder(Node x){
		if(x != null){
			print_inorder(x.lchild);
			System.out.print(x.key+" ");
			print_inorder(x.rchild);
		}
	}
	void print_postorder(Node x){
		if(x != null){
			print_postorder(x.lchild);
			print_postorder(x.rchild);
			System.out.print(x.key+" ");
		}
	}
	void print_preorder_diff(Node x){
		if(x != null){
			System.out.print(x.key+"("+get_height(x.lchild)+","+get_height(x.rchild)+")"+" ");
			print_preorder_diff(x.lchild);
			print_preorder_diff(x.rchild);
		}
	}
}