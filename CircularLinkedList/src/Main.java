import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		BagliListe liste = new BagliListe();
		
		int secim = -1;
		
		while(secim != 0){
			
			System.out.println(" 1- Baþa ekle");
			System.out.println(" 2- Sona Ekle");
			System.out.println(" 3- Araya Eleman Ekle");
			
			System.out.println(" 0- Çýkýþ");
			System.out.println("Seçiminiz: ");
			
			secim = scan.nextInt();
			scan.nextLine();
			
			
			switch (secim) {
			
			case 1: liste.basaekle(); break;
			case 2: liste.sonaekle(); break;
			case 3: liste.arayaekle(); break;
			
			case 0: System.out.println("Çýkýþ yapýldý."); break;
			default: System.out.println("hatalý seçim");
			}
			liste.yazdir();
		}
		
				
			
	}

}
