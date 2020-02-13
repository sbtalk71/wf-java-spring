package day2;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		try {
			int a = 0;
			int b = 10;
			//double d = a / b;
			String[] names= {"A","B"};
			System.out.println(names[1]);
			
			if(a==0) {
				throw new RuntimeException("a cannot be Zero (0)");
			}
			System.out.println("all ok");
		} catch (ArithmeticException e) {
			//System.out.println(e);
			e.printStackTrace();
			//System.out.println(e.getCause());
		}catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("Programme resumes..");
	}

}
