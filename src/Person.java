public class Person extends EliteProgrammer{
    public Person(String name, String fav_song, String fav_food) {
        this.name = name;
        this.fav_song = fav_song;
        this.fav_food = fav_food;
    }

   private String name = "";
   private String fav_song = "";
   private String fav_food= "";

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getCurrentFavoriteSong() {
        return this.fav_song;
    }

    @Override
    public String getFavoriteFood() {
        return this.fav_food;
    }
}
