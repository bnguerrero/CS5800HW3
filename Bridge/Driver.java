package CS5800HW3.Bridge;

public class Driver 
{
    public static void main(String[] args) 
    {
        // send image, text, and video messages via WhatsApp
        MessageApp whatsApp = new WhatsApp(new ImageMessage());
        whatsApp.sendMessage();

        // send text message via Facebook
        MessageApp facebook = new FacebookMessaging(new TextMessage());
        facebook.sendMessage();

        //send video message via Telegram
        MessageApp telegram = new TelegramMessaging(new VideoMessage());
        telegram.sendMessage();
            
    }
            
};
