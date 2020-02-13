package therads;

public class MainApp2 {

	public static void main(String[] args) throws InterruptedException{
		Thread t1 = new Thread(new Worker());
		Thread t2 = new Thread(new Worker());

		t1.start();
		t2.start();

		
		
		Thread t3=new Thread(()->System.out.println("This is also a thread"));
		
		t1.join();
		t2.join();
		t3.join();

	}

}
