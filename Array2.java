package array_praktike;

import java.util.*;

public class Array2 {
	
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		int[][] matrica = new int[4][4];
		matrica = matricaShume(matrica);
		
		
	}
	
	static int[][] matricaShume(int[][] matrica){
		int i = 0,j = 0,k,l,m,n;
		System.out.println("testsdfdsfsdfdfds");
		System.out.println("Futni numrat e rreshtave te matrices se pare: ");
		m = input.nextInt();
		System.out.println("Futni numrat e kolonave te matrices se pare: ");
		n = input.nextInt();
		int[][] matrica1 = new int[m][n]; 
		System.out.println("Mbushni matricen e pare: ");
		for(i = 0; i < m; i++) {
			for(j = 0; j < n; j++) {
				System.out.println("shtypni elementin e " + (j+1) + "; Ne rreshtin e " + (i+1));
				matrica1[i][j] = input.nextInt();
			}
		}
		System.out.println("Futni numrat e rreshtave te matrices se dyte: ");
		k = input.nextInt();
		System.out.println("Futni numrat e kolonave te matrices se dyte: ");
		l = input.nextInt();
		int[][] matrica2 = new int[m][n];
		System.out.println("Mbushni matricen e dyte: ");
		for(i = 0; i < k; i++) {
			for(j = 0; j < l; j++) {
				System.out.println("shtypni elementin e " + (j+1) + "; Ne rreshtin e " + (i+1));
				matrica2[i][j] = input.nextInt();
			}
		}	
		int kolonaMax,rreshtaMax;
		if(m < k) {
			rreshtaMax = k;
		} else {
			rreshtaMax = m;
		}
		if (n < l) {
			kolonaMax = l;
		} else {
			kolonaMax = n;
		}
		int[][] matricaShume = new int[rreshtaMax][kolonaMax];
		for(i = 0; i < rreshtaMax; i++) {
				for(j = 0; j < kolonaMax; j++) {
					if(i < m && i < k && j < n && j < l) {
						matricaShume[i][j] = matrica1[i][j] + matrica2[i][j];
					} else if (i < m && i < k && j >= n && j < l) {	
						matricaShume[i][j] =  matrica2[i][j];
					} else if(i < m && i >= k && j < n) {
						matricaShume[i][j] = matrica1[i][j];
					} else if(i >= m && i < k && j < l) {
						matricaShume[i][j] = matrica2[i][j];
					} else { 
						matricaShume[i][j] = 0;
					}
				}
		}		
		System.out.println("Matrica shume eshte: {");
		for(i = 0; i < k; i++) {
			for(j = 0; j < l; j++) {
				System.out.println("matrica shume ne rrjeshtin:  " + (i+1) + ","+(j+1) + ": ka elementin: " + matricaShume[i][j]);
			}
			
		}

		return matricaShume;
	}
	
	

}
