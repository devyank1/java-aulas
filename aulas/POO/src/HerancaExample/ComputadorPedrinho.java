package HerancaExample;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        MSNMessenger msn = new MSNMessenger();
        msn.sendMessage();
        msn.recieveMessage();

        FacebookMessenger fcb = new FacebookMessenger();
        fcb.sendMessage();
        fcb.recieveMessage();

        TelegramMessenger tlg = new TelegramMessenger();
        tlg.sendMessage();
        tlg.recieveMessage();
    }
}
