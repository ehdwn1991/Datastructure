
public class queue {
	char data;
	queue next;
	queue front;
	queue rear;
	
	
		public queue(char data){
			this.data= data;
		}
		public queue(){
			this.front=null;
			this.rear=null;
		}
		
		public boolean empty(){
			return (front==null);
		}
		
}
