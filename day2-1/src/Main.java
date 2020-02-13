
public class Main {

	public static void main(String[] args) {
		int x=20;
		Integer a=new Integer(x);
		
		Integer b =x;
	
		int z=a;
		String s=""+x;
		System.out.println(s);
		
		Demo d = new Demo();
		d.printMessage(()->{return "Good After noon";});
		d.printMessage(()->{return "Good Morning";});
		d.printMessage(()->{return "Good Night";});
		d.printMessage(()->{return "Hello Again";});

	}

}
