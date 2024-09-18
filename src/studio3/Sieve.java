package studio3;
import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Pick a number: ");
		int n = in.nextInt();
		
		boolean [] sievedItems = new boolean[n];
		
		for (int i = 2; i < sievedItems.length; i++) {
			sievedItems [i] = true;
				
		}
		
		for (int i = 2; i < sievedItems.length; i++) {
			for (int j = i*2; j<sievedItems.length; j+=i) {
				sievedItems [j] = false;
				
			}
		}
		
		for (int i = 2; i < sievedItems.length; i++) {
			System.out.println(i + ": " + sievedItems[i]);

		}
		
		
	}

}
