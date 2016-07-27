/**
 * Created by Yevgeniy on 7/27/2016.
 */
public class MovieTestDrive {
    public static void main(String[] args) {
        Movie one = new Movie();
        one.title = "Как прогореть на Акциях";
        one.genre = "Трагедия";
        one.rating = 5;
        Movie two = new Movie();
        two.title = "Потерянный в офисе";
        two.genre = "Комедия";
        two.rating = 5;
        Movie three = new Movie();
        three.title = "Байт клуб";
        three.genre = "Трагедия, но в целом веселая";
        three.rating = 127;
        System.out.println(two.title);

    }
}


