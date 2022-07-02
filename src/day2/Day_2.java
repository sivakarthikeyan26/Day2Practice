package day2;

import java.util.Scanner;

public class Day_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a, b and c");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a>b) {
			System.out.println("a is greatest");
			}
		else
			System.out.println("b is greater");
		
		System.out.println("The output of a+b*c = "+(a+b+c));
		System.out.println("The output of c+a/b = "+(c+a/b));
		System.out.println("The output of a%b+c = "+(a%b+c));
		System.out.println("The output of a*b+c = "+(a*b+c));
		sc.close();
		}
	}

