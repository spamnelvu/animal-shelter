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
        for (int i = 0; i < senders.size(); i++) {
            dog.addSender(senders.get(i));
        }
        dog.setName("sasza");
        dog.setName("paweł");
        dog.setName("emilia");
        System.out.println(dog.getName());
    }
}