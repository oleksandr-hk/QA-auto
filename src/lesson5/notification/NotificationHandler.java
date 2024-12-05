package lesson5.notification;

import java.util.ArrayList;
import java.util.List;

public class NotificationHandler {

    private final List<INotifier> observers = new ArrayList<>();

    public void addObserver(INotifier observer) {
        observers.add(observer);
    }

    public void removeObserver(INotifier observer) {
        observers.remove(observer);
    }

    public void notifyAllObservers(String message) {
        for (INotifier observer : observers) {
            observer.notify(message);
        }
    }
}
