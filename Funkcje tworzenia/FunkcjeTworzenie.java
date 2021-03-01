class FunkcjeTworzenie{
	public static void main(String [] a){
		
		double a = 4;
		double b = 9;
		double c = 12;
		
		double delta = obliczDelte(2,3,4);
		System.out.println("Delta = "+delta);
		if(delta<0){
			System.out.println("Delta ujemna brak miejsc zerowych");
		} else if(delta == 0){
			double x1 = miejsceZerowe(delta,a,b,0);
			System.out.println("x1=x2 = "+x1);
		} else {
			double x1 = miejsceZerowe(delta,a,b,1);
			double x2 = miejsceZerowe(delta,a,b,-1);
			System.out.println("x1 = "+x1);
			System.out.println("x2 = "+x2);
	}
}