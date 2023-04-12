package CS5800HW3.Bridge;

public class VideoMessage implements MessageType{

    @Override
    public void sendMessage() 
    {
        System.out.println("Image sent");
    }
    
}
