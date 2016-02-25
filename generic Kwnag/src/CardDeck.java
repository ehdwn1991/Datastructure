
import java.util.ArrayList;

public class CardDeck {
	
	final int CARD_NUM=20;
	Card[] cards = new Card[CARD_NUM];   //배열 20칸 생성
	int n=1,a,b;
	ArrayList<Integer> list = new ArrayList<Integer>();
	
	public CardDeck(){
		for(int i=0;i<cards.length;i++){  //20번 루프
			if((i<10)&&(n==1||n==3||n==8)){   // i가 9까지 그리고 n이 1,3,8 일때 그 i에 true 줌 
					cards[i] = new Card(n,true);
					list.add(i);
					n++;
			}
			else{
				cards[i] = new Card(n,false);
				n++;
			}
			if(n==11)
				n=1;
		}
	}
	
	
	void getCard(){
		for(int i=0;i<20;i++)
			System.out.print(cards[i].toString()+" ");
	}
	
	
	void shuffle(){
		Card c;
		for(int i=0;i<50;i++){
			a = (int)(Math.random()*20);
			b = (int)(Math.random()*20);		
			c = cards[a];
			cards[a] = cards[b];
			cards[b] = c;
		}
	}	
	
	Card pickup(int index){
		return cards[index];  //지정된 위치의 카드값 반환
	}
	
	Card pickup(){
		return cards[(int)(Math.random()*20+1)];  //임의의 위치의 카드값 반환
	}	
}
