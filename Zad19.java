import java.util.Scanner;

class Zad19{
	public static void main(String [] arg){
			Scanner scan = new Scanner(System.in);
			System.out.print("Podaj liczbe a program przeksztalci ja w liczbe binarna: ");
			int liczba = scan.nextInt();
			if (liczba <= 0){
			System.out.println("Wprowadzono niepoprawna liczbe!");
			} else {
			String b = Integer.toBinaryString(liczba);
			System.out.println("Liczba binarna podanej liczby wynosi "+b);
			}
		}
	}