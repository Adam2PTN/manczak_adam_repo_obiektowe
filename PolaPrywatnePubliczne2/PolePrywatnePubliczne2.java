class PolePrywatnePubliczne2 {
	
	static Klient klient;
	static Samochody samochody;
	
	public static void main (String [] args){
		init();
		
		System.out.println(samochody.toString);
	}
	private static void init(){
		klient = new Klient();
		klient.nr = 10;
		
		samochody = new Samochody();
		samochody.marka = "Ford";
		samochody.model = "S-Max";
		samochody.rodzaj_silnika = "Diesel";
		samochody.moc = 150;
		samochody.mo_obrotowy = 246;
		samochody.pojemnosc = 1980;
	}
