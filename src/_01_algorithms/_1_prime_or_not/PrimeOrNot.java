package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class PrimeOrNot {

	public static void main(String[] args) {
		String number = JOptionPane.showInputDialog("Enter a number.");
		int primeornot = Integer.parseInt(number);
		boolean isprime = false;
		for (int i = 2; i < primeornot; i++) {
			if (primeornot % i == 0) {
			isprime = false;
			break; 
			}
			else {
				isprime = true;
			}
		}
		if (isprime == false) {
			JOptionPane.showMessageDialog(null, "The number is not prime.");
		}
		else {
			JOptionPane.showMessageDialog(null, "The number is prime.");
		}
	}
}
