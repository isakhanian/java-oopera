import java.util.Objects;

public class Actor extends Person{
    int height;

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    @Override
    public String toString() {
        return getName() + " " + getSurname() + " (" + height + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Actor otherActor = (Actor) obj;
        return Objects.equals(getName(), otherActor.getName()) &&
               Objects.equals(getSurname(), otherActor.getSurname()) &&
               (height == otherActor.height);
    }

    @Override 
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), height);
    }

}

