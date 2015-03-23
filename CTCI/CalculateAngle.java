package test.ctci.string;

public class CalculateAngle {
	
	
	public static double calculateDifference(double hour, double min)
	{
		double diff = Math.abs(hour*30+(min/2) - (min*6));
		return diff;
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(calculateDifference(01,05));
		
		for (int i = 0; i < 12; i++) {
			for(int j = 0; j < 60; j++)
			{
				if(calculateDifference(i,j)<=2.5){
					System.out.println("hour: "+i+" minute: "+j);
				}
			}
		}

	}

}
