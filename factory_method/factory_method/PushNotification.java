package factory_method;

public class PushNotification implements Notification {
    @Override
    public void send() {
        System.out.println("O plano de wi-fi está acabando");
    }
}
