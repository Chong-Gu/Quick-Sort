package quick;

public class quick_sort {
	public void main (String[] arg) {
		int[] arr = {5, 1, 6, 2, 3, 4};
		printArray(arr);
		quickSort(arr, 0, arr.length-1);
		printArray(arr);
	}
	
	
	private static void printArray(int[] arr) {
		for (int i: arr) 
			System.out.print(i + " ");
		
		System.out.print("\n");
	}
	
	public static void quickSort(int[] arr, int start, int end) {
		if (start < end) {
			int index = partition(arr, start, end);
			
			
		}
	}
	
	private static int partition(int[] arr, int start, int end) {
		int pivot = arr[end];
		int i = start;
		
		for (int j = start; j < end; j++) {
			// If current element is smaller than the pivot
			if (arr[j] <= pivot) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
			}
		}
		
		int temp = arr[i];
		arr[i] = arr[end];
		arr[end] = temp;
		
		return i;
	}
}
