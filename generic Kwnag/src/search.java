
public class search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
				CardDeck card = new CardDeck();
				Card c;
				
				System.out.println("Ư�� ��ġ������ ī��"+card.pickup(0));
				System.out.println("���� ��ġ������ ī��"+card.pickup());
				
				card.shuffle();
				System.out.println("ī�� ��ü ��������");
				card.getCard();
	}

}
