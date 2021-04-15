package sorting.algorithms;

public class MERGE_SORT {

	int[] array;
	int[] tempMergeArray;
	int length;

	public static void main(String[] args) {

		int[] inputArray;

	}

	public void sort(int inputArray[]) {

		this.array = inputArray;
		this.length = inputArray.length;
		this.tempMergeArray = new int[length];

	}

	public void divideArray(int lowerIndex, int higherIndex) {

		if (lowerIndex < higherIndex) {

			int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
			// divide the left half of the array
			divideArray(lowerIndex, middle);
			// divide the right half of the array
			divideArray(middle + 1, higherIndex);

			mergeArray(lowerIndex, middle, higherIndex);

		}

	}

	public void mergeArray(int lowerIndex, int middle, int higherIndex) {

		for (int i = lowerIndex; i <= higherIndex; i++) {
			this.tempMergeArray[i] = array[i];
		}

		int i = lowerIndex;
		int j = middle + 1;
		int k = lowerIndex;

		while (i <= middle && j <= higherIndex) {

			if (tempMergeArray[i] <= tempMergeArray[j]) {

			}

		}
	}

}
