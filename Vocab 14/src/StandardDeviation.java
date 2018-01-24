
public class StandardDeviation {

	public static double sDev(double[] data) {
		double mean = mean(data);
		double[] sqDiff = sqDiff(data, mean);
		double meanSqDiff = meanSqDiff(sqDiff);
		double sDev = sqRoot(meanSqDiff);
		return sDev;
	}
	
	//the mean of all the numbers
	public static double mean(double[] data) {
		double mean = 0;
		for (double e:data) {
			mean += e;
		}
		mean /= data.length;
		return mean;
	}
		
	//subtract mean and square result from each
	public static double[] sqDiff(double[] data, double mean) {
		double[] sqDiff;
		sqDiff = new double[data.length];
		for (int i = 0; i < data.length; i++) {
			double a = data[i] - mean;
			sqDiff[i] = Math.pow(a, 2);
		}
		return sqDiff;
	}
	
	//mean of square differences
	public static double meanSqDiff(double[] sqDiff) {
		double meanSqDiff = 0;
		for (double e:sqDiff) {
			meanSqDiff += e;
		}
		meanSqDiff /= sqDiff.length;
		return meanSqDiff;
	}
	
	//take square root of the mean of the squared differences
	public static double sqRoot(double meanSqDiff) {
		double sDev = Math.sqrt(meanSqDiff);
		return sDev;
	}
	
	public static String toString(double[] data) {
		String nums = "";
		for (double e:data) {
			nums += e + ", ";
		}
		return nums;
	}
	
	public static void main(String[] args) {
		double[] data = {3, 5, 6, 7, 8, 13};
		double[] data1 = {200, 30, 59, 87, 103};
		System.out.println("The standard deviation of " + toString(data) + "is " + sDev(data));
		System.out.println("The standard deviation of " + toString(data1) + "is " + sDev(data1));
	}
	
}