package exceptions;

@SuppressWarnings("serial")
public class DontLikeFiveException extends Exception {

	public DontLikeFiveException() {
		super("The number 5 is not tolerated!");
	}
	
	public DontLikeFiveException(String message) {
		super(message);
	}
	
}
