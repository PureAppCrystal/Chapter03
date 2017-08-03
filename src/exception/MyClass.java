package exception;

import java.io.IOException;

public class MyClass {
	
	public void danger() throws MyException, IOException {
		System.out.println( "some code1..." );
		System.out.println( "some code2..." );
		
		if ( 1 == 1 ) {
			throw new MyException("MyClass MyException 발생~!");
		}
		
		if ( 2 == 2 ) {
			throw new IOException("MyClass IOException 발생~!");
		}
		
		System.out.println( "some code3..." );
		System.out.println( "some code4..." );
	}
}
