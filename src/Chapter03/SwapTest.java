package Chapter03; 

public class SwapTest {

	public static void main(String[] args) {
		
		//---------------------------------------------//
		int i = 10;  //로컬변수는 stack에 들어간다.
		int j = 20;
		System.out.println("i : "+i+", j : "+j);
		
		swap(i, j);
		System.out.println("i : "+i+", j : "+j);
		
		
		//---------------------------------------------//
		Value v1 = new Value();
		v1.setVal(10);
		Value v2 = new Value();
		v2.setVal(20);
		System.out.println("v1 : "+v1.getVal()+", v2 : "+v2.getVal());
		
		swap2(v1, v2); //객체를 함수로 전달(레퍼런스 전달)
		System.out.println("v1 : "+v1.getVal()+", v2 : "+v2.getVal());
		
		
		
		
	}
	
	
	//static은 static에서만 호출할 수 있다.
	public static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}
	
	
	
	public static void swap2(Value a, Value b) {
		int temp = a.getVal();
		a.setVal( b.getVal() );
		b.setVal( temp );
	}

}
