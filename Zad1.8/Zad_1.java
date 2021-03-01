import java.util.Scanner;

class Zad_1{
	public static void main(String [] arg){
		Scanner sc = new Scanner(System.in);
		System.out.println("Prosze wybrac figure:");
		System.out.println("================================");
		System.out.println("k - Kwadrat\np - Prostokat");
		System.out.println("=====================\n Wpisz slowo EXIT aby zakonczyc program.");
		String operation = sc.next();
		if(operation.equals("k")){
			System.out.println("Wybales kwadrat.");
			System.out.println("================================");
			System.out.println("********");
			System.out.println("*      *");
			System.out.println("*      *");
			System.out.println("********");
			System.out.println("================================");
			System.out.println("Podaj bok kwadratu (cm): ");
			int a1 = sc.nextInt();
			if (a1 == 0){
				System.out.println("Bok nie moze wynosic 0!");
				} else if (a1 < 0){
				System.out.println("Bok nie moze byc ujemny!");
			} else{
				int pole1 = (a1*a1);
				int obwod1 = (a1*4);
				System.out.println("Pole kwadratu wynosi "+pole1+" cm, a obwod wynosi "+obwod1+" cm.");
				}
		} else if(operation.equals("p")){
			System.out.println("Wybrales prostokat.");
			System.out.println("================================");
			System.out.println("***************");
			System.out.println("*             *");
			System.out.println("*             *");
			System.out.println("***************");
			System.out.println("================================");
			System.out.println("Podaj pierwszy bok prostokata (cm): ");
			int a2 = sc.nextInt();
			if (a2 == 0){
					System.out.println("Bok nie moze wynosic 0!");
				} else if (a2 < 0){
					System.out.println("Bok nie moze byc ujemny!");
				} else{
				
				System.out.println("Podaj drugi bok prostokata (cm): ");
				int b = sc.nextInt();
			if (b == 0){
				System.out.println("Bok nie moze wynosic 0!");
				} else if (b < 0){
				System.out.println("Bok nie moze byc ujemny!");
			} else{	
				int pole2 = (a2*b);
				int obwod2 = ((2*a2)*(2*b));
				System.out.println("Pole prostokata wynosi "+pole2+" cm, a obwod wynosi "+obwod2+" cm.");
				}
				}
		} else if(operation.equals("EXIT")){
			System.exit(0);
		} else {
			System.out.println("Nieprawidlowy wybor");
		}
}
}