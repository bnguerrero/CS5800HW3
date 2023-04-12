package CS5800HW3;

public abstract class MessageApp 
{
    protected MessageType messageType;

    protected MessageApp(MessageType messageType)
    {
        this.messageType = messageType;
    }
    
    abstract public void sendMessage();
}
