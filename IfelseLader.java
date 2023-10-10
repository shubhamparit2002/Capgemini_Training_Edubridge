package com.edubridge;
import java.util.*;
public class IfelseLader {
	int marks;
	void input() {
		System.out.println("Enter your Marks ");
		Scanner sc = new Scanner(System.in);
		marks = sc.nextInt();
		if(marks >=80 && marks <=100) {
			System.out.println(" Grade A ");
		}else if(marks >=60 && marks <=79) {
			System.out.println(" Grade B ");
		}else if(marks >=40 && marks <=59) {
			System.out.println(" Grade C ");
		}else if(marks >=0 && marks <=39) {
			System.out.println(" Grade Fail ");
		}else {
			System.out.println("Invalid Input ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IfelseLader lader = new IfelseLader();
		lader.input();
		
	}

}

