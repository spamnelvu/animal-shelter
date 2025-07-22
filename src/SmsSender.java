public class SmsSender implements Sender{

    @Override
    public void sendNotificationAboutAnimalChangedName(Animal animal, String oldName, String newName) {
        System.out.println("[SMS] Zwierze zmieniło imie z " + oldName + " na " + newName);
    }
}
