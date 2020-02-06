

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {

		int[] numbers = { 4, 1, 8, -3, 5, 7 };
		
		System.out.println("Unsortiert:\t" + Arrays.toString(numbers));
		selectionSort(numbers);
		System.out.println("Sortiert:\t" + Arrays.toString(numbers));
	}

	public static void selectionSort(int[] numbers) {
		
		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] > numbers[j]) {
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
	}
}

// Sort Animation: https://www.youtube.com/watch?v=wnKQsow7ERI
