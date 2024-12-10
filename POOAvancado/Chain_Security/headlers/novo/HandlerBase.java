package headlers.novo;

public abstract class HandlerBase {
	private HandlerBase proximoHandler;
	
	public abstract void HandlerAprovacao(Aprovacao prioridade);
	public abstract void proximo(HandlerBase proximoHandler);
	
}
