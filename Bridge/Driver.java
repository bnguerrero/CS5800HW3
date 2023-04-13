package CS5800HW3.Bridge;

public class Driver 
{
    public static void main(String[] args) 
    {
        // send image, text, and video messages via WhatsApp
        MessageApp whatsApp = new WhatsApp(new ImageMessage());
        whatsApp.sendMessage();

        whatsApp = new WhatsApp(new TextMessage());
        whatsApp.sendMessage();

        whatsApp = new WhatsApp(new VideoMessage());
        whatsApp.sendMessage();

        // send image, text, and video messages via Facebook
        MessageApp facebook = new FacebookMessaging(new ImageMessage());
        facebook.sendMessage();

        facebook = new FacebookMessaging(new TextMessage());
        facebook.sendMessage();

        facebook = new FacebookMessaging(new VideoMessage());
        facebook.sendMessage();

        // send image, text, andvideo message via Telegram
        MessageApp telegram = new TelegramMessaging(new ImageMessage());
        telegram.sendMessage();

        telegram = new TelegramMessaging(new TextMessage());
        telegram.sendMessage();

        telegram = new TelegramMessaging(new VideoMessage());
        telegram.sendMessage();
            
    }
            
};
