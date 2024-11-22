package factoryDesignPattern;

public class Mobile {
    public static void main(String[] args) {

        NotificationFactory notification = new NotificationFactory();

        Notification sms = notification.createNotificationFactory("sms");
        sms.notifyUser();

        Notification email = notification.createNotificationFactory("email");
        email.notifyUser();

        Notification push = notification.createNotificationFactory("push");
        push.notifyUser();

        try{
            Notification arjun = notification.createNotificationFactory("arjun");
            arjun.notifyUser();
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Complete notification !");
    }
}
