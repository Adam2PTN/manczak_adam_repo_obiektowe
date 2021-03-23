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
}