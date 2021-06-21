import java.util.ArrayList;
import java.util.List;

/**
 * This is the Main class that will be our 'driver' class to run code
 */

public class Main {

    static List<EliteProgrammer> programmers = new ArrayList<>();

    public static void main(String[] args) {

    }

    public static void printFavoriteFoods() {

        for (EliteProgrammer programmer : programmers) {
            System.out.println(programmer.getName() + "'s favorite food is: "
                    + programmer.getFavoriteFood());
        }

    }

    public static void printFavoriteSongs() {
        for (EliteProgrammer programmer : programmers) {
            System.out.println(programmer.getName() + "'s favorite song is: "
                    + programmer.getCurrentFavoriteSong());
        }
    }


}
