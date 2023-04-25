package array_praktike;

public class matrica {
	
	public static void main(String[] args) {
		int[][] matrica = {
				{1, 2, 3, 4, 5},
				{4, 5, 6, 7, 8},
				{1, 2, 3, 4, 5},
				{1, 4, 5, 6, 7},
				{9, 6, 7, 8, 5}
		};
		njeKuadrat(matrica);
		njeKuadratShuma(matrica);
		
	}
	
	static void njeKuadrat(int[][] matrica) {
		int shuma = 0;
		for(int i = 0; i < (matrica.length + 1) / 2; i++) {
			for(int j = 0; j < (matrica.length + 1)/2; j++) {
				shuma += matrica[i][j];
			}
		}
		System.out.println("shuma e kuadratit pare: " + shuma);
		
		int shuma2 = 0;
		for(int i = 0; i < (matrica.length + 1) / 2 ; i++) {
			for(int j = (matrica.length )/2 ; j < matrica.length ; j++) {
				shuma2 += matrica[i][j];
			}
		}
		System.out.println("shuma e kuadratit dyte: " + shuma2);
		
		int shuma3 = 0;
		for(int i = (matrica.length ) / 2; i < matrica.length ; i++) {
			for(int j = 0; j < (matrica.length + 1)/2; j++) {
				shuma3 += matrica[i][j];
			}
		}
		System.out.println("shuma e kuadratit trete: " + shuma3);
		
		int shuma4 = 0;
		for(int i = (matrica.length ) / 2; i < matrica.length  ; i++) {
			for(int j = (matrica.length )/2 ; j < matrica.length ; j++) {
				shuma4 += matrica[i][j];
			}
		}
		System.out.println("shuma e kuadratit katert: " + shuma4);
	
	}
	
	static void njeKuadratShuma(int[][] matrica) {
		int shuma = 0;
		int shuma1 = 0;
		int shuma2 = 0;
		int shuma3 = 0;
		for(int i = 0; i < matrica.length; i++) {
			for(int j = 0; j < matrica.length ; j++) {
				if(i < (matrica.length +1)/2 &&  j < (matrica.length + 1)/2) {
					shuma += matrica[i][j];
				}
				if(i < (matrica.length + 1)/2 &&  j >= (matrica.length - 1)/2){
					shuma1 += matrica[i][j];
				}
				if(i >= (matrica.length - 1)/2 &&  j < (matrica.length + 1)/2) {
					shuma2 += matrica[i][j];
				} 
				
				if(i >= (matrica.length - 1)/2 &&  j >= (matrica.length -1)/2) {
						shuma3 += matrica[i][j];
					}
				
			}
		}
		System.out.println("shuma e kuadratit pare: " + shuma);
		System.out.println("shuma e kuadratit dyte: " + shuma1);
		System.out.println("shuma e kuadratit trete: " + shuma2);
		System.out.println("shuma e kuadratit katert: " + shuma3);

	}
}
