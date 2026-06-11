package whoops;
public abstract class BakedDesserts extends Desserts { // public class that extends art
    public final boolean IS_BAKED = true; // if painting is 2d then it is a painting
    public BakedDesserts(String name) { // passes title to art by using "supper" method
        super(name);
    }
    public String bake() { // if title belongs to a painting, it can be hung on a wall
        return this.getName() + " is baked in an oven.";
    }
}