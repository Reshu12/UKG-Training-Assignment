package Day1assignment;

public class Q2 {

	public static void main(String[] args) {
		int arr [] [] = new int[9][9];
		for (int i=1; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				arr[i-1][j-1]= i*j;
			}
		}
		for (int i=1; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.print(arr[i-1][j-1] + " ");
			}
			System.out.println();
		}
	}

}
