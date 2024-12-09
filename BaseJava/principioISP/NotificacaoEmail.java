package principioISP;

class NotificacaoEmail implements EnviaEmail {
    public void enviarEmail() {
        System.out.println("Enviando notifica��o por e-mail.");
    }
}
