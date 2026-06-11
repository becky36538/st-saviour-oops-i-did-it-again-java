package oops;
public abstract class FrozenDesserts extends Desserts { // public class that extends art
    public final boolean IS_2D = true; // if painting is 2d then it is a painting
    public FrozenDesserts(String name) { // passes title to art by using "supper" method
        super(name);
    }
    public String hang() { // if title belongs to a painting, it can be hung on a wall
        return this.getName() + " can be stored in a freezer.";
    }
}