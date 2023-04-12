package CS5800HW3;

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