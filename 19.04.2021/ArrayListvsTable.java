import java.util.ArrayList;

public class ArrayListvsTable{
	public void arrayListvsTable(){
		int[] t = new int[10];
		//Do ArrayList można wpisywać tylko OBIEKTY
		ArrayList<Integer> lista = new ArrayList<>();
		//Zapełnienie tablicy liczbami od 10 do 19
		for (int i=0;i<10;i++){
			t[i] = i+10;
		}
		System.out.println(t);
		//Dodanie do listy elemtny - liczby od 10 do 19
		for (int i=0;i<10;i++){
			lista.add(i+10);
		}
		System.out.println(lista);
		lista.add(100);
		for (int i=0;i<lista.size();i++){
			System.out.println("Element: ["+i+"] = "+lista.get(i));
		}
	}
}