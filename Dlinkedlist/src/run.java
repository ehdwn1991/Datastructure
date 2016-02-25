
public class run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dlink dl=new Dlink();
		dl.mrandinput(50);
		dl.showposition(1);
		dl.reverseshowposition(1);
		dl.delete(2);
		dl.delete(2);
		dl.showlist();
		dl.showposition(15);
		dl.reverseshowposition(15);
		System.out.print("Show data in position ");
	    dl.showdata(2);
		}

}
