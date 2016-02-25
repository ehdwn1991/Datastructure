
public class run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 5 3 2 1 4  8 6 7 10 9 
		Tree tr = new Tree();
		/*tr.insert(5);
		tr.insert(3);
		tr.insert(2);
		tr.insert(1);
		tr.insert(4);
		tr.insert(8);
		tr.insert(6);
		tr.insert(7);
		tr.insert(10);
		tr.insert(9);
		tr.search(9);
		tr.search(15);
		tr.printall();
		//tr.delete(20);
		tr.delete(10);
		tr.delete(2);
		tr.delete(5);
		tr.delete(6);
		tr.delete(1);
		tr.printall();*/
//		System.out.println("this node address is "+tr.find(8)); //Node@6bf2d08e 8이 들어 있는 노드 주소값
		
		tr.insert(44);
		tr.insert(17);
		tr.insert(88);
		tr.insert(8);
		tr.insert(32);
		tr.insert(28);
		tr.insert(21);
		tr.insert(29);
		tr.insert(65);
		tr.insert(54);
		tr.insert(82);
		tr.insert(76);
		tr.insert(68);
		tr.insert(80);
		tr.insert(97);
		tr.insert(93);
		tr.printall();
		tr.delete(32);
		tr.printall();
		tr.delete(88);
		tr.printall();
	}

}
