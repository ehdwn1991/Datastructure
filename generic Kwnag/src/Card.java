
public class Card {
	int num=1;
	boolean iskwang;
	
	public Card(){  }
	
	public Card(int num, boolean iskwang){
		this.num = num;
		this.iskwang = iskwang;
	}
	
	
	public String toString(){
		if(iskwang)
			return num + "k";
		return String.valueOf(num);
	}
	
	
	
	void lists(int cum, boolean iskwnag){
		this.num = num;
		this.iskwang = iskwang;
		
	}
}
