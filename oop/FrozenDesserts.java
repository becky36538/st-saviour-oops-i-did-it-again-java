package whoops;
public abstract class FrozenDesserts extends Desserts { // public class that extends desserts
    public final boolean IS_FROZEN = true; // if dessert is frozen then it is a frozen dessert
    public FrozenDesserts(String name) { // passes name to dessert by using "super" method
        super(name);
    }
    public String freeze() { // if name belongs to a frozen dessert, it can be stored in a freezer
    public getName();
        return this.name + " can be stored in a freezer.";
    }
}