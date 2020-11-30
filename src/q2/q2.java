package q2;

import java.util.Scanner;

/*Kullanýcýnýn konsol ekrandan 4 temel matematiksel iþlemi yapabildiði bir program yazmanýz bekleniyor.
Program aþaðýdaki özellikleri saðlamalýdýr.

Yapýlabilecek temel iþlemler: Toplama, Çýkarma, Çarpma, Bölme
Kullanýcýya 4 iþlemden birini seçeceði menüyü konsol ekrana yazdýrýn. Örneðin: 1-Toplama, 2-Çýkarma vb...
Ardýndan kullanýcýdan 2 adet tamsayý tipinde sayý girmesini isteyin.
Bu girilen iki sayýyý deðiþkenlerde saklayýn.
Seçilen iþlem tipine göre matematiksel iþlemi yapýn ve konsol ekranýna yazdýrýn.*/
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
			System.out.println("Please enter a number from menü");
		
		}
	
		scanner.close();
	}


}
