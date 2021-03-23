class PolePrywatnePubliczne {
	//Definiowanie zmiennych/obiektów globalnie
	static DaneOsobowe dos;

	public static void main (String [] args){
		//Stworzenie obiektu
		dos = new DaneOsobowe(); //od tego momentu mogę używać nazwy: dos
		System.out.println("BMI: "+dos.mybmi());
		dos.wzrost = 192;
		dos.waga = 94;
		System.out.println("2 os BMI: "+dos.mybmi());
		dos.ulica();
	}
}
