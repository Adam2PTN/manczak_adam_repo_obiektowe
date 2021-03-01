import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;
class Odczyt{
	public static void main(String[] a){
	try{
		File f = new File("plik.txt");
		FileWriter fw = new FileWriter(f);
		fw.write("Pierwsza linijka \nt Druga linijka \n Trzecia");
		fw.close(); //Zamkniecie dostepu do pliku
	} catch (IOException e){
		System.out.println("Blad zapisu "+e.toString());
	}
	try{
		Scanner sc = new Scanner(f);
		while(sc.hasNext()){
			String s = sc.nextLine();
			System.out.println(s);
		}
	} catch(FileNotFoundException e){
		System.out.println("Plik nie istnieje: "+e.toString());
	}
		
}
}