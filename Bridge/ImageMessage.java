package CS5800HW3.Bridge;

public class ImageMessage implements MessageType{

    @Override
    public void sendMessage() 
    {
        System.out.println("Image sent");
    }
    
}
