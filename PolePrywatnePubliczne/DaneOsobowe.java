class DaneOsobowe{
	private String pesel = "12345678901";
	public int wiek = 20;
	public int wzrost = 177;
	public int waga = 88;
	public String adres = "ulica Cicha 23";
	
	public double mybmi(){
		//Rzutowanie int na double: (double)wzrost
		System.out.println("Osoba o peselu: "+pesel);
		System.out.println("Adres zamieszkania: "+adres);
		return waga/((double)wzrost/100*(double)wzrost/100);
	public double ulica(){
			System.out.print("Moj adres zamieszkania to "+adres);
		}
	}
}