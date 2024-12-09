package principioISP;

class NotificacaoSMS implements EnviaSMS{
    public void enviarSMS() {
        System.out.println("Enviando notificacao por SMS.");
    }
}
