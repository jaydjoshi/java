package test.ctci.string;

public class checkUnique {

	public static boolean checkUnique(String str)
	{
		if(str==null)
		{
			return false;
		}
		int len = str.length();
		boolean charSet[] = new boolean[256];
		
		for (int i = 0; i < len; i++) {
			int value = str.charAt(i);
			//System.out.println(value);
			if(charSet[value]){
				return false;
			}
			charSet[value]= true;
		}
		return true;
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkUnique("abcABC"));

	}

}
