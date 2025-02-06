import java.util.List;

public class FilteredPerson {
     static void filterPerson(List<Person> person, String hobby){
        List<Person> filteredPerson = person.stream()
                .filter(p -> p.getAge() > 18 && p.getHobbies().contains(hobby))
                .toList();
        filteredPerson.forEach(System.out::println);
    }
    static void getNames(List<Person> persons){
         List<String> names = persons.stream()
                 .map(Person::getName)
                 .limit(5)
                 .toList();
        names.forEach(System.out::println);

    }

}
