package hash;

public class hashtable{
	linkedlist table[];
	
	hashtable(){
		table = new linkedlist[6];
        for (int i = 0; i < 6; i++)
              table[i] = null;
	}


	
	public String getvlaue(String key){
		int hash =hashfunction(key);
		linkedlist nu = table[hash];
		if(table[hash] == null){
			System.out.println("There is No value");
			System.out.println("hash: "+hash+",key : "+table[hash].key + ", value : "+table[hash].value);
			return "There is no value";}
		else{
		while (nu != null && nu.getKey() != key)
                nu = nu.next();
          if (nu == null){
        	  System.out.println("There is No value");
                return "There is no value";}
          else{
        	  System.out.println("hash: "+hash+",key : "+key + ", value : " + nu.value);
                return nu.getValue();}
		}
		
		
	}
	
	
	


   public void put(String key, String value) {
         int hash =hashfunction(key);
         
         if (table[hash] == null){
               table[hash] = new linkedlist(key, value);
               System.out.println("hash: "+hash+",key : "+table[hash].key + ", value : "+table[hash].value);}
         
         else {
               linkedlist nunode = table[hash];      
               while (nunode.next != null && nunode.getKey() != key)
                     nunode = nunode.next; // 중복된 키와 값을 체이닝으로 처리 
               
               if (nunode.getKey() == key){
                     nunode.setValue(value);
               		System.out.println("hash: "+hash+",key : "+table[hash].key + ", value : "+table[hash].value);}
               else{
            	   	nunode.putnext(new linkedlist(key, value));
                     System.out.println("hash: "+hash+",key : "+key + ", value : "+value);}
     }
   }

	
   public void showall(){
	   for(int hash=0; hash<=5;++hash){
		   	linkedlist nu = table[hash];
		    if (nu == null){
		       	  System.out.println("hash: "+hash+", Null");
		            }
		   
	        
	         else{
	     do { 	  System.out.println("hash: "+hash+",key : "+ nu.key + ", value : " + nu.value);
	       	  nu = nu.next;
	     
	     	}while (nu!= null);
	               }
		   
	   }  
   
   }
   public int hashfunction(String key){
	   int temp=0;
	   linkedlist nu = new linkedlist(key);
	   temp=(nu.getKey().length())%6;
	   return temp;
   }
	
}


