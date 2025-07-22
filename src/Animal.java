public abstract class Animal {
    private String name;
    private SmsSender smsSender;
    private EmailSender emailSender;

    public Animal(String name, SmsSender smsSender, EmailSender emailSender){
        this.name = name;
        this.smsSender = smsSender;
        this.emailSender = emailSender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        if(name != null && !name.isEmpty()){
            String oldName = this.getName();
            this.name = name;
            emailSender.sendEmailAboutDogsChangedName(this, oldName, name);
            smsSender.sendSmsAboutDogsChangedName(this, oldName, name);
        } else throw new RuntimeException("Imię tego jebanego psa nie może być nullem albo puste zależy co sie stało");
    }

}
