package Day1assignment;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		int arr[] = new int[5];
		Scanner in = new Scanner(System.in);
		System.out.println("Enter numbers");
		for(int i=0; i<5; i++) {
			arr[i]= in.nextInt();
		}
		System.out.println("Original array");
		printArray(arr);
		System.out.println();
		System.out.println("Copied array");
		int arr_copied[] = copyOf(arr);
		printArray(arr_copied);
		in.close();
	}

	private static void printArray(int[] arr) {
		for(int i=0; i<5; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static int[] copyOf(int[] array) {
		int m = array.length;
		int arr1 [] = new int[m];
		for(int i=0; i<m; i++) {
			arr1[i]= array[i];
		}
		return arr1;
	}
}
