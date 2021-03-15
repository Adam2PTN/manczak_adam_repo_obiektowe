class PierwszeObiektowe {
	public static void main (String [] args){
		//Zdefiniowanie i stworzenie obiektu
		ObiektPudelko op = new ObiektPudelko();
		System.out.println("Domyslna wartosc: "+op.wysokosc);
		
		op.wysokosc = 100;
		System.out.println("Po zmodyfikowaniu "+op.wysokosc);
		
		ObiektOsoba os = new ObiektOsoba();
		System.out.println(os.imie);
		System.out.println(os.nazwisko);
	}
}
