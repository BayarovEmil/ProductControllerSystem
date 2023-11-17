package kodlamaio.northwind.core;

public class SuccessResult extends Result{
	public SuccessResult(boolean success,String message) {
		super(true,message);
	}
	
	public SuccessResult(boolean success) {
		super(true);
	}
}
