
public class djlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SLinkedList sl = new SLinkedList();
		
		sl.add(2);
		sl.add(3);
		sl.add(5);
		sl.add(6);
		sl.add(7);
		sl.showlist();   //2~7������ ���ڸ� �����Ŀ� ��� ��� ���� �����ݴϴ�.
		sl.insert(1,1);  // 1��° �ڸ� �� ���� 2�� ����ִ� 1��° ��忡 1�� �����մϴ�.
		sl.showlist();
		sl.insert(4,4); //���� 5�� �ִ� 4��° �ڸ��� 4�� �����մϴ�.
		sl.showlist();
		sl.delete(1);   // ���� 1�� ° �ڸ��� 1�� �����մϴ�.
		sl.showlist();
		sl.delete(6);  //6��° �ڸ��� 7�� �����մϴ�.
		sl.showlist();
		sl.showdata(4);  //���� ������ ����  2 3 4 5 6 ���� 4��° �ڸ��� 5�� �����մϴ�.
		sl.showlist();
	}

}
