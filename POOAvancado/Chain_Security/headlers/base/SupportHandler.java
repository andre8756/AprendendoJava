package headlers.base;

public abstract class SupportHandler {
	public SupportHandler nextHandler;
	
	public abstract void handleRequest(Request request);
	public abstract void setNextHandler(SupportHandler nextHandler);
}
