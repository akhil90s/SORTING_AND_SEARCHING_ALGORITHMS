package sorting.algorithms;

// https://www.geeksforgeeks.org/insertion-sort/
// Time Complexity: O(n*n)
public class INSERTION_SORT {
	
	public static void main(String[] args) {

		int arr[] = { 12, 11, 13, 5, 6 };
		
		insertionSortingAlgorithm(arr);

	}

	public static void insertionSortingAlgorithm(int arr[]) {

		int n = arr.length;
		for (int i = 1; i < n; i++) {
			int key = arr[i];
			int j = i - 1;
			/*
			 * Move elements of arr[0..i-1], that are greater than key, to one position
			 * ahead of their current position 
			 */
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
		printArray(arr);

	}

	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");

		System.out.println();
	}

}
