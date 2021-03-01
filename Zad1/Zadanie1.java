import java.util.Scanner;

class Zadanie1{
	public static void main(String [] args){
		Scanner l1 = new Scanner(System.in);
		System.out.print("Podaj pierwsza liczbe: ");
		int liczba1 = l1.nextInt();	
		Scanner l2 = new Scanner(System.in);
		System.out.print("Podaj druga liczbe: ");
		int liczba2 = l2.nextInt();
		int Suma = (liczba1 + liczba2);
		System.out.println(Suma);
	}
	}