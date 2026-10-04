import java.util.ArrayList;

public class Opera extends MusicalShow {
    int choirSize;


    public Opera(String musicAuthor, String librettoText, int choirSize, String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        super(musicAuthor, librettoText, title, duration, director, listOfActors);
        this.choirSize = choirSize;
    }

}
