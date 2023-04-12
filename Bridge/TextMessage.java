package CS5800HW3.Bridge;

public class TextMessage implements MessageType {
    @Override
    public void sendMessage() 
    {
        System.out.println("Text sent");
    }
    
}
