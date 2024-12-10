package headlers.base;

public class Main {
	public static void main(String[] args) {
		
		SupportHandler Handler1 = new Handler1();
        SupportHandler Handler2 = new Handler2();
        SupportHandler Handler3 = new Handler3();

        Handler1.setNextHandler(Handler2);
        Handler2.setNextHandler(Handler3);

        Request request1 = new Request(Priority.BASIC);
        Request request2 = new Request(Priority.INTERMEDIATE);
        Request request3 = new Request(Priority.CRITICAL);

        Handler1.handleRequest(request1);
        Handler2.handleRequest(request2);
        Handler3.handleRequest(request3);
	}
}
