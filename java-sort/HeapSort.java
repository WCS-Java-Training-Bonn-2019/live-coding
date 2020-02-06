

import java.util.Arrays;

public class HeapSort {

	public static void main(String args[]) {
		
		int numbers[] = { 9, 10, 5, 3, 1, 2, 6 };
		
		System.out.println("Unsortiert:\t" + Arrays.toString(numbers));
		heapSort(numbers);
		System.out.println("Sortiert:\t" + Arrays.toString(numbers));
	}	
	
	public static void heapSort(int numbers[]) {
		
		// heap size (amount of unsorted numbers)
		int size = numbers.length;

		// build max heap
		for (int i = size/2 - 1; i >= 0; i--)	
			heapify(numbers, size, i);

		// sort numbers
		for (int i = size - 1; i >= 0; i--) {

			// move root to sorted numbers
			int x = numbers[0];
			numbers[0] = numbers[i];
			numbers[i] = x;

			// bring largest number to the top
			heapify(numbers, i, 0);
		}
	}

	/** brings largest number to the top */
	private static void heapify(int numbers[], int size, int i) {
		
		int parent = i;
		int left_child = 2*i + 1;
		int right_child = 2*i + 2;

		// check left child
		if (left_child < size && numbers[left_child] > numbers[parent])
			parent = left_child;

		// check right child
		if (right_child < size && numbers[right_child] > numbers[parent])
			parent = right_child;

		// a child is larger than parent?
		if (parent != i) {
			
			// swap child and parent
			int temp = numbers[i];
			numbers[i] = numbers[parent];
			numbers[parent] = temp;

			// continue with swapped child (recursive)
			heapify(numbers, size, parent);
		}
	}
}

// Heap Sort Animation: https://www.youtube.com/watch?v=6iA9JMnP3O4
