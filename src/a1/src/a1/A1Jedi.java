package a1;

import java.util.Scanner;

public class A1Jedi {

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
	}
}