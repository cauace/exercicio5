package factory_method;

public class EmailNotification implements Notification {
	@Override
	public void send() {
		System.out.println("Para Carlos: O seu plano de wi-fi está acabando");
	}
}