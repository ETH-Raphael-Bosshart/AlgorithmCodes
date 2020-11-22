package QuickSort;

public class QuickSort {

	public int[] quickSort(int[] array, int low, int high) {
		int pivot = array[high];
		int i = low;
		int j = high;

		while (i <= j) {
			while (array[i] < pivot) {
				i++;
			}
			while (array[j] > pivot) {
				j--;
			}

			if (i <= j) {
				int zahl = array[i];
				array[i] = array[j];
				array[j] = zahl;
				j--;
				i++;
			}
		}

		if (low < j) {
			quickSort(array, low, j);
		}

		if (high > i) {
			quickSort(array, i, high);
		}

		return array;
	}
	
	public static void main(String[] args) {
		int[] array = {10, 50, -40, 1000, -4, 8};
		QuickSort sort = new QuickSort();
		
		sort.quickSort(array, 0, array.length-1);
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
