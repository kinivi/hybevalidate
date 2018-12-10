import javax.validation.constraints.NotNull;

public class PersonChild extends Person {

    @NotNull
    private Integer age;

    public PersonChild(String name) {
        super(name);
    }

    public PersonChild(String name, int age) {
        super(name);
        this.age = age;
    }
}
