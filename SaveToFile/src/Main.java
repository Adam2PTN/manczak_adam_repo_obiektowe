import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.print("Podaj wzrost: ");
        Scanner sc1 = new Scanner(System.in);
        int wzrost = sc1.nextInt();
        System.out.print("Podaj wage: ");
        Scanner sc2 = new Scanner(System.in);
        int waga = sc2.nextInt();
        System.out.print("Podaj wiek: ");
        Scanner sc3 = new Scanner(System.in);
        int wiek = sc3.nextInt();
        SaveToFile save = new SaveToFile();
        save.saveToFile();
    }
}
