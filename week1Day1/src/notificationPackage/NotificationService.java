package notificationPackage;

public class NotificationService {
public static void main(String[] args) {
	NotificationFactory factory = new NotificationFactory();
	Notification notify = factory.createNotification("SMS");
	notify.notifyUser();
}
}
