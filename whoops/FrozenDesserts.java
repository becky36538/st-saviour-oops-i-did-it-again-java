package whoops;
public abstract class FrozenDesserts extends Desserts { // parent class that extends desserts
    public final boolean IS_FROZEN = true; // if dessert is frozen, returns true
    public FrozenDesserts(String name) { // passes dessert name to dessert class by using "super" method
        super(name);
    }
    public String freeze() { // if name belongs to a frozen dessert, it can be stored in a freezer
    return getName()+ " can be stored in a freezer.";
    }
}