import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SmsSender smsSender = new SmsSender();
        EmailSender emailSender = new EmailSender();
        PostcardSender postcardSender = new PostcardSender();

        List<Sender> senders = new ArrayList<>();
        senders.add(smsSender);
        senders.add(emailSender);
        senders.add(postcardSender);

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