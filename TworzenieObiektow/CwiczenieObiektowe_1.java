class CwiczenieObiektowe_1{
 	public static void main(String[] args){
 		MojeDane dane = new MojeDane("Adam","Manczak","2PTN");
		Logowanie log = new Logowanie("akronim","123ASDlo9");
		System.out.println("Imie: "+ dane.imie);
		System.out.println("Nazwisko: "+ dane.nazwisko);
		System.out.println("Klasa: "+ dane.klasa);
		System.out.println("\n"+ log.toString());
	}
}