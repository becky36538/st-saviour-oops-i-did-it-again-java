package whoops;
public class Cookies extends BakedDesserts { // public class that extends baked desserts

    public Cookies(String name) {
        super(name); // super used to indicate name of cookie
    }
    public void crunch() { // adds layer of acrylic paint to the painting
        return this.getName() + "is crunch or chewy! 🍪";
    }
    
}