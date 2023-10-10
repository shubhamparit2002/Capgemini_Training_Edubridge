package com.edubridge;
import java.util.Scanner;
class Product{
	int Produt_id;
	String product_Name;
	float product_Price;
	static String Company_Name="wipro";
	void intputProduct() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Product Name ");
		product_Name = sc.nextLine();
		System.out.println("Enter Product Price ");
		product_Price = sc.nextFloat();
		System.out.println("Enter Product Produt ID ");
		Produt_id = sc.nextInt();
		
	}
	void displayProduct() {
		System.out.println("Product Name "+this.product_Name);
		System.out.println("Product Price  "+this.product_Price);
		System.out.println("Product Id  "+this.Produt_id);


	}
}
public class MainProduct {
	public static void main(String[] args) {
		System.out.println("Company Name is "+Product.Company_Name);

			Product product1 = new Product();
			Product product2 = new Product();
			Product product3 = new Product();
			Product product4 = new Product();
			Product product5 = new Product();

			product1.intputProduct();
//			product2.intputProduct();
//			product3.intputProduct();
//			product4.intputProduct();
//			product5.intputProduct();
			
			product1.displayProduct();
//			product2.displayProduct();
//			product3.displayProduct();
//			product4.displayProduct();
//			product5.displayProduct();


			
		
	}

}
