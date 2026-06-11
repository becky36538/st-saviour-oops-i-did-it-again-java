package whoops;
// abstract grandparent class
public abstract class Desserts {
    private String name; // stores name of dessert
    public Desserts(String name) { // initializes desserts
        this.name = name;
    }
    public void setName(String name) { // allows name of dessert to be changed
        this.name = name;
    }
    public String getName() { // returns name of dessert
        return this.name;
    }
    public String display () { // describes any object of dessert
        return this.name + " is a delicious dessert! 😋";
    }
}