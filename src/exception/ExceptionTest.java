package exception;

public class ExceptionTest {

	public static void main(String[] args) {
		
		int a = 1
				;
		int result ;
		
		try {
			print("try");
			result = 1000 /a;
			
		} catch( ArithmeticException e) {
			//try에서 예외발생시 이 구문을 탄다.
			print("catch");
			//e.printStackTrace();
			System.out.println("예외 발생");
			return;
		} finally {
			//try에서 return을 해도 이 구문은 반드시 탄다.
			print("finllay");
			result = 0;
		}
		
		System.out.println( result );
		print("hello world!");
	}
	
	
	
	public static void print(Object o) {
		System.out.println(o);
		
	}

}
