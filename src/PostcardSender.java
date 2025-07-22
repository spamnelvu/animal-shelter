public class PostcardSender implements Sender{

    @Override
    public void sendNotificationAboutAnimalChangedName(Animal animal, String oldName, String newName) {
        System.out.println("[POSTCARD] Zwierze zmieniło imie z " + oldName + " na " + newName);
    }
}
