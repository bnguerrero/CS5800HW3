package CS5800HW3.Bridge;

/**
 * WhatsApp
 */
public class WhatsApp extends MessageApp
{
    public WhatsApp(MessageType messageType) 
    {
        super(messageType);
    }

    @Override
    public void sendMessage() 
    {
        messageType.sendMessage();
        System.out.println("via WhatsApp");
    }
}