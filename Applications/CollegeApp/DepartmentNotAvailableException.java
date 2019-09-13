package CollegeApp;

public class DepartmentNotAvailableException extends RuntimeException {
	private String exceptionMessage;
	
	public DepartmentNotAvailableException(String exceptionMessage) {
		this.exceptionMessage = exceptionMessage;
	}
	
	@Override 
	public String getMessage()
	{ 
		return exceptionMessage; 
	}

}
