package InsertionSort;

import BubbleSort.BubbleSort;

public class InsertionSort {
	
	public int[] InsertionSort (int[] array) {
		for (int i = 1; i < array.length; i++) { //1, da erste Zahl schon als sortiert angesehen wird
			int zahl = array[i]; //die zu sortierende Zahl
			int j = i;
			while(j > 0 && array[j-1] > zahl) { //mit was muss die zu sortierende Zahl verglichen werden
				array[j] = array[j-1]; //Wenn die zu sortierende Zahl < als die Zahl davor, wird getauscht
				j--;
			}
			array[j] = zahl;
		}
		
		return array;
	}
	
	public static void main(String[] args) {
		 
	    int[] numbers = {3, 5, 0, -10, 400, 1, 40, 33, -1, 3040, 12};
	    
	    InsertionSort arraysortieren = new InsertionSort();
	 
	    int[] loesung = arraysortieren.InsertionSort(numbers);
	    System.out.println("sortiert:\n");
	    for (int i = 0; i < loesung.length; i++) {
	        System.out.print(loesung[i] + " ");
	    }
	 
	    }
	

}
