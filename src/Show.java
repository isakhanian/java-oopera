import java.util.ArrayList;

public class Show {
    String title;
    int duration;
    Director director;
    ArrayList<Actor> listOfActors;


    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    
    }

    public void printDirector() {
        System.out.println(director.toString());

    }
       
    public void printActors() {
        for (Actor actor: listOfActors) {
            System.out.println(actor.toString());
        }
    }    

    public void addActor(Actor newActor) {
        if (listOfActors.contains(newActor)) {
            System.out.println("Этот актер уже добавлен в список");
        } else {
            listOfActors.add(newActor);
        }
    }

    public void changeActor(Actor newActor, String currentActorSurname) {
    int matchesCount = 0;
    int actorIndex = -1;
    for (int i = 0; i < listOfActors.size(); i++) {
        Actor actor = listOfActors.get(i);

        if (actor.getSurname().equals(currentActorSurname)) {
            matchesCount++;
            actorIndex = i;
        }
    }
    if (matchesCount == 0) {
        System.out.println("Такого актера нет в списке");
    } else if (matchesCount > 1) {
        System.out.println("Найдено несколько актеров с такой фамилией. Замена невозможна.");
    } else {
        listOfActors.set(actorIndex, newActor);
    }
}
}