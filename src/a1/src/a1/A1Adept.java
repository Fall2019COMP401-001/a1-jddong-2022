package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int invCount = scan.nextInt();
		
		// Catalog inventory and prices for reference
		
		String[] Items = new String[0];
		double[] Prices = new double[0];
		double[] Data = new double[0];
		String[] Names = new String[0];
		
		for(int i = 0; i < invCount; i++) {
			Items[i] = scan.next();
			Prices[i] = scan.nextDouble();
		}
		
		// Loop through all customers
		
		int ctCus = scan.nextInt();
		
		for (int i = 0; i < ctCus; i++) {
			String fullName = scan.next() + scan.next();
			Names[i] = fullName;
			int typesBought = scan.nextInt();
			double total = 0;
			for (int j = 0; j < typesBought; j++) {
				int numberBought = scan.nextInt();
				total += numberBought * findItemPrice(scan.next(), Items, Prices);
			}
			Data[i] = total;
		}
		System.out.println("Biggest: " + findMaxSpender(findMax(Data), Data, Names) + findMax(Data));
	}


	static double findItemPrice(String type, String[] inv, double[] costs) {
		for (int i = 0; i < inv.length; i++) {
			if (inv.equals(type)) {
				return costs[i];
			} else {
				return 0;
			}
		}
	}
	
	static double findMax(double[] data) {
		double max = 0;
		for (int i = 0; i < data.length; i++) {
			if(data[i] > max) {
				max = data[i];
			}
		}
		return max;
	}
	
	static String findMaxSpender(double max, double[] data, String[] names) {
		for (int i = 0; i < data.length; i++) {
			if (data[i] == max) {
				return names[i];
			}
		}
	}
	
}
