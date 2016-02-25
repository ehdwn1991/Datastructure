package hash;

public class linkedlist {
	      String key;
	      String value;
	      linkedlist next;
	 
	      public linkedlist (String key, String value) {
	            this.key = key;
	            this.value = value;
	            this.next = null;
	      }
	      public linkedlist (String key) {
	            this.key = key;

	      }
	 
	      public String getValue() {
	            return value;
	      }
	 
	      void setValue(String value) {
	            this.value = value;
	      }
	 
	      
	      public String getKey() {
	            return key;
	      }
	 
	      public linkedlist next() {
	            return next;
	      }
	 
	      public void putnext(linkedlist next) {
	            this.next = next;
	      }
	}
	
	

