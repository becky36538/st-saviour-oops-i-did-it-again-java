package whoops;
public class IceCream extends FrozenDesserts { // public class that extends baked desserts

    public IceCream(String name) {
        super(name); // super used to indicate name of cookie
    }
    public String scoop() { // adds layer of acrylic paint to the painting
        return this.getName() + "can be scooped! 🍨";
    }
    
}