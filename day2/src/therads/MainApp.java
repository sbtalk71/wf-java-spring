package therads;

public class MainApp {

	public static void main(String[] args) throws InterruptedException{
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();

		t1.start();
		t2.start();

		t1.join();
		t2.join();

	}

}
