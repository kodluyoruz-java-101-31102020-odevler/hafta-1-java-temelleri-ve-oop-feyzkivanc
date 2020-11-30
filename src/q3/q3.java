package q3;

import java.util.Random;

/* Rastgele sayýlardan oluþmuþ 10 elemanlýk tamsayý dizisindeki tüm elemanlarýn ortalamasýný
alacak programý geliþtirin. Programý yazarken aþaðýdaki özelliklere uygun yazýnýz.

Rastgele oluþan 10 elemanlýk sayý kümesi program yeniden her çalýþtýðýnda deðiþsin. 
Sabit elemanlý bir dizi vermeyin!
Ortalama almayý saðlayacak kodu bir fonksiyon halinde tasarlayýn.
Ýçine diziyi girdi (input) olarak alsýn.
Ortalama alan fonksiyon ortalamayý ondalýklý sayý olarak döndürsün. (return) etsin. */
public class q3 {
	
	public static void main(String[] args) {
		
		int array [] = new int[10];
		Random r = new Random();

		for(int i=0; i<array.length ; i++) {
			 
			array[i] =  r.nextInt(1000);
			System.out.print("{" + array[i] + "}" +" ");

		}
		double avg = average(array);
		System.out.println();
		System.out.println("average:" + " " + avg);
		
	}
	public static double average(int[] arr) {
		
		double sum =0;
		
		for(int i =0; i<arr.length;i++) {
			sum += arr[i];
		}
		
		
		
		return sum/10;
		
	}

}
