package q1;

import java.util.Scanner;

//String tipinde sabit bir �ifre de�i�keni olu�turun. 
//�rne�in: String password = "12345"; gibi. Ard�ndan, kullan�c�dan klavyeden bir �ifre girmesini isteyin. 
//Girilen �ifre ile de�i�kende tuttu�unuz de�eri k�yaslay�n.
//E�er, iki de�er birbirine e�itse ekrana "Giri� Ba�ar�l�!", de�ilse "Giri� Ba�ar�s�z" yazd�r�n.
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
