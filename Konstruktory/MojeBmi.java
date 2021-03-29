class MojeBmi{
	private int wzrost = 0;
	private int waga = 0;
	
	//konstruktor
	public MojeBmi(int wzrost, int waga){
		System.out.println("W konstruktorze: "+wzrost+" "+waga);
		this.wzrost = wzrost;
		this.waga = waga;
	}
	
	//metoda zwracająca BMI jako liczbę zmienną zmiennoprzecinkową
	public double mojeBmi(){
		return waga/((double)wzrost/100*(double)wzrost/100)
	}
	
	//metody pobierające dane z pól wzrost o waga, oraz zmieniające wartości tych pól
	//są to tak zwane gettety i settery
	
	public void setWzrost(int wzrost){
		this.wzrost = wzrost;
	}
	
	public void setWaga(int waga){
		this.waga = waga;
	}
	
	//Pobieranie
	public int getWzrost(){
		return wzrost;
	}
	public int getWaga(){
		return waga;
	}
}