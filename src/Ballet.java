import java.util.ArrayList;

public class Ballet extends MusicalShow {
    String choreographer;

    public Ballet(String musicAuthor, String librettoText, String choreographer, String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        super(musicAuthor, librettoText, title, duration, director, listOfActors);
        this.choreographer = choreographer;
    }
}
