package factory_method;

public class SMSNotification implements Notification {
    @Override
    public void send() {
        System.out.println("Linha 32325847: SEU PLANO ESTÁ ACABANDO");
    }
}
