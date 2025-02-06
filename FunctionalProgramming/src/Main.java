import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("Juan", 25, Arrays.asList("programar", "leer")),
                new Person("Ana", 30, Arrays.asList("correr", "programar")),
                new Person("Luis", 20, Arrays.asList("dibujar", "cantar")),
                new Person("Maria", 35, Arrays.asList("programar", "viajar")),
        new Person("lala", 35, Arrays.asList("programar", "viajar")),
        new Person("sadaf", 35, Arrays.asList("programar", "viajar")),
        new Person("fdafdas", 35, Arrays.asList("programar", "viajar")),
        new Person("fdafdasfdas", 35, Arrays.asList("programar", "viajar"))

        );
         FilteredPerson.filterPerson(persons, "programar");
        FilteredPerson.getNames(persons);
    }

}