import java.util.Scanner;
import java.lang.Math.*;

class Zadanie3{
	public static void main(String [] args){
	int a = 0;
	a = (int) (Math.random()*10+1);
	System.out.print("Pierwsza wylosowana liczba to "+a);
	int b = 0;
	b = (int) (Math.random()*10+1);
	System.out.print("\nDruga wylosowana liczba to "+b);
	int wynik = (a*b);
	System.out.print("\nWynik mnozenia obu liczb wynosi "+wynik);
	}
}