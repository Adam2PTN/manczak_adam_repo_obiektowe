import java.util.Scanner;

public class Main{
    private static String name;
    private static int cash;
    private static int bet;
    private static int aceCounter;
    private static int handvalue;
    
    public static void main(String[] args){
        System.out.println("Podaj swoje imie: ");
        Scanner namescan = new Scanner(System.in);
        name = namescan.nextLine();
        System.out.println(name);
        System.out.println("Z jaka waluta chcesz rozpoczac gre?");
        Scanner money = new Scanner(System.in);
        cash = money.nextInt();
        System.out.println(cash);
    }
}