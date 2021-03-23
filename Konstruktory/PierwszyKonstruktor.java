class PierwszyKonstruktor{
	public static void ain(String[] args){
		MojeBmi mb = new MojeBmi(190,86);
		double wynik = mb.MojeBmi();
		System.out.println("BMI = "+wynik);
		//mb.wzrost = 160;
		//mb.waga = 80
		//MojeBmi mb = new MojeBmi(190,86);
		//System.out.println("Pola w obiekcie: "+mb.wzrost+" "+mb.waga);
	}
}