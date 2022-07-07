package revision;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		System.out.println("enter the nos");
		int n=e.nextInt();
		int factorial=1;
		for (int i = 1; i<n; i++) {
			factorial=factorial*i;
		}
		System.out.println(factorial);
	}

}
