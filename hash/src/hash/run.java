package hash;

public class run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			hashtable t1 = new hashtable();
			t1.put("Jonh" , "111-1111");
		  t1.put("No" , "123-4567"); 
			t1.put("Sam" , "222-2222"); 
			t1.put("Jee" , "456-7890"); 
			t1.put("Sandra" , "333-3333"); 
			t1.put("Jaewon" , "000-0000"); 
			t1.put("Lisa" , "444-4444");
			t1.put("Chris" ,"555-5555");
			t1.getvlaue("Kim");
			t1.getvlaue("Chris");
			t1.getvlaue("Lisa");
			t1.showall();
	}

}
