class Rekurencja2 {
	public static void main(String [] args){
		long liczba = sumaKolejnychLiczb(3);
		System.out.println(""+Integer.MAX_VALUE);
		System.out.println(""+Long.MAX_VALUE);
		System.out.println("Wynik: "+liczba);
		System.out.println(wyswietlanieWyrazu("Anna"));
	}

	private static String wyswietlanieWyrazu(String wyraz){
		if(wyraz.length() > 1){
			return wyraz + "\n" + wyraz.substring(0,wyraz.length()-2));
		}
		return wyraz;
	}

	private static int sumaKolejnychLiczb(int liczba){
		if(liczba > 0){
			System.out.println(liczba);
			return liczba+sumaKolejnychLiczb(liczba-1);
		}
		System.out.println("Koniec rekurencji liczba = " + liczba);
		return 0;
	}
	private static int obliczanieSilni(int liczba){
		if (liczba > 1){
			return liczba * obliczanieSilni(liczba-1);
		}
		return 1;
	}
}