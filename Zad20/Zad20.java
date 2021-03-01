import java.util.Scanner;

class Zad20{
	public static void main(String [] arg){
			Scanner scan = new Scanner(System.in);
			System.out.print("Podaj liczbe a program przeksztalci ja w liczbe hexadecymalna: ");
			int liczba = scan.nextInt();
			if (liczba <= 0){
			System.out.println("Wprowadzono niepoprawna liczbe!");
			} else {
			String h = Integer.toHexString(liczba);
			System.out.println("Liczba hexadecymalna podanej liczby wynosi "+h);
			}
		}
	}