import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Sender> senders = new ArrayList<>();
        senders.add(new SmsSender());
        senders.add(new EmailSender());
        senders.add(new PostcardSender());
        senders.add(new DonateSender());

        Dog dog = new Dog("fafik");
        for (Sender sender : senders) {
            dog.addSender(sender);
        }
        dog.setName("sasza");
        dog.setName("paweł");
        dog.setName("emilia");
        System.out.println(dog.getName());
    }
}