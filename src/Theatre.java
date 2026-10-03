import java.util.ArrayList;

public class Theatre {
    public static void main(String[] args) {
        Actor actor1 = new Actor("Федор", "Петров", Gender.MALE, 175);
        Actor actor2 = new Actor("Мира", "Васильева", Gender.FEMALE, 176);
        Actor actor3 = new Actor("Кристина", "Кудрявая", Gender.FEMALE, 181);
        Director director1 = new Director("Fill", "Chestov", Gender.MALE, 120);
        Director director2 = new Director("Casey", "Afflek", Gender.MALE, 10);
        String musicAuthor = "Tweel";
        String choreographer = "Cutie"; 
        ArrayList<Actor> regularShowActors = new ArrayList<>();
        ArrayList<Actor> operaActors = new ArrayList<>();
        ArrayList<Actor> balletActors = new ArrayList<>();
        Show regularShow = new Show("Crazy", 120, director2, regularShowActors);
        Opera operaShow = new Opera(musicAuthor, "Lets sing", 12, "Sing", 390, director1, operaActors);
        Ballet balletShow = new Ballet(musicAuthor, "Lets dance", choreographer, "Dance", 230, director2, balletActors);
        regularShow.addActor(actor3);
        operaShow.addActor(actor3);
        balletShow.addActor(actor1);
        balletShow.addActor(actor2);
        regularShow.printActors();
        operaShow.printActors();
        balletShow.printActors();
        regularShow.changeActor(actor2, "Кудрявая");
        regularShow.printActors();
        operaShow.changeActor(actor3, "Мирашкин");
        operaShow.printActors();
        operaShow.printLibrettoText();
        balletShow.printLibrettoText();
    }

}
