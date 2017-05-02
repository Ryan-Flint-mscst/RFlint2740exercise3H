package exercise3h;

import java.text.DecimalFormat;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unused")
		double [] dlbRainfall = {
				1.2, 2.7, 2.2, 3.1, 2.9, 5.1, 3.2, 2.7, 3.6, 1.8, 2.2, 1.7 };
		String[] strRainfall = {
				"1.2", "2.7", "2.2", "3.1", "2.9", "5.1", "3.2", "2.7", "3.6", "1.8", "2.2", "1.7" };	
		DecimalFormat fmt = DecimalFormat("#0.0");
		
		double[] dblRainfall = null;
		Rainfall rainfall1 = new Rainfall(dblRainfall);
		System.out.println("Rainfall1 total:"); fmt.format(rainfall1.getTotal());
		System.out.println("Rainfall1 average:"); fmt.format(rainfall1.getAverage());
		System.out.println("Rainfall1 highest:"); fmt.format(rainfall1.getHighest());
		System.out.println("Rainfall1 Lowest:"); fmt.format(rainfall1.getHighest());
		System.out.println();
		
		Rainfall rainfall2 = new Rainfall(strRainfall);
		System.out.println("Rainfall2 total:"); fmt.format(rainfall2.getTotal());
		System.out.println("Rainfall2 average:"); fmt.format(rainfall2.getAverage());
		System.out.println("Rainfall2 highest:"); fmt.format(rainfall2.getHighest());
		System.out.println("Rainfall2 Lowest:"); fmt.format(rainfall2.getLowest());
		System.out.println();
		}
	

	private static DecimalFormat DecimalFormat(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	}


