import java.util.Scanner;
import java.io.*;

class Zapis{
	public static void main(String [] a){
		File f = new File("dane.text");
		Scanner sc = new Scanner(System.in);
		FileWriter fw = FileWriter(f);
		String temp = "";
		while(!temp.equals("exit")){
			temp = sc.nextLine();
			if(!temp.equals("exot")){
			s = s+"\n"+temp;
			}
		}
		try{
			FileWriter fw = new FileWriter(f);
			fw.write(s);
			fw.close();
		} catch(IOException e){
			System.out.println("EROR: "+e.toString());
		}
	}
}