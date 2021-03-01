import java.util.Scanner;

class kalkulator{
	public static void main(String [] arg){
		Scanner sc = new Scanner(System.in);
		System.out.println("Wybierz dzialanie \n[+] - Dodawanie\n[-] - Odejmowanie\n[*] - Mnozenie\n[/] - Dzielenie\n[^] - Potegowanie\n[p] - Pierwiastkowanie");
		String operation = sc.next();
		if(operation.equals("+")){
			System.out.println("Wybrales dodawanie");
		} else if(operation.equals("-")){
			System.out.println("Wybrales odejmowanie");
		} else if(operation.equals("*")){
			System.out.println("Wybrales mnozenie");
		} else if(operation.equals("/")){
			System.out.println("Wybrales dzielenie");
		} else if(operation.equals("^")){
			System.out.println("Wybrales potegowanie");
		} else if(operation.equals("p")){
			System.out.println("Wybrales pierwiastkowanie");
		} else {
			System.out.println("Zle dzialanie");
		}
		
}
}