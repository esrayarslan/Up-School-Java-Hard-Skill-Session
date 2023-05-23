package UserInformation;

public class TextContainsDigitsException extends Exception {
	
	public String text;

	  public TextContainsDigitsException(String message, String text) {
	    super(message);
	
	    this.text = text;
	  }

	  public String getText() {
	    return text;
	  }

}
