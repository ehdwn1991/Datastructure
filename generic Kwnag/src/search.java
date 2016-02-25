
public class search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
				CardDeck card = new CardDeck();
				Card c;
				
				System.out.println("특정 위치에서의 카드"+card.pickup(0));
				System.out.println("랜덤 위치에서의 카드"+card.pickup());
				
				card.shuffle();
				System.out.println("카드 전체 가져오기");
				card.getCard();
	}

}
