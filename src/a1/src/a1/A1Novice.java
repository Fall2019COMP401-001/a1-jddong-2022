package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		/* ctCus represents number of people in the list. 
		* Used to loop through all customers. */
		
		int ctCus = scan.nextInt();
		
		/* For each loop, the customer's first initial and name are 
		 * concatenated with the price of their purchase.
		 */
		
		for(int i = 0; i < ctCus; i++) {
			String Initial = findInitial(scan.next());
			String Name = Initial + scan.next();
			double total = 0;
			
//			System.out.println(Name + ": " + String.format("%.2f", total));
			
			/* Looping through the number of items they're purchasing, calling 
			 * findAmt once for each item and adding that to the total of their 
			 * purchase. Purchase is re-declared 0 for each new customer.
			 */
			
			int itemsBought = scan.nextInt();
			
			for (int j = 0; j < itemsBought; j++) {
				int quantity = scan.nextInt();
				String hold = scan.next();
				double value = scan.nextDouble();
				total += quantity * value;
			
//				System.out.println(Name + ": " + String.format("%.2f", total));
//				double amt = findAmt(scan.nextInt(), scan.nextDouble());
//				total += amt;
			}
			
			System.out.println(Name + ": " + String.format("%.2f", total));
		}
		scan.close();
	}
	
	public static String findInitial(String firstName) {
		return firstName.charAt(0) + ". ";
	}
	
//	static double findAmt(int times, double value) {
//		return (times * value);
	}

