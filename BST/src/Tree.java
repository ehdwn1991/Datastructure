
public class Tree {
	Node root;
	Node temp = root;
	int size =0;
	void insert(int data){
		if(size ==0){
			Node nunode = new Node(data,null);
			root = nunode;
			size++; 
			System.out.print("Insert : "+root.data);
		}
		else{
			Node tempr = root;
			while(true){
			if(data < tempr.data){
				if(tempr.left !=null){ 
					tempr=tempr.left;}
				else{
					Node nunode = new Node(data,tempr);
					tempr.left(nunode);
					size++;
					System.out.print(" "+nunode.data);
					break;}}

			else if(data >tempr.data){
				if(tempr.right!=null){	
					tempr=tempr.right;}
				else{
					Node nunode = new Node(data,tempr);
					tempr.right(nunode);
					size++;
					System.out.print(" "+nunode.data);
					break;}}
			
			}}}
		
		
	 public void printall(){
		 System.out.println("Preorder print");
		 preorder(root);
		 System.out.println();
		 System.out.println("Inorder print");
		 inorder(root);
		 System.out.println();
		 System.out.println("Postorder print");
		 postorder(root);
		 System.out.println(); 
		 
	 }
	public void preorder(Node temp){		
		if(temp==null)
			return;
		System.out.print(temp.data+" ");
		preorder(temp.left);
		preorder(temp.right);

	}
		public void inorder(Node temp){
		if(temp==null){
			//count=count+1;
			return;}		
		inorder(temp.left);		
		System.out.print(temp.data+" ");
		inorder(temp.right);
		}
	
	public void postorder(Node temp){
		if(temp==null)
			return;
		postorder(temp.left);		
		postorder(temp.right);
		System.out.print(temp.data+" ");
	}
	public Node find(int data){  //특정 위치의 노드를 찾기 위해 그 노드릐 주소 값 반환함.
		Node temp = root;
		Node temp1;
		while(temp!=null){
			if(data == temp.data){
				return temp;}
			else if(data< temp.data){
				temp=temp.left;
				if(temp!=null){
				if(temp.data == data){
					temp1=temp;
					//System.out.print("1We have Node of ");
					return temp1;
				}}}
			else{
				
				temp=temp.right;
				if(temp!=null){
				if(temp.data == data){
					temp1=temp;
					//System.out.print("2We have Node of");
					return temp1;
				}}}
		}
		return temp;
	}
	
	public int search(int data){
		System.out.println();
		int temp=0;
		Node temp1;
		if((temp1=find(data))!=null){		
		temp=temp1.data;
		System.out.print("We have Node of ");}
		else{
			temp=0;
		}
		if(temp==0)
			System.out.println("There is no data");
		else{
			//temp= find(data);
			System.out.println(temp);
			}
		return temp;
	}
	
	public void delete(int data){
		Node temp = find(data);
		Node temp1;
		temp1=temp;
		if(temp!=null){
		if(temp1.right!=null && temp1.left!=null){ //1.자식 노드가 둘다 있을때
			temp1=temp1.left;
			do{
				temp1=temp1.right;
			}while(temp1==null);
			if(temp1.parent.right!=null){
				System.out.println("We delete Node of "+temp.data);}
			temp.data = temp1.data;
			temp1.parent.right=null;
			temp1.parent=null;
			--size;
		}
		else if(temp1.right==null&&temp1.left==null){ //4. 자식 노드가없을떼
				if(temp1.parent.right== temp1){
					System.out.println("We delete Node of "+temp.data);
					temp1.parent.right=null;
					temp1.parent=null;
					--size;
					}
				else{
					System.out.println("We delete Node of "+temp.data);
					
					temp1.parent.left=null;
					temp1.parent=null;
					
					--size;
				}
			}	
		else if(temp.right==null||temp.left==null){							//2.3.자식 노드가 한쪽만있을때
			if(temp.data >temp.parent.data){
				if(temp.right==null){
					System.out.println("We delete Node of "+temp.data);
					temp.parent.right = temp.left;
					temp.left.parent=temp.parent;
					temp.left=null;
					temp.parent=null;
					--size;}
				else{
					System.out.println("We delete Node of "+temp.data);
					temp.parent.right = temp.right;
					temp.right.parent=temp.parent;
					temp.right=null;
					temp.parent=null;
					--size;}
			}
				
			else{
				if(temp.right==null){
					System.out.println("We delete Node of "+temp.data);
					temp.parent.left = temp.left;
					temp.left.parent=temp.parent;
					temp.left=null;
					temp.parent=null;
					--size;}
				else{
					System.out.println("We delete Node of "+temp.data);
					temp.parent.left = temp.right;
					temp.right.parent=temp.parent;
					temp.right=null;
					temp.parent=null;
					--size;}
				
			}
			
		}}
		else{
			System.out.println("We don't have this Node Fuckyou dam'n ass");
		}
		}
		
}


/*인오더 서치로 딜리트 구형 하려 시도했던 메소드들 */
/*public Node Deleteopti(Node temp){
Node temp2= temp;
if(temp.left==null && temp.right==null)  //base case 오른쪽 왼쪽 노드 없는거
	return temp;
else if(temp.left!=null && temp.right!=null &&temp.right.right==null){ // case1, this node has a left and right child
		Deleteopti(temp2.left);
}  
	
else{									// case2, this node has a left child or right child
	
	if(temp.left!=null && temp.right==null){   //case 2-1, this node have a only left child
		Node temp3= temp2;
		temp3 = temp3.left;
		temp2.data=
		temp2.left=temp2.left.left;
	} 
			
	if(temp.left==null && temp.right!=null){}	 //case 2-2, this node have a only right child
		
	if(temp.left==null && temp.right==null){}  //case 2-3, this node havn't no child. Just delete it
}
return temp.data;
}*/

/*public int cout(int count){
System.out.print("  "+count);
return count+=count;
}*/
/*public void inorderDelete(Node temp){//temp=root temp1=delete node
	if(temp.left==null && temp.right==null){
		return;}
	
	if(temp.left!=null){
		
		inorderDelete(temp.left);

		//temp.count=c ount;
	}
	if(temp.right!=null){
		
		inorderDelete(temp.right);

		//temp.count =count;
	}
}	*/
/*	void deleteop(){
	Node temp=root;
	int count = 0;
	inorderDelete(temp);
}
*/
