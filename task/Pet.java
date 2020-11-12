package task;

public class Pet implements Animal, Birthable {
   private String name;
   private String birthDate;


    public Pet(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    @Override
    public String getBirthDate() {
        return birthDate;
    }

    @Override
    public String getName() {
        return name;
    }
}
