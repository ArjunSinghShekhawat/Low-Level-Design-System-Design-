package factoryDesignPattern;

public class NotificationFactory {

    //factory methods
    public Notification createNotificationFactory(String type){
        if(type.isEmpty()){
            return null;
        }
        switch (type){
            case "sms":
                return new SMSNotification();
            case "email":
                return new EmailNotification();
            case "push":
                return new PushNotification();
            default:
                throw new IllegalArgumentException("Unknown Notification Type");
        }

    }
}
