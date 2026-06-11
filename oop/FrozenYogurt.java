package whoops;
public class FrozenYogurt extends FrozenDesserts { // public class that extends baked desserts

    public FrozenYogurt(String name) {
        super(name); // super used to indicate name of cookie
    }
    public String toppings() { // adds layer of acrylic paint to the painting
        return this.getName() + "can be ordered with toppings! 🍨";
    }
    
}