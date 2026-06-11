package whoops;
public class FrozenYogurt extends FrozenDesserts { // public class that extends frozen desserts

    public FrozenYogurt(String name) {
        super(name); // super passes name of frozen yogurt to parent classes
    }
    public String toppings() { // describes trait of frozen yogurt
        return this.getName() + "can be ordered with toppings! 🍨";
    }
    
}