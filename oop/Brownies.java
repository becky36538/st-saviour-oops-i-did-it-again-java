package whoops;
public class Brownies extends BakedDesserts { // public class that extends baked desserts

    public Brownies(String name) {
        super(name); // super used to indicate name of cookie
    }
    public void chocolate() { // adds layer of acrylic paint to the painting
        return this.getName() + "is a chocolate dessert!🍪";
    }
    
}