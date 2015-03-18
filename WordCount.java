package test.string;

import java.util.ArrayList;
import java.util.HashMap;

//program to count the words in a statement
public class WordCount {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "This is a long message, This is to count the occurence of each word in the message";
		
		
		int i=0;
		int len= s.length();
		ArrayList<String> arr = new ArrayList<String>();
		String[] strArr = new String[50];
		HashMap<String, Integer> strMap = new HashMap<String, Integer>();
		int count = 0;
		System.out.println(s);
		System.out.println("length - "+len);
		
		strArr= s.split(" ");
		
		for (String string : strArr) {
			System.out.println(string);
			if(!strMap.containsKey(string))
				strMap.put(string, 1);
			else
			{
				count = strMap.get(string);
				strMap.put(string, ++count);
			}
		}
		System.out.println(strMap);
		
	}

}
