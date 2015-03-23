package test.ctci.string;

public class ReplaceSpace {
	
	public static String replaceFromString(String str){
		int len = str.length();
		for (int i = 0; i < len ; i++) {
			if(' '==str.charAt(i)){
				str = str.substring(0, i)+"%20"+str.substring(i+1, len);
				len = str.length();
			}
		}
		
		return str;
		
	}
	
	public static StringBuffer replaceFromStringBuffer(StringBuffer str){
		int len = str.length();
		for (int i = 0; i < len ; i++) {
			if(' '==str.charAt(i)){
				str.replace(i, i+1, "%20");
				len = str.length();
			}
		}
		
		return str;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(replaceFromString("This is a message to replace space."));
		System.out.println(replaceFromStringBuffer(new StringBuffer("This is a message to replace space.")));
		
	}

}
