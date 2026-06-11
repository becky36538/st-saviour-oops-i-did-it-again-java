package whoops;
public class Brownies extends BakedDesserts { // public class that extends baked desserts

    public Brownies(String name) {
        super(name); // super passes name of brownie to parent classes
    }
    public void chocolate() { // describes trait of brownie
        return this.getName() + "is a chocolate dessert!🍪";
    }
    
}