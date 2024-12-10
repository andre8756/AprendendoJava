package headlers.base;

public class Handler2 extends SupportHandler {
	
	@Override
	public void handleRequest(Request request) {
		
		if (request.getPriority() == Priority.INTERMEDIATE) {
			System.out.println("Chegou no nível INTERMEDIÁRIO");
		}else if (nextHandler != null){
			nextHandler.handleRequest(request);
		}
	}

	@Override
	public void setNextHandler(SupportHandler nextHandler) {
		this.nextHandler = nextHandler;
	}

}