package sorting.algorithms;

public class QUICK_SORT {

	public static void main(String[] args) {

		int array[] = { 12, 11, 13, 5, 7 };
		int n = array.length;
		recursionQuickSort(array, 0, n - 1);

	}

	static void recursionQuickSort(int[] array, int low, int high) {

		int result = partition(array, low, high);

		if (low < result - 1) {
			partition(array, low, result - 1);
		}
		if (result < high) {
			partition(array, result, high);
		}
		printArray(array);

	}

	static int partition(int[] array, int low, int high) {
 
		int pivot = array[(low + high) / 2];

		while (low <= high) {

			while (array[low] < pivot) {
				low++;
			}
			while (array[high] > pivot) {
				high--;
			}
			if (low <= high) {

				int temp = array[low];
				array[low] = array[high];
				array[high] = temp;

				low++;
				high--;
			}

		}
		return low;
	}

	public static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");

		System.out.println();
	}

}
