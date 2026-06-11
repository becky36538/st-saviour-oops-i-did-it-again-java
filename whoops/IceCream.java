package whoops;
public class IceCream extends FrozenDesserts { // public class that extends frozen desserts

    public IceCream(String name) {
        super(name); // super passes name of ice cream to parent classes
    }
    public String scoop() { // describes trait of ice cream
        return this.getName() + "can be scooped! 🍨";
    }
    
}