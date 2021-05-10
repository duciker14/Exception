package duc.basic.dev;

public class NotValidEmail extends Exception {

	String message;
	
	public	NotValidEmail(String message) {
		super();
		this.message = message;
	}
}
