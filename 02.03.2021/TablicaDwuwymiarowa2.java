class TablicaDwuwymiarowa2{
	public static void main(String [] args){
		
	}
	
	private static void tablica2x2(){
		int [][] tab = new int[5][2];
		tab[0][0] = 0;
		tab[1][0] = 1;
		tab[2][0] = 2;
		tab[3][0] = 3;
		for (int i=0;i<tab.length;i++){
			for (int j=0;i<tab[j].length;j++){
				System.out.println(tab[i][j]);
			}
			System.out.println("Koniec pętli ze zmienną i");
		}
		System.out.println("Koniec pętli ze zmienną i");
	}
	}
	
	
}