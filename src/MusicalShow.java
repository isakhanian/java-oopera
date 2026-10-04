import java.util.ArrayList;

public class MusicalShow extends Show {
    String musicAuthor;
    String librettoText;

    public MusicalShow(String musicAuthor, String librettoText, String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        super(title, duration, director, listOfActors);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public void printLibrettoText() {
        System.out.println(librettoText);
    }


}   
