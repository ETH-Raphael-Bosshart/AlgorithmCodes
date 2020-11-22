package OwnSortingAlgorithm;

import BubbleSort.BubbleSort;

public class Sort {

	public int[] sort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				int lowest = array[i];
				if (lowest > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}

		return array;
	}

	public static void main(String[] args) {

		int[] numbers = { 3, 5, 0, -10, 400, 1, 40, 33, -1, 3040, 12 };

		Sort arraysortieren = new Sort();

		int[] loesung = arraysortieren.sort(numbers);
		System.out.println("sortiert:\n");
		for (int i = 0; i < loesung.length; i++) {
			System.out.print(loesung[i] + " ");
		}

	}

}
