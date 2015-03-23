package test.ctci.string;

public class ShiftToRight {
	
	public static String shift(String s, int len){
		
		char[] arr = s.toCharArray();
		char temp=arr[arr.length-1];
		char t;
		for (int i = arr.length-1; i > 0 ; i--) {
			arr[i]=arr[i-1];
			
		}
		arr[0]= temp;
		s= new String(arr);
		return s;
		
	}
	
	public static String shiftNTimes(String s, int len, int times){
		for (int i = 0; i < times; i++) {
			s = shift(s, len);
		}
		return s;
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(shiftNTimes("abcdef",6,2));
	}

}
