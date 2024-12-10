package headlers.base;

public class Handler1 extends SupportHandler {
	
	@Override
	public void handleRequest(Request request) {
		
		if (request.getPriority() == Priority.BASIC) {
			System.out.println("Chegou no nível Básico");
		}else if (nextHandler != null){
			nextHandler.handleRequest(request);
		}
	}

	@Override
	public void setNextHandler(SupportHandler nextHandler) {
		this.nextHandler = nextHandler;
	}

}
