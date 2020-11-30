package q3;

import java.util.Random;

/* Rastgele say�lardan olu�mu� 10 elemanl�k tamsay� dizisindeki t�m elemanlar�n ortalamas�n�
alacak program� geli�tirin. Program� yazarken a�a��daki �zelliklere uygun yaz�n�z.

Rastgele olu�an 10 elemanl�k say� k�mesi program yeniden her �al��t���nda de�i�sin. 
Sabit elemanl� bir dizi vermeyin!
Ortalama almay� sa�layacak kodu bir fonksiyon halinde tasarlay�n.
��ine diziyi girdi (input) olarak als�n.
Ortalama alan fonksiyon ortalamay� ondal�kl� say� olarak d�nd�rs�n. (return) etsin. */
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
