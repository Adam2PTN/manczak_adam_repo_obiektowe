class ManczakAdam{
 	public static void main(String[] args){
	Sprawdzian spr = new Sprawdzian("2021-04-07",5,"PROGRAMOWANIE OBIEKTOWE");
	Dane dan = new Dane("Adam","Manczak","2004-09-16");
		System.out.println("==========Sprawdzian==========");
		System.out.println(spr.data);
		System.out.println(spr.ocena);
		System.out.println(spr.przedmiot);
		System.out.println("=============Dane=============");
		System.out.println(dan.toString());
	}
}