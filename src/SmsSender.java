public class SmsSender {
    public void sendSmsAboutDogsChangedName(Animal animal, String oldName, String newName){
        System.out.println("[SMS] Zwierze zmieniło imie z " + oldName + " na " + newName);
    }
}
