package array_praktike;

import java.util.Scanner;

public class Mblidh2matricaTeNdryshme {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
		int [][]matricaShume = new int[3][5];
		matricaShume = mblidhMatrica(matricaShume);
		
	}
	
	static int[][] mblidhMatrica(int[][] matricaShume) {
		int m = 2;
		int n = 3;
		int k = 3;
		int l = 5;
		
		int[][] matrica1 = new int[m][n];
		int[][] matrica2 = new int[k][l];
		System.out.println("Mbush matricen e pare: ");
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				System.out.println("Fut elementin e " + (j+1) + " ne rreshtin " + (i+1));
				matrica1[i][j] = input.nextInt();
			}
		}
		System.out.println();
		System.out.println("Mbush matricen e dyte: ");
		for(int i = 0; i < k; i++) {
			for(int j = 0; j < l; j++) {
				System.out.println("Fut elementin e " + (j+1) + " ne rreshtin " + (i+1));
				matrica2[i][j] = input.nextInt();
			}
		}
		System.out.println("matrica e pare: {");
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(matrica1[i][j] + ", ");
			}
			System.out.println();
		}
		System.out.println("}");
		System.out.println();
		System.out.println("matrica e dyte: {");
		for(int i = 0; i < k; i++) {
			for(int j = 0; j < l; j++) {
				System.out.print(matrica2[i][j] + ", ");
			}
			System.out.println();
		}
		System.out.println("}");
		System.out.println();
		
		for(int i = 0; i < k; i++) {
			for(int j = 0; j < l; j++) {
				if(i < m && j < n) {
					matricaShume[i][j] = matrica1[i][j] + matrica2[i][j];
				} else {
					matricaShume[i][j] = matrica2[i][j];
				}
				
			}
		}

		System.out.println("matrica e shume: {");
		for(int i = 0; i < k; i++) {
			for(int j = 0; j < l; j++) {
				System.out.print(matricaShume[i][j] + ", ");
			}
			System.out.println();
		}
		return matricaShume;
	}

}
