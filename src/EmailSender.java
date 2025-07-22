public class EmailSender implements Sender{


    @Override
    public void sendNotificationAboutAnimalChangedName(Animal animal, String oldName, String newName) {
        System.out.println("[EMAIL] Zwierze zmieniło imie z " + oldName + " na " + newName);
    }
}
