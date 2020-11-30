package q5;

import java.util.Random;

public class q5 {
	/*Rastgele sayýlardan oluþan 100 elemanlýk tamsayý dizisi oluþturun. 
	Ardýndan tek ve çift sayýlarý bulan bir program yazýn.*/
	
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
