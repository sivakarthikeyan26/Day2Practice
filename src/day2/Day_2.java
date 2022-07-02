package day2;

import java.util.Scanner;

public class Day_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a, b month and day respectively");
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a>=3 && a<=6) {
			if((a==3 && b>20) ||(a==6 && b<20) || (a>3 && a<6)) {
				System.out.println("valid");
			}
			else {
				System.out.println("invalid");
			}
		}
	sc.close();
	}

}
