package patterns;

import java.util.Scanner;

public class NumTraigle {
	public static void main(String[] args) {
		// to read value from user
		Scanner sc = new Scanner(System.in);
		// to display proper message
		System.out.println("enter your number :");
		// to call the method
		numTraigle(sc.nextInt());
	}

	public static void numTraigle(int n) {
		// to print rows
		for(int r = 1 ; r <= n ; r++) {
			int i = r ;
			int f = n-1 ;
			// to print column
			for(int c = 1 ; c <= r ; c++) {
				// to print 
				System.out.print(" "+i);
				// to update
				i=i+f;
				// to decrease
				f--;
			}
			// to move initial position of next line
			System.out.println();

		}	
	}

}
