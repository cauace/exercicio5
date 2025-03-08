package factory_method;
import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ESCOLHA O TIPO DE MENSAGEM: 1-Email, 2-SMS, 3-Push");
        int escolha = scanner.nextInt();
        scanner.close();

        try {
            Notification notification = NotificationFactory.createNotification(escolha);
            notification.send();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}