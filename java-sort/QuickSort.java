

import java.util.Arrays;

public class QuickSort {

	public static void main(String args[]) {
		
		int numbers[] = { 10, 7, 8, 9, 1, 5 };
		
		System.out.println("Unsortiert:\t" + Arrays.toString(numbers));
		quickSort(numbers);
		System.out.println("Sortiert:\t" + Arrays.toString(numbers));
	}

	public static void quickSort(int[] numbers) {
		
		quickSort(numbers, 0, numbers.length - 1);
	}
	
	private static void quickSort(int[] numbers, int start, int end) {
		
		if (start < end) {
			
			int pivot = partition(numbers, start, end);

			quickSort(numbers, start, pivot - 1);
			quickSort(numbers, pivot + 1, end);
		}
	}
	
	private static int partition(int[] numbers, int start, int end) {
		
		int pivot = numbers[end];
		
		int i = start - 1;
		
		for (int j = start; j < end; j++) {
			if (numbers[j] < pivot) {
				i++;

				int temp = numbers[i];
				numbers[i] = numbers[j];
				numbers[j] = temp;
			}
		}

		int temp = numbers[i + 1];
		numbers[i + 1] = numbers[end];
		numbers[end] = temp;

		return i + 1;
	}
}

// Sort Animation: https://www.youtube.com/watch?v=tIYMCYooo3c
