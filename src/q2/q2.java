package q2;

import java.util.Scanner;

/*Kullan�c�n�n konsol ekrandan 4 temel matematiksel i�lemi yapabildi�i bir program yazman�z bekleniyor.
Program a�a��daki �zellikleri sa�lamal�d�r.

Yap�labilecek temel i�lemler: Toplama, ��karma, �arpma, B�lme
Kullan�c�ya 4 i�lemden birini se�ece�i men�y� konsol ekrana yazd�r�n. �rne�in: 1-Toplama, 2-��karma vb...
Ard�ndan kullan�c�dan 2 adet tamsay� tipinde say� girmesini isteyin.
Bu girilen iki say�y� de�i�kenlerde saklay�n.
Se�ilen i�lem tipine g�re matematiksel i�lemi yap�n ve konsol ekran�na yazd�r�n.*/
public class q2 {
	

	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter first number");

		double number1 = scanner.nextDouble();
		System.out.println("please enter second number");
		double number2= scanner.nextDouble();
		
		System.out.println("Please select operation");
		System.out.println("1-addition");
		System.out.println("2-subtraction");
		System.out.println("3-multiplication");
		System.out.println("4-division");
		
		int choice = scanner.nextInt();
		
		if (choice == 1) {
			System.out.println("Result:" +" " +(number1+number2));
		}
		else if (choice== 2) {
		
		System.out.println("Result:" + " " + (number1-number2));
	
		}
		else if (choice==3) {
			System.out.println("Result:" + " " + (number1*number2));
			
		}
		else if (choice==4) {
			try { 
				double result = number1/number2;
				System.out.println("result: " + result );
			}
			 catch (ArithmeticException e)
	        {
	            System.out.println(e);
	        }
	        
		}
		else  {
			System.out.println("Please enter a number from men�");
		
		}
	
		scanner.close();
	}


}
