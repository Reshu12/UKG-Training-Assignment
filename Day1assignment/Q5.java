package Day1assignment;

public class Q5 {

	public static void main(String[] args) {
		int arr [][] = new int[8][8];
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j <= i; j++) {
				if (i >= j) {
					arr[i][j]= j+1;
				}
			}
		}
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (i >= j) {
					System.out.print(arr[i][j] + " ");
				}
			}
			System.out.println();
		}
	}
}
