package domainmodel;

public abstract class Person {

    String name;
    String location;
    String[] clothes;
    String action;
    String mood;

    public void changeAction(String action) {
        this.action = action;
    }

    public void changeClothes(String[] clothes) {
        this.clothes = clothes;
    }

    public void changeLocation(String location) {
        this.location = location;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

}
