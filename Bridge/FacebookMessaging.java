package CS5800HW3.Bridge;

public class FacebookMessaging extends MessageApp
{
    public FacebookMessaging(MessageType messageType)
    {
        super(messageType);
    }
    
    @Override
    public void sendMessage() 
    {
        messageType.sendMessage();
        System.out.println("via Facebook Messaging");
    }
}
