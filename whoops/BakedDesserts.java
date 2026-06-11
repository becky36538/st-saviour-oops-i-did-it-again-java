package whoops;
public abstract class BakedDesserts extends Desserts { // parent class that extends desserts
    public final boolean IS_BAKED = true; // if dessert is baked, returns true
    public BakedDesserts(String name) { // passes dessert name to dessert class by using "super" method
        super(name);
    }
    public String bake() { // if name belongs to a baked dessert, it can be baked in an oven
        return getName() + " is baked in an oven.";
    }
}