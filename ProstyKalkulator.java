import java.util.Scanner;

class ProstyKalkulator{
	public static void main(String [] arg){
		Scanner sc = new Scanner(System.in);
		System.out.println("Fajny kalkulator");
		System.out.println("Podaj pierwsza liczbe: ");
		float a = sc.nextInt();
		System.out.println("Podaj druga liczbe: ");
		float b = sc.nextInt();
		System.out.println("Podaj dzialanie [+ - * /]");
		String operation = sc.next();
		if(operation.equals("+")){
			System.out.println(a+" "+operation+" "+b+" = "+(a+b));
		} else if(operation.equals("-")){
			System.out.println(a+" "+operation+" "+b+" = "+(a-b));
		} else if(operation.equals("*")){
			System.out.println(a+" "+operation+" "+b+" = "+(a*b));
		} else if(operation.equals("/")){
			System.out.println(a+" "+operation+" "+b+" = "+(a/b));
		} else {
			System.out.println("\""+operation+"\" zle dzialanie");
		}
}
}