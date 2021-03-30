import java.util.Scanner;
import java.util.InputMismatchException;

class PierwszyKonstruktor{
	public static void main(String[] args){
		MojeBmi mb = new MojeBmi(190,86);
		double wynik = mb.MojeBmi();
		System.out.println("BMI = "+wynik);
		//im.witaj();
		//System.out.println("Pola w obiekcie: "+mb.wzrost+" "+mb.waga)
		
		mb.setWaga(65);
		mb.setWzrost(178);
		System.out.println("BMI = "+mb.mojeBmi());
	}
	private void obliczanieBmi(){
		int wzrost = 0;
		int waga = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Program oblicza BMI dla podanego wzrostu w cm i wagi w kg\n0 - Zakoncz\n1 - Oblicz");
		
		int zakoncz = 0;
		boolen flag = true;
		while(flag){
			try {
				zakoncz = sc.nextInt();
				while(zakoncz != 0){
					System.out.print("Podaj wzrost w cm: ");
					wzrost = sc.nextInt();
					System.out.println();
					System.out.print("Podaj wage w kg: ");
					waga = sc.nextInt();
					System.out.println();
					MojeBmi mb = new MojeBmi(wzrost,wagi);
					System.out.println("BMI = "+mb.mojeBmi());
					System.out.println("Obloczyć ponownie BMI? \n0 - Zakoncz\n1 - Oblicz");
					zakoncz = sc.nextInt();
				}
				flag = false;
			} catch (InputMismatchException ex){
			System.out.print("Wpisuj tylko CYFRY");
			zakoncz = 0;
			}
		}
	}
}