import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class GeometricMeanCalculator {

	public GeometricMeanCalculator() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		double [] array= new double[10];
		Scanner scanner= new Scanner(System.in);
		
		for (int i = 0; i < array.length; i++) {
			array[i]= scanner.nextDouble();
		}
		
		double mean=calculateMean(array);
		System.out.println(mean);

	}

	private static double calculateMean(double[] array) {
		double mean=1;
		
		for (double d : array) {
			mean*=d;
		}
		System.out.println(Math.pow(mean, 1/array.length));
		mean=Math.pow(mean, 1.0/array.length);
		System.out.println(mean);
		return mean;
	}

}
