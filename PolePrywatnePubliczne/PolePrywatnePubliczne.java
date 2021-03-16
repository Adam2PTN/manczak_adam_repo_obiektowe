class PolePrywatnePubliczne {
	//Definiowanie zmiennych/obiektów globalnie
	static DaneOsobowe dos;

	public static void main (String [] args){
		//Stworzenie obiektu
		dos = new DaneOsobowe(); //od tego momentu mogę używać nazwy: dos
		System.out.println(dos.wzrost);
	}
}
