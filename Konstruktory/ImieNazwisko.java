class ImieNazwisko{
	private String imie = "Adam"
	private String nazwisko = "Manczak"
	
	public ImieNazwisko(String imie, String nazwisko){
		this.imie = imie;
		this.nazwisko = nazwisko;
	public void witaj(){
		System.out.println("Witaj "+imie+" "+nazwisko);
	}
	}	
}