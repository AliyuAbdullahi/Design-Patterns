package main.java.patterns.CreationalPatterns.SingletonPattern;


import main.java.patterns.CreationalPatterns.SingletonPattern.models.Person;

/**
 * Created by aliyuabdullahi on 12/26/16.
 */
public class SingletonTest {

    public static void main(String... args) {
        PersonRepository repository = PersonRepository.getInstance();

        Person person = new Person();
        person.setAge(26);
        person.setName("Oladimeji Jakes");

        repository.create(person);
        repository.create(person);

        repository.delete(0);

        repository.create(person);

        repository.getAll().forEach(System.out::println);

        repository.deleteAll();
    }
}
