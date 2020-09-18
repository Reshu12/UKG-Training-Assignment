package Day4Assignment;

public class InputException extends RuntimeException {
	public InputException(int n) {
		super("Number can't be greater than "+ n);
	}
}
