package baseClassPackage;

public class NewCode {
	public static void main(String[] args) {
		
		try {
			
			int a=10;
			int b=20;
			int sum=a+b;
			int tot=sum/0;
			System.out.println(tot);
			
			
			
			
		}
		catch(ArithmeticException e){
			System.out.println("Exception");
		}
		
		finally {
			System.out.println("FinallyExecuted");
		}
			
		

		System.out.println("complete");
	}
}
