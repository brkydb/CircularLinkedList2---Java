import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		BagliListe liste = new BagliListe();
		
		int secim = -1;
		
		while(secim != 0){
			
			System.out.println(" 1- Ba�a ekle");
			System.out.println(" 2- Sona Ekle");
			System.out.println(" 3- Araya Eleman Ekle");
			
			System.out.println(" 0- ��k��");
			System.out.println("Se�iminiz: ");
			
			secim = scan.nextInt();
			scan.nextLine();
			
			
			switch (secim) {
			
			case 1: liste.basaekle(); break;
			case 2: liste.sonaekle(); break;
			case 3: liste.arayaekle(); break;
			
			case 0: System.out.println("��k�� yap�ld�."); break;
			default: System.out.println("hatal� se�im");
			}
			liste.yazdir();
		}
		
				
			
	}

}
