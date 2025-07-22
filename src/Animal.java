import java.util.ArrayList;
import java.util.List;

public abstract class Animal {
    private String name;
    private List<Sender> senders = new ArrayList<>();

    public Animal(String name){
        this.name = name;
    }

    public void addSender(Sender sender){
        senders.add(sender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        if(name != null && !name.isEmpty()){
            String oldName = this.getName();
            this.name = name;
            for (Sender sender : senders) {
                sender.sendNotificationAboutAnimalChangedName(this, oldName, name);
            }
        } else throw new RuntimeException("Imię tego jebanego psa nie może być nullem albo puste zależy co sie stało");
    }

}
