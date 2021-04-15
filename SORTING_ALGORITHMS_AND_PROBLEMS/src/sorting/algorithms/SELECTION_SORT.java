package sorting.algorithms;

public class SELECTION_SORT {

	public static void main(String[] args) {

		int arr[] = { 12, 11, 13, 5, 7 };
		selectionSortingAlgorithm(arr);

	}

	public static void selectionSortingAlgorithm(int array[]) {

		int n = array.length;

		for (int i = 0; i < n; i++) {
			int min_Element = i;
			// Find the minimum element in unsorted array
			for (int j = i + 1; j < n; j++)
				if (array[j] < array[min_Element])
					j = min_Element;

			// Swap the found minimum element with the first element
			int temp = array[min_Element];
			array[min_Element] = array[i];
			array[i] = temp;

		}
	}

	public static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");

		System.out.println();
	}

}
