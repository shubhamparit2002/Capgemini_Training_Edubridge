package com.edubridge;
import java.util.Scanner;
public class ElectricBill {
	String name;
	int units;
	double bill;
	
	void accept() {
		System.out.println("Enter Name ");
		Scanner sc = new Scanner(System.in);
		name =sc.nextLine();
		System.out.println("Enter Unit Consumed ");
		units = sc.nextInt();
	}
	void calculate() {
		if(units <=100) {
			bill = units *2;
		}else if(units > 100 && units <= 200) {
			bill = units * 3;
		}else if(units > 200 && units<=300) {
			bill = units*5;
		}else {
			bill = units * 5+((units*5)*2.5/100);
		}
	}
	void print() {
		System.out.println("Name of Costumoer is "+name);
		System.out.println("Nuber of unit Consumed "+units);
		System.out.println("Bill amount "+ bill);

	}
	public static void main(String[] args) {
		ElectricBill bill = new ElectricBill();
		bill.accept();
		bill.calculate();
		System.out.println();
		bill.print();

	}

}
