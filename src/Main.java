public class Main {
    public static void main(String[] args) {
        SmsSender smsSender = new SmsSender();
        EmailSender emailSender = new EmailSender();
        PostcardSender postcardSender = new PostcardSender();
        Dog dog = new Dog("fafik", smsSender, emailSender);
        dog.setName("sasza");
        dog.setName("paweł");
        dog.setName("emilia");
        System.out.println(dog.getName());
    }
}