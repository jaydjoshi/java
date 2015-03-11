package test.string;

public class PerformanceTest {

	
	  public static String concatWithString()    {  
	        String s = "Jay";  
	        for (int i=0; i<10000; i++){  
	            s = s + "Joshi";  
	        }  
	        return s;  
	    }  
	    public static String concatWithStringBuffer(){  
	        StringBuffer sb = new StringBuffer("Jay"); 
	        //System.out.println(sb);
	        for (int i=0; i<10000; i++){  
	            sb.append("Joshi");  
	        }  
	        return sb.toString();  
	    } 
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long startTime = System.currentTimeMillis();  
        concatWithString();  
        System.out.println("Time taken by Concating with String: "+(System.currentTimeMillis()-startTime)+"ms");  
        startTime = System.currentTimeMillis();  
        concatWithStringBuffer();  
        System.out.println("Time taken by Concating with  StringBuffer: "+(System.currentTimeMillis()-startTime)+"ms");  

	}

}
