package pl.globallogic.Lessons.Lesson3;

public class User {
    public String name;

    public User(String name) { this.name = name; }

    public String getName () {return name;}

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + "\' " +
                '}';
    }
}

