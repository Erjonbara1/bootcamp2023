package array_praktike;

import java.util.Scanner;

public class MblidhMatricaMeInput {
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Fut gjatesine e rreshtave te matrices se pare: ");
		int m = input.nextInt();
		System.out.println("Fut gjatesine e kolonave te matrices se pare: ");
		int n = input.nextInt();
		
		int[][] matrica1 = new int[m][n];
		System.out.println("Mbush matricen e pare: ");
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				System.out.println("Fut elementin e " + (j+1) + " ne rreshtin " + (i+1));
				matrica1[i][j] = input.nextInt();
			}
		}
		System.out.println();System.out.println("Fut gjatesine e rreshtave te matrices se dyte: ");
		int k = input.nextInt();
		System.out.println("Fut gjatesine e kolonave te matrices se dyte: ");
		int l = input.nextInt();
		
		int[][] matrica2 = new int[k][l];
		System.out.println("Mbush matricen e dyte: ");
		for(int i = 0; i < k; i++) {
			for(int j = 0; j < l; j++) {
				System.out.println("Fut elementin e " + (j+1) + " ne rreshtin " + (i+1));
				matrica2[i][j] = input.nextInt();
			}
		}
		int rreshtatMax;
		int kolonatMax;
		if( m < k) {
			rreshtatMax = k;
		} else {
			rreshtatMax = m;
		}
		if( n < l) {
			kolonatMax = l;
		} else {
			kolonatMax = n;
		}
		int[][] matricaShume = new int[rreshtatMax][kolonatMax];
		
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
		
		for(int i = 0; i < rreshtatMax; i++) {
			for(int j = 0; j < kolonatMax; j++) {
				
				if(i < m && i < k && j < n && j < l) {
					matricaShume[i][j] = matrica1[i][j] + matrica2[i][j];
				} else if(i < m && i < k && j < n && j >= l) {
					matricaShume[i][j] = matrica1[i][j];
				} else if(i < m && i < k && j >= n && j < l) {
					matricaShume[i][j] = matrica2[i][j];
				} else if(i < m && i >= k && j < n) {
					matricaShume[i][j] = matrica1[i][j];
				} else if(i >= m && i < k && j < l) {
					matricaShume[i][j] = matrica2[i][j];
				} else {
					matricaShume[i][j] = 1;
				}
				
			}
		}

		System.out.println("matrica e shume: {");
		for(int i = 0; i < rreshtatMax; i++) {
			for(int j = 0; j < kolonatMax; j++) {
				System.out.print(matricaShume[i][j] + ", ");
			}
			System.out.println();
		}
		
	}

}
