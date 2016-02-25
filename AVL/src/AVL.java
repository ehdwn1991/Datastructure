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
		Node child = par.lchild;      //LL�����̼�
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
	int get_height(Node node){				//���� 
		int height = 0;
		if(node != null){
			height  = 1+max(get_height(node.lchild),get_height(node.rchild));
		}
		return height;	
	}
	int max(int a, int b){					//�� �� �Ķ���� �� �ִ밪 ��
		return ((a>b)?a:b);
	}
	int get_balance(Node node){				//���� 
		if(node == null){
			return 0;
		}
		return get_height(node.lchild) - get_height(node.rchild);
	}
	public Node balance_tree(Node node){		//���� ���ߴ� �޼ҵ� 
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
	public Node getroot(){						//���� ��
		return root;
	}
	public void insert(int key){
		insert(key,getroot());
	}
	public void balance_check(Node x){		  // �߰� ��峪 ���� ��� ��Ʈ�� �״�� ���� ���� üũ.
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
	public void insert(int key,Node x){    //��尡 Ű���� Ư�� ����� �θ� ��尡 ���� ����

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
		Node x = root;     // Ž�� ��� 
		Node pre = null;   // �θ� ��� 
		Node child = null;   // �ڽ� ��� 
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
		if(x.lchild == null && x.rchild == null){   //���� Ʈ���� ��� .
			if(pre != null){                
				if(pre.lchild == x){     
					pre.lchild = null;
				}else{
					pre.rchild = null;
				}
			}else{					// �θ� ��尡 null �� ��� ���� ���� root. 
				root = null;
			}
		}else if(x.lchild == null || x.rchild ==null){   //���� ��常 �ִ� ��� .
			if(x.lchild != null){				//���� ��尡 �ִ� ��� �ٷ� ���� �ڽ��� �ִ�.
				child = x.lchild;
			}else{								//������ ��尡 �ִ� ��� �ٷ� ������ �ڽ��� �ּ�.
				child = x.rchild;
			}
			if(pre != null){					
				if(pre.lchild == x){			
					pre.lchild = child;			//�θ� ���� �ڽĿ� ������� ���� �ڽ� ����.
				}else{
					pre.rchild = child;			//�θ� ������ �ڽĿ� ������� ������ �ڽ� ����. 
				}
			}else{
				root = child;					
			}
		}else{									//���� �� ��尡 �ִ� ���. 
			s = x;
			maxs = x.lchild;					//���� ����� �ִ밪 ����.
			while(maxs.rchild != null){
				s = maxs;
				maxs = maxs.rchild;
			}
			if(s.rchild == maxs){				//�ִ밪�� ���� �� �θ��� ��ġ�� 
				s.rchild = maxs.lchild;			//�ִ밪 �ڽ� ��带 �θ��� �ڽ����� ����.
			}else{
				s.lchild = maxs.lchild;			//�ƴ� ���� ������. 
			}
			x.key = maxs.key;					//�ִ밪 Ű  ������� Ű�� ����.
			x = maxs;							//�������� �ִ밪���.
		}
		balance_check(x);
		return;
	}
	Boolean search(int key){                	                         
		Node x = root;
		if(x == null){
			System.out.println("������ ");
			return false;
		}else{
			while(true){
				if(x.key == key){
					System.out.println(key+" ����");
					return true;
				}else if(x.key > key && x.lchild != null){
					x = x.lchild;
				}else if(x.key < key && x.rchild != null){
					x = x.rchild;
				}else{
					System.out.println(key+" ����");
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