package Day4Assignment;

import java.io.IOException;

public class Q7 {
	public static void throwException() throws InputException, IOException {
	}
	
	public static void main(String[] args) {
		
		try {
			throwException();
		} catch (InputException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}