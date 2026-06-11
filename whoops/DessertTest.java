package whoops;

public class DessertTest {
    public static void main(String[] args) {
        Cookies cookie = new Cookies("Chocolate Chip Cookie");

        System.out.println(cookie.display());
        System.out.println(cookie.bake());
    }
}