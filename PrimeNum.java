package com.edubridge;

public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	for(int i=0;i<=10;i++) {
		if(isPrime(i)){
			System.out.println(i);
		}
	}
	}
	public static boolean isPrime(int num) {
		if(num <=1 ) {
			return false;
		}
		for(int i=2;i<num;i++) {
			if(num %i ==0) {
				return false;
			}
		}
		return true;
	}

}
