package domainmodel;

public class Rebel extends Person{

    public void getAngry() {
        this.mood = "angry";
    }

    public void breakIn() {
        this.action = "Break door";
        this.location = "Room";
    }

    public void scream() {
        this.action = "scream";
    }

    public Rebel(String name, String action, String location, String[] clothes, String mood) {
        this.name = name;
        this.action = action;
        this.location = location;
        this.clothes = clothes;
        this.mood = mood;
    }

}
