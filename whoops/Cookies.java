package whoops;
public class Cookies extends BakedDesserts { // public class that extends baked desserts

    public Cookies(String name) {
        super(name); // super passes name of cookie to parent classes
    }
    public void crunch() { // describes trait of cookie
        return this.getName() + "is crunch or chewy! 🍪";
    }
    
}