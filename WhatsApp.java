package CS5800HW3;

/**
 * WhatsApp
 */
public class WhatsApp implements MessageApp
{

    @Override
    public void sendMessage(MessageType messageType) 
    {
        messageType.sendMessage();
    }

    
}