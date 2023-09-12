package Iterator;

public class NotificationBar {
    NotificationCollection notification;
    public NotificationBar(){
        this.notification = new NotificationCollection();
    }
    public void printNotification(){
        Iterator iterator = notification.createIterator();
        System.out.println("-----NOTIFICATION BAR--------");
        while (iterator.hasNext()) {
            Notification n = (Notification) iterator.next();
            System.out.println(n.getNotification());
        }
    }
    
}
