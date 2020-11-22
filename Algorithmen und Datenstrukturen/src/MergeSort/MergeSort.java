package MergeSort;

public class MergeSort {
	
	public int[] sort(int[] array, int a, int b) {
		if (a < b) {
			int mid = (a+b)/2;
			sort(array, a, mid);
			sort(array, mid+1, b);
			merge(array, a, mid, b);
		}
		
		return array;
	}

	private void merge(int[]array, int a, int mid, int b) {
		int[] arr = new int[array.length];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = array[i];
		}
		
		for (int i = mid+1; i <= b; i++) {
			arr[b+mid+1-i] = array[i];
		}
		
		int i = a;
		int j = b;
		
		for (int k = i; k <= b; k++) {
			if (arr[i] <= arr[j]) {
				array[k] = arr[i];
				i++;
			} else {
				array[k] = arr[j];
				j--;
			}
		}
		
	}
	
	public static void main(String[] args) {
		int[] array = {10,4,3,50,-8,100};
		
		MergeSort sort = new MergeSort();
		
		sort.sort(array, 0, 5);
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
