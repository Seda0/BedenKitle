package BedenKitle;

import java.util.Scanner;

public class koşul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print(" Boyunuzu Giriniz:");
		double boy=scan.nextDouble();
		
		System.out.print("Kilonuzu Giriniz:");
		double kilo=scan.nextDouble();
		
		double BKİ=kilo/(boy*boy);
		
		System.out.println("Beden Kutle Endexsiniz :" + BKİ);
		
		if (BKİ <= 18.5 ) {
			System.out.println("Zayif");
			
		}
		else if(BKİ>=18.5 && BKİ<=25 ) {
			System.out.println("Normal");
			
		}
		else if(BKİ>25 && BKİ<30 ) {
			
			System.out.println("Fazla Kilolu");
		}
		
		else if(BKİ>=30 ) {
			
			System.out.println("Obez");
		}
		
		
		
		
		
		
		
		
		

	}

}
