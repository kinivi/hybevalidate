import javax.validation.constraints.NotNull;

public class Person {

    @NotNull
    private String name;

    public Person(String name) {
        this.name = name;
    }
}