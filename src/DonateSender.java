public class DonateSender implements Sender{
    @Override
    public void sendNotificationAboutAnimalChangedName(Animal animal, String oldName, String newName) {
        System.out.println("[DONATE] Pies imie zmienił, teraz jest niebinarny i ma zaimki ono/jenu");
    }
}
