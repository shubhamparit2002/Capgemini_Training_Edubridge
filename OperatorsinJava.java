package com.edubridge;
import java.util.Scanner;
public class OperatorsinJava {
	public static void main(String[] args) {
//	int a,b,c;
//	a=10;
//	b=11;
//	c= ++a + b++;
//	System.out.println("c= "+c);
//	System.out.println("a= "+a);
//	System.out.println("b= "+b);
//	int l = (a>b)? a:b;
//	System.out.println("The largest of"+a+" and "+b+" is "l);
		
	int n1,n2,n3;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter three numbers : ");
	n1 = sc.nextInt();
	n2 = sc.nextInt();
	n3 = sc.nextInt();
	
	int greater = (n1 > n2 && n1 > n3) ? n1 : (n2 > n1 && n2 > n3) ? n2 : n3;
	System.out.println("Greater no = "+greater);
	}

}
