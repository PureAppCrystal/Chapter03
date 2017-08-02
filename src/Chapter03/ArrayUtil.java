package Chapter03;

public class ArrayUtil {

	public static double[] intToDouble( int[] source ) {
		double[] dest = null;
		
		if ( source != null ) {
			int length = source.length;
			dest = new double[length];
			
			for ( int i =0; i<length; i++ ) {
				dest[i] = source[i];
			}
		}
		
		return dest;
	}
	
	public static int[] doubleToInt( double[] source ) {
		int[] dest = null;
		
		if ( source != null ) {
			int length = source.length;
			dest = new int[length];
			
			for ( int i =0; i<length; i++ ) {
				dest[i] = (int)source[i];   // double to int 는 큰거에서 작은것으로 변환하기 때문에 명시적으로 변환해줘야 한다.
			}
		}
		
		return dest;
	}
	
	
}
