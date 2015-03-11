package test.string;

public class HashCodeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hashcode test of String:");  
        String str="Jay";  
        System.out.println(str.hashCode());  
        str=str+"Joshi";  
        System.out.println(str.hashCode());  
   
        System.out.println("Hashcode test of StringBuffer:");  
        StringBuffer sb=new StringBuffer("Jay");  
        System.out.println(sb.hashCode());  
        sb.append("Joshi");  
        System.out.println(sb.hashCode()); 
	}

}
