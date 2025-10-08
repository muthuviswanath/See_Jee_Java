
public class IllegalUsageException extends Exception{

	String message = "What you have commited is a big sin and you will be punished according to Garuda Purana";
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return this.message;
	}
}
