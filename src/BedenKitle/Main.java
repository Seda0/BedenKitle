package BedenKitle;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hos Geldiniz");
        
		Scanner scanner= new Scanner(System.in);
		
		System.out.print("Kilonuzu Grirniz");
		double kilo=scanner.nextDouble();
		System.out.print("Boyunuzu Giriniz");
		double boy=scanner.nextDouble();
		
		
		double BDK= kilo/(boy*boy);
		System.out.println("Vucut Kitle Indexsiniz: " + BDK );
		
		
	}

}
