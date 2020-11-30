package q1;

import java.util.Scanner;

//String tipinde sabit bir þifre deðiþkeni oluþturun. 
//Örneðin: String password = "12345"; gibi. Ardýndan, kullanýcýdan klavyeden bir þifre girmesini isteyin. 
//Girilen þifre ile deðiþkende tuttuðunuz deðeri kýyaslayýn.
//Eðer, iki deðer birbirine eþitse ekrana "Giriþ Baþarýlý!", deðilse "Giriþ Baþarýsýz" yazdýrýn.
public class q1 {
	
	public static void main(String[] args) {
		
		
		String password="f3254f";
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your password");
		
		String input = scan.nextLine();
		if ( password.equals(input)) {
			System.out.println("Login Successful!");
		}
		else {
			System.out.println("Login Failed.");
		}
		
		scan.close();
	
		
		
	}
	
	

}
