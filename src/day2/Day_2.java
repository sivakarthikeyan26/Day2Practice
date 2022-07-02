package day2;

import java.util.Scanner;

public class Day_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x and y values");
		int x=sc.nextInt();
		int y=sc.nextInt();
		float distance = (float) Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
		System.out.println("The Euclidean dstance is = "+distance);
		sc.close();
	}

}
