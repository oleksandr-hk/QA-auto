package lesson5.notification;

public class EmailNotifier implements INotifier {
    @Override
    public void notify(String message) {
        System.out.println("Email Observer: " + message);
    }
}
