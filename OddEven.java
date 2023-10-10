package com.edubridge;
import java.util.Scanner;
public class OddEven {

	public static void main(String[] args) {
		System.out.println("Enter nubmer to check Odd or Even");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num%2==0) {
			System.out.println(num+" is Even Number");
		}else {
			System.out.println(num+" is Odd Number");
		}
	}

}
