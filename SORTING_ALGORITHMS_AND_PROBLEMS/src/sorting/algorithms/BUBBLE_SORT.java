package sorting.algorithms;

// https://www.geeksforgeeks.org/bubble-sort/
// Time Complexity: O(n*n)
public class BUBBLE_SORT {

	public static void main(String[] args) {
	
		int array[] = { 12, 11, 13, 5, 7 };
		bubbleSort(array);

	}

	// In first iteration the largest element would be at the right most part of the
	// array. Similarly in the following iteration the right most part of array gets sorted first.
	static void bubbleSort(int[] array) {

		int n = array.length;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < n - i; j++) {
				if (array[j - 1] > array[j]) {
					int temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;
				}
			}
			printArray(array);
		}
	}

	public static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");

		System.out.println();
	}

}
