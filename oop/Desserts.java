package whoops;
// abstract grandparent class
public abstract class Desserts {
    private String name; //private variable
    public Desserts(String name) { // constructor used for subclasses
        this.name = name;
    }
    public void setName(String name) { // method that shows how title changes depending on the artwork
        this.name = name;
    }
    public String getName() { // method that retrieves the title of artwork
        return this.name;
    }
    public String display () { // says that any title of artwork is a work of art
        return this.name + " is a delicious dessert! 😋";
    }
}