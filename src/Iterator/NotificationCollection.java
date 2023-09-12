package Iterator;

public class NotificationCollection implements Collection {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    Notification[] notificationList;
    public NotificationCollection() {
        notificationList = new Notification[MAX_ITEMS];
        addItem("tienes un mensaje nuevo");
        addItem("tienes un correo");
        addItem("la alarma sonara pronto");
    }
    public void addItem(String str) {
        Notification notification = new Notification(str);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("full");

        } else {
            notificationList[numberOfItems] = notification;
            numberOfItems = numberOfItems + 1;
        }
    }
    public Iterator createIterator() {
        return new NotificationIterator(notificationList);
    }
}
