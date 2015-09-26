package gomenko.j02;

/**
 * Created by Loner on 26.09.15.
 */
public class Developer {

    private String name;
    private int age;
    private String city;

    public Developer(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    @Override
    public String toString() {
        return new StringBuilder().append("Hi my name is ")
                .append(name).append(" - I am ")
                .append(age).append(" years old and I live in ")
                .append(city).toString();
    }
}
