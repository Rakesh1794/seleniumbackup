package revision;

import java.util.Scanner;

public class ReverseThestring {

	public static void main(String[] args) {
		String original;
	 String reverse=" ";
	Scanner e= new Scanner(System.in);
	System.out.println("enter the string");
	original =e.nextLine();
	int length=original.length();
	for (int i = length-1; i>=0; i--) {
		reverse=reverse+original.charAt(i);
	}
	System.out.println(reverse);
	}
	}


