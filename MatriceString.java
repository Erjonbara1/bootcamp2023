package array_praktike;

import java.util.Scanner;

public class MatriceString {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		//nje matrice ruan reviewt qe jane bere per 5 filma te ndryshem nga 10 profesioniste 1* deri ne 5*
				//printo reviewt per secilin film
				//ruaj ne nje array 1d reviewt totale per cdo film
				//te printohet indexi i filmit qe ka me shume review
			//review qe mund te jepen per nje film jane nga 1* ne 5*
		int[][] matrica = new int [5][10];
		reviewPerFilma(matrica);
	}
	
	static void reviewPerFilma(int[][] matrica) {
		
		System.out.println("Mbushim matricen me review");
		for(int i = 0; i < matrica.length; i++) {
			System.out.println("Filmi i " + (i+1));
			for(int j = 0; j < matrica[i].length; j++) {
				System.out.println("Fut review e Profesionistit te " + (j+1) + " : per filmin e " + (i+1));
				matrica[i][j] = input.nextInt();
				while(matrica[i][j] > 5) {
						System.out.println("fusni nje numer nga 1 ne 5");
						matrica[i][j] = input.nextInt();
				}	
			}
		}
		int[] filmi = new int [matrica.length];
		int shuma1 = 0, shuma2 = 0, shuma3 = 0, shuma4 = 0, shuma5 = 0;
		System.out.println(" Printojme reviewt per secilin film: ");
		for(int i = 0; i < matrica.length; i++) {
			System.out.println("Filmi i " + (i+1) + " ka review per secilin profesionist: {");
			for(int j = 0; j < matrica[i].length; j++) {
				System.out.print(matrica[i][j] + ",");
				
				if(i == 0){
					shuma1 += matrica[i][j];
					filmi[i] = shuma1; 
				}
				if(i == 1){
					shuma2 += matrica[i][j];
					filmi[i] = shuma2;
				}
				if(i == 2){
					shuma3 += matrica[i][j];
					filmi[i] = shuma3;
				}
				if(i == 3){
					shuma4 += matrica[i][j];
					filmi[i] = shuma4;
				}
				if(i == 4){
					shuma5 += matrica[i][j];
					filmi[i] = shuma5;
				}
			}
			System.out.print("},");
			System.out.println();
			System.out.println();
		}
		int max = 0;
		int indexi = 0;
		for(int i = 0; i < matrica.length; i++) {
			if(max < filmi[i]) {
				max = filmi[i];
				indexi = i;
			}
		}
		System.out.println("Filmi qe ka me shume review eshte filmi me index " + indexi + ": Totali eshte : " + filmi[indexi]);	
	}
}
