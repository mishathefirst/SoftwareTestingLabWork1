package domainmodel;

public class Lackey extends Person{

    public void becomeWorried() {
        this.mood = "worried";
    }

    public void blockWay() {
        this.action = "Block the way";
        this.location = "Doorway";
    }

    public Lackey(String name, String action, String location, String[] clothes, String mood) {
        this.name = name;
        this.action = action;
        this.location = location;
        this.clothes = clothes;
        this.mood = mood;
    }

}
