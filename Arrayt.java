package array_praktike;

import java.util.Scanner;

import java.util.Arrays;

public class Arrayt {
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		int[] array;
		String[] array1;
		//1
		//array = radhitArrayNumerik();
		//2
		//array1 = radhitArrayString();
		//3
		//array = shumaArray();
		//4
		//array = kontrolloArrayPerNumer();
		//5
		//array = gjejIndexin();
		//6
		//array = fshihElement();
		//7
		//array = futNjeElementNeIndexinN();
		//8
		//gjejElementinMeTeMadheMeTeVogel();
		//9
		//array =ktheNumrinMbrapsht();
		//10
		//array = gjejDublikimet();
		//11
		array1 = gjejDbulikimetString();
		//12
		//array1 = gjejElemtetPerBashket();
		//13
		//array = gjeElementePerbashketint();
		//14
		//array = fshihTeDublikuarat();
		//15
		//array =vleraDyteMeEVogel();
		//16
		//array = vleraDyteMeEMadhe();
	}
	
	static int[] radhitArrayNumerik() {
		
		System.out.println("Fut gjatesine e arrayt: ");
		int gjatesia = input.nextInt();
		int[] array = new int[gjatesia];
		System.out.println("Fut elementet e arrayt: ");
		for(int i  = 0; i < gjatesia; i++) {
			System.out.println("fut elementin e " + (i+1));
			array[i] = input.nextInt();
		}
		for(int i = 0; i < gjatesia - 1; i++) {
			for(int j = i + 1; j < gjatesia; j++) {
				if(array[i] > array[j]) {
					int swap = array[i];
					array[i] = array[j];
					array[j] = swap;
				}
			}
		}
		System.out.println("Elementet e radhitur te array jane: ");
		for (int i = 0; i < gjatesia; i++) {
			System.out.println(array[i]);
		}
		return array;
	}

	static String[] radhitArrayString() {
		 
		System.out.println("Fut gjatesine e array: ");
		int gjatesia = input.nextInt();
		String[] array = new String[gjatesia];
		System.out.println("Mbush array string: ");
		for(int i = 0; i < gjatesia; i++) {
			System.out.println("fut elementin e " + (i+1) + " :");
			array[i] = input.next();
		}
		System.out.println("Array fillestar : " + Arrays.toString(array));
		Arrays.sort(array);
		System.out.println("array i rregulluar : " + Arrays.toString(array));
		
		return array;
	}
	
	static int[] shumaArray() {
		System.out.println("gjatesia array pare: ");
		int gjatesia1 = input.nextInt();
		System.out.println("gjatesia array dyte: ");
		int gjatesia2 = input.nextInt();
		int[] array1 = new int[gjatesia1];
		int[] array2 = new int[gjatesia2];
		System.out.println("Mbush array1");
		for(int i = 0; i < array1.length; i++) {
			System.out.println("fut elementin: " + (i+1));
			array1[i] = input.nextInt();
		}
		System.out.println("Mbush array2");
		for(int i = 0; i < array2.length; i++) {
			System.out.println("fut elementin: " + (i+1));
			array2[i] = input.nextInt();
		}
		int max;
		if(gjatesia1 >= gjatesia2) {
			max = gjatesia1;
		} else {
			max = gjatesia2;
		}
		int[] arrayShuma = new int[max];
		for(int i = 0; i < max; i++) {
			if(i < gjatesia1 && i < gjatesia2) {
				arrayShuma[i] = array1[i] + array2[i];
			} else {
				if (i < gjatesia1) {
					arrayShuma[i] = array1[i];
				} else {
					arrayShuma[i] = array2[i];
				}
			}
		}
		System.out.println("array shuma : " + Arrays.toString(arrayShuma));
		return arrayShuma;
		
	}

	static int[] kontrolloArrayPerNumer() {
		System.out.println("Fut gjatesine e arrayt: ");
		int gjatesia = input.nextInt();
		int[] array = new int[gjatesia];
		System.out.println("Fut elementet e arrayt: ");
		for(int i  = 0; i < gjatesia; i++) {
			System.out.println("fut elementin e " + (i+1));
			array[i] = input.nextInt();
		}
		System.out.println("fut numrin qe doni te kontrolloni: ");
		int n = input.nextInt();
		for(int i = 0; i < gjatesia; i++) {
			if(array[i] == n) {
				System.out.println("numri qe ju keni futur eshte elementi: " + (i+1) + " me index " + i);
				break;
			} else {
				if(i == gjatesia-1) {
					System.out.println("elementi nuk u gjet.");
				}
			}
		}
		System.out.println("elementet e array jane: " + Arrays.toString(array));
		return array;
	}
	
	static int[] gjejIndexin() {
		System.out.println("Fut gjatesine e arrayt: ");
		int gjatesia = input.nextInt();
		int[] array = new int[gjatesia];
		System.out.println("Fut elementet e arrayt: ");
		for(int i  = 0; i < gjatesia; i++) {
			System.out.println("fut elementin e " + (i+1));
			array[i] = input.nextInt();
		}
		System.out.println("shkruaj elementin qe kerkoni ti gjeni indeksin: ");
		int indeks = input.nextInt();
		for(int i = 0; i < gjatesia; i++) {
			if(indeks == i) {
				System.out.println("elementi qe keni futur ka indeksin: " + i);
			} else {
				if(i == gjatesia -1) {
					System.out.println("ju nuk keni futur nje element te arrayt!");
				}
			}
		}
		return array;
	}

	static int[] fshihElement() {
		System.out.println("Fut gjatesine e arrayt: ");
		int gjatesia = input.nextInt();
		int[] array = new int[gjatesia];
		System.out.println("Fut elementet e arrayt: ");
		for(int i  = 0; i < gjatesia; i++) {
			System.out.println("fut elementin e " + (i+1));
			array[i] = input.nextInt();
		}
		int j;
		System.out.println("Array fillestar eshte: " + Arrays.toString(array));
		System.out.println("fut numrin qe doni te fshini: ");
		int n = input.nextInt();
		for(int i = 0; i < gjatesia;i =i+1) {
			if(array[i] != n) {
				continue;
			}
			 for(j = 0; j < gjatesia-1; j++) {
				 array[i] = array[j];
			 }
				
			
			
			
		}
		System.out.println("array me elementin e fshire eshte : " + Arrays.toString(array));
		return array;
	}
	
	static int[] futNjeElementNeIndexinN() {
		System.out.println("Fut gjatesine e arrayt: ");
		int gjatesia = input.nextInt();
		int[] array = new int[gjatesia];
		System.out.println("Fut elementet e arrayt: ");
		for(int i  = 0; i < gjatesia; i++) {
			System.out.println("fut elementin e " + (i+1));
			array[i] = input.nextInt();
		}
		System.out.println("fut numrin qe doni te fusni: ");
		int element = input.nextInt();
		System.out.println("fut indeksin ku doni te fusni: ");
		int n = input.nextInt();
		System.out.println("Array fillestar eshte: " + Arrays.toString(array));
		for(int i = 0; i < gjatesia; i++ ) {
			array[n] = element;
		}
		System.out.println("array me element te zevendesuar: " + Arrays.toString(array));
		return array;
	}

	static int[] gjejElementinMeTeMadheMeTeVogel() {
		System.out.println("Fut gjatesine e arrayt: ");
		int gjatesia = input.nextInt();
		int[] array = new int[gjatesia];
		int elementiVogel = 999999999;
		int elementiMadh = 0;
		System.out.println("Fut elementet e arrayt: ");
		for(int i  = 0; i < gjatesia; i++) {
			System.out.println("fut elementin e " + (i+1));
			array[i] = input.nextInt();
		}
		for(int i = 0; i < gjatesia;i++) {
			if(elementiMadh < array[i]) {
				elementiMadh = array[i];
			}
			if(elementiVogel > array[i]) {
				elementiVogel = array[i];
			}
		}
		System.out.println("Elementi me i vogel: " + elementiVogel);
		System.out.println("Elementi me i madh: " + elementiMadh);
		return array;
	}
	
	static int[] ktheNumrinMbrapsht() {
		System.out.println("Fut gjatesine e arrayt: ");
		int gjatesia = input.nextInt();
		int[] array = new int[gjatesia];
		System.out.println("Fut elementet e arrayt: ");
		for(int i  = 0; i < gjatesia; i++) {
			System.out.println("fut elementin e " + (i+1));
			array[i] = input.nextInt();
		}
		System.out.println("Array fillestar eshte: " + Arrays.toString(array));
	
		for(int i = 0; i < gjatesia /2;i++) {
			int swap = array[i];
			array[i] = array[array.length-i-1];
			array[array.length-i-1] = swap;
		}
		
		System.out.println("Array mbrapsht eshte: " + Arrays.toString(array) );
		return array;
	}

	static int[] gjejDublikimet() {
		System.out.println("Fut gjatesine e arrayt: ");
		int gjatesia = input.nextInt();
		int[] array = new int[gjatesia];
		System.out.println("Fut elementet e arrayt: ");
		for(int i  = 0; i < gjatesia; i++) {
			System.out.println("fut elementin e " + (i+1));
			array[i] = input.nextInt();
		}
		for(int i = 0; i < gjatesia - 1; i++) {
			for(int j = i+1; j < gjatesia; j++) {
				if(array[i] == array[j]) {
					System.out.println("elemti " + array[i] + " Eshte i dublikuar");
				}
			}
		}
		return array;
	}

	static String[] gjejDbulikimetString() {
		System.out.println("Fut gjatesine e arrayt: ");
		int gjatesia = input.nextInt();
		String[] array = new String[gjatesia];
		System.out.println("Fut elementet e arrayt: ");
		for(int i  = 0; i < gjatesia; i++) {
			System.out.println("fut elementin e " + (i+1));
			array[i] = input.next();
		}
		for(int i = 0; i < gjatesia - 1; i++) {
			for(int j = i + 1; j < gjatesia; j++) {
				if(array[i].equalsIgnoreCase(array[j])) {
					System.out.println("Elementi " + array[i] + " eshte i dublikuar");
				}
			}
		}
		return array;
		
	}
	
	static String[] gjejElemtetPerBashket() {
		String[] array1, array2;
		System.out.println("Fut gjatesine e arrayt: ");
		int gjatesia1 = input.nextInt();
		array1 = new String[gjatesia1];
		System.out.println("Fut elementet e arrayt: ");
		for(int i  = 0; i < gjatesia1; i++) {
			System.out.println("fut elementin e " + (i+1));
			array1[i] = input.next();
		}
		System.out.println("Fut gjatesine e arrayt: ");
		int gjatesia2 = input.nextInt();
		array2 = new String[gjatesia2];
		System.out.println("Fut elementet e arrayt: ");
		for(int i  = 0; i < gjatesia2; i++) {
			System.out.println("fut elementin e " + (i+1));
			array2[i] = input.next();
		}
		for(int i = 0; i < array1.length; i++) {
			for(int j = 0; j < array2.length; j++) {
				if(array1[i].equalsIgnoreCase(array2[j])) {
					System.out.println("Elementi: " + array1[i] + " eshte i perbashket edhe tek array 2: " + array2[j]);
				}
			}
		}
		return array1;
	}

	static int[] gjeElementePerbashketint() {
		System.out.println("Fut gjatesine e arrayt: ");
		int gjatesia1 = input.nextInt();
		int[] array1 = new int[gjatesia1];
		System.out.println("Fut elementet e arrayt: ");
		for(int i  = 0; i < gjatesia1; i++) {
			System.out.println("fut elementin e " + (i+1));
			array1[i] = input.nextInt();
		}
		System.out.println("Fut gjatesine e arrayt: ");
		int gjatesia2 = input.nextInt();
		int[] array2 = new int[gjatesia2];
		System.out.println("Fut elementet e arrayt: ");
		for(int i  = 0; i < gjatesia2; i++) {
			System.out.println("fut elementin e " + (i+1));
			array2[i] = input.nextInt();
		}
		for(int i = 0; i < array1.length; i++) {
			for(int j = 0; j < array2.length; j++) {
				if(array1[i] == array2[j]) {
					System.out.println("Elementi: " + array1[i] + " eshte i perbashket edhe tek array 2: " + array2[j]);
				}
			}
		}
		return array1;
	}
	
	static int[] fshihTeDublikuarat() {
		System.out.println("Fut gjatesine e arrayt: ");
		int gjatesia1 = input.nextInt();
		int[] array1 = new int[gjatesia1];
		System.out.println("Fut elementet e arrayt: ");
		for(int i  = 0; i < gjatesia1; i++) {
			System.out.println("fut elementin e " + (i+1));
			array1[i] = input.nextInt();
		}
		System.out.println("array vjeter eshte : " + Arrays.toString(array1));
		int joDublikime = array1.length;
		
		for(int i = 0; i < joDublikime; i++) {
			for(int j = i+1; j < joDublikime; j++) {
				if(array1[i] == array1[j]) {
					array1[j] = array1[joDublikime-1];
					joDublikime--;
					j--;
				}
			}
		}
		int[] array2 = Arrays.copyOf(array1, joDublikime);
		System.out.println("array ri eshte : " + Arrays.toString(array2));
		for(int i = 0; i < array2.length; i++) {
			System.out.println(array1[i]);
		}
		return array1;
	}
	
	static int[] vleraDyteMeEVogel() {
		System.out.println("Fut gjatesine e arrayt: ");
		int gjatesia = input.nextInt();
		int[] array = new int[gjatesia];
		System.out.println("Fut elementet e arrayt: ");
		for(int i  = 0; i < gjatesia; i++) {
			System.out.println("fut elementin e " + (i+1));
			array[i] = input.nextInt();
		}
		int min = Integer.MAX_VALUE;
		int min2 = Integer.MAX_VALUE;
		for(int i = 0; i < array.length; i++) {
			if(array[i] == min) {
				min = array[i];
			} else if (array[i] < min) {
				min2 = min;
				min = array[i];
			}else {
				if(array[i] < min2)
					min2 = array[i];
			}
			
		}
		System.out.println("vlera min: " + min + "vlera 2 : " + min2);
		return array;
	}

	static int[] vleraDyteMeEMadhe() {
		System.out.println("Fut gjatesine e arrayt: ");
		int gjatesia = input.nextInt();
		int[] array = new int[gjatesia];
		System.out.println("Fut elementet e arrayt: ");
		for(int i  = 0; i < gjatesia; i++) {
			System.out.println("fut elementin e " + (i+1));
			array[i] = input.nextInt();
		}
		int max = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		for(int i = 0; i < array.length; i++) {
			if(array[i] > max) {
				max2 = max;
				max = array[i];
			} else {
				if(array[i] > max2) {
					max2 = array[i];
				}
			}
		}
		System.out.println("Vlera madhe : " + max + ", Vlera dyte : " + max2);
		return array;
	}
}
