package CS5800HW3;

public class TelegramMessaging extends MessageApp 
{
    public TelegramMessaging(MessageType messageType)
    {
        super(messageType);
    }

    @Override
    public void sendMessage() {
        messageType.sendMessage();
        System.out.println("via Telegram Messaging");
    }
    
}
