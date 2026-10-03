import java.util.ArrayList;

public class Show {
    String title;
    int duration;
    String director;
    ArrayList<String> listOfActors;


    public Show(String title, int duration, String director, ArrayList<String> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    
    }
       
    public void printActors(ArrayList<String> listOfActors) {
        for (String actor: listOfActors) {
            actor = new Actor(title, director, null, duration);
            System.out.println(actor.toString());
        }
    }    

    public void addActor(ArrayList<String> listOfActors) {
        if (newActor.equals(actor)) {
            System.out.println("Этот актер уже добавлен в список");
        } else {
            listOfActors.add(newActor);
        }
    }
}