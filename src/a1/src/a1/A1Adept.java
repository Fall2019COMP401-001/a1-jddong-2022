package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int invCount = scan.nextInt();
		
		// Catalog inventory and prices for reference
		
		String[] Items = new String[invCount];
		double[] Prices = new double[invCount];
		double[] Data = new double[invCount];
		String[] Names = new String[invCount];
				
		for (int i = 0; i < invCount; i++) {
			Items[i] = scan.next();
			Prices[i] = scan.nextDouble();
		}
		
		// Loop through all customers
		
		int ctCus = scan.nextInt();
		
		for (int i = 0; i < ctCus; i++) {
			String fullName = scan.next() + " " + scan.next();
			Names[i] = fullName;
			int typesBought = scan.nextInt();
			double total = 0;
			for (int j = 0; j < typesBought; j++) {
				int numberBought = scan.nextInt();
				total += numberBought * findItemPrice(scan.next(), Items, Prices);
			}
			Data[i] = total;
		}
		
		System.out.println("Biggest: " + findMaxSpender(findMax(Data), Data, Names) + " (" + String.format("%.2f", findMax(Data)) + ")");
		System.out.println("Smallest: " + findMinSpender(findMin(Data), Data, Names) + " (" + String.format("%.2f", findMin(Data)) + ")");
		System.out.println("Average: " + String.format("%.2f", findAverage(Data, ctCus)));
		scan.close();
	}


	static double findItemPrice(String type, String[] inv, double[] costs) {
		for (int i = 0; i < inv.length; i++) {
			if (inv[i].equals(type)) {
				return costs[i];
			} 
		}
		return 0.0;
	}
	
	
	static double findMax(double[] data) {
		double max = 0;
		for (int i = 0; i < data.length; i++) {
			if (data[i] > max) {
				max = data[i];
			}
		}
		return max;
	}
	
	
	static double findMin(double[] data) {
		double min = data[0];
		for (int i = 0; i < data.length; i++) {
			if (data[i] < min) {
				min = data[i];
			}
		}
		return min;
	}
	
	
	static String findMaxSpender(double max, double[] data, String[] names) {
		for (int i = 0; i < data.length; i++) {
			if (data[i] == max) {
				return names[i];
			}
		} 
		return null;
	}
	

	static String findMinSpender(double min, double[] data, String[] names) {
		for (int i = 0; i < data.length; i++) {
			if (data[i] == min) {
				return names[i];
			}
		} 
		return null;
	}
	
	static double findAverage(double[] data, int count) {
		double total = 0;
		for (int i = 0; i < data.length; i++) {
			total += data[i];
		}
		return total / count;
	}

}

