package principioISP;

public class MainNotificacao {
	public static void main(String[] args) {
		NotificacaoSMS sms = new NotificacaoSMS();
		NotificacaoEmail email = new NotificacaoEmail();
		NotificacaoPushNotification push = new NotificacaoPushNotification();
		
		sms.enviarSMS();
		email.enviarEmail();
		push.enviarPushNotification();
	}
	
	
	
}
