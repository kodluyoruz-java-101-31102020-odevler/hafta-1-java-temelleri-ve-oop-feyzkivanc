package q5;

import java.util.Random;

public class q5 {
	/*Rastgele say�lardan olu�an 100 elemanl�k tamsay� dizisi olu�turun. 
	Ard�ndan tek ve �ift say�lar� bulan bir program yaz�n.*/
	
	public static void main(String [] args) {
		
		 
		int array [] = new int[100] ;
		Random random =new Random();
		for (int i=0;i<array.length;i++){
			array[i]=random.nextInt(1000);

			
			System.out.print("{" + array[i] +"}" +",");
		
	}
		
		for(int i=0; i<array.length;i++) {
			if(array[i]%2==0) {
				System.out.println("even: " +" " +array[i]);
			}
			if(array[i]%2==1) {
				System.out.println("odd: " + " " + array[i]);
			}
			
			
		}
		
	
	}
	
}
