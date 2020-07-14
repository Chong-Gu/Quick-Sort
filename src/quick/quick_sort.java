package quick;

public class quick_sort {
	public static void main (String[] arg) {
		int[] arr = {5, 1, 6, 2, 3, 4};
		printArray(arr);
	}
	
	
	private static void printArray(int[] arr) {
		for (int i: arr) 
			System.out.print(i + " ");
		
		System.out.print("\n");
	}
}
