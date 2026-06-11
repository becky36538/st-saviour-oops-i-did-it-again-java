package whoops;

public class DessertTest { //test class used to run program
    public static void main(String[] args) { // starting point
        Cookies cookie = new Cookies("Chocolate Chip Cookie"); // creates cookies object called cookie, name is passed to constructor

        System.out.println(cookie.display()); //calls display from desserts, prints result
        System.out.println(cookie.bake()); // calls bake from bakedDesserts, prints result
    }
}