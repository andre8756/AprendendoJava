package headlers.base;

public class Handler3 extends SupportHandler {
	
	@Override
	public void handleRequest(Request request) {
		
		if (request.getPriority() == Priority.CRITICAL) {
			System.out.println("Chegou no nível Avançado");
		}else if (nextHandler != null){
			nextHandler.handleRequest(request);
		}
	}

	@Override
	public void setNextHandler(SupportHandler nextHandler) {
		this.nextHandler = nextHandler;
	}

}
