

import java.util.Arrays;

public class MergeSort {

	public static void main(String args[]) {
		
		int numbers[] = { 10, 7, 8, 9, 1, 5 };
		
		System.out.println("Unsortiert:\t" + Arrays.toString(numbers));
		mergeSort(numbers);
		System.out.println("Sortiert:\t" + Arrays.toString(numbers));
	}

	public static void mergeSort(int[] numbers) {
		
		mergeSort(numbers, 0, numbers.length - 1);
	}
	
	private static void mergeSort(int numbers[], int start, int end) {
		
		if (start < end) {
			
			int middle = (start + end) / 2;

			mergeSort(numbers, start, middle);
			mergeSort(numbers, middle + 1, end);

			merge(numbers, start, middle, end);
		}
	}
	
	private static void merge(int numbers[], int start, int middle, int end) {
		
		int size_left = middle - start + 1;
		int size_right = end - middle;

		int numbers_left[] = new int[size_left];
		int numbers_right[] = new int[size_right];

		for (int i = 0; i < size_left; i++)
			numbers_left[i] = numbers[start + i];
		
		for (int j = 0; j < size_right; j++)
			numbers_right[j] = numbers[middle + 1 + j];

		int i = 0, j = 0;

		int k = start;
		while (i < size_left && j < size_right) {
			if (numbers_left[i] <= numbers_right[j]) {
				numbers[k] = numbers_left[i];
				i++;
			}
			else {
				numbers[k] = numbers_right[j];
				j++;
			}
			k++;
		}

		while (i < size_left) {
			numbers[k] = numbers_left[i];
			i++;
			k++;
		}

		while (j < size_right) {
			numbers[k] = numbers_right[j];
			j++;
			k++;
		}
	}
}

// Sort Animation: https://www.youtube.com/watch?v=dxuIwsPKRts
