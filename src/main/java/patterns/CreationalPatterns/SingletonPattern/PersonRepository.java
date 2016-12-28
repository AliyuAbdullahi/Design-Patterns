package main.java.patterns.CreationalPatterns.SingletonPattern;

import main.java.patterns.CreationalPatterns.SingletonPattern.models.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aliyuabdullahi on 12/25/16.
 */
public class PersonRepository implements IRepository<Person> {

    private static PersonRepository personRepository;
    private static final int INDEX = 1;
    private List<Person> personList;

    private PersonRepository() {
        personList = new ArrayList<>();
    }

    public static PersonRepository getInstance() {
        if (personRepository == null) {
            synchronized (PersonRepository.class) {
                if (personRepository == null) {
                    personRepository = new PersonRepository();
                }
            }
        }

        return personRepository;
    }

    @Override
    public void create(Person data) {
        if (!contains(data)) {
            personList.add(data);
            System.out.println("Person with Name " + data.getName() + " and age" + data.getAge() + " added successfully!");
        } else {
            System.out.println("Person with name " + data.getName() + " and age " + data.getAge() + " already exist");
        }
    }

    @Override
    public Person read() {
        return personList.get(0);
    }

    @Override
    public Person read(int position) {
        return personList.get(position);
    }

    @Override
    public void update(int position, Person person) {
        if (personList.size() - INDEX >= position) {
            Person currentPerson = personList.get(position);
            if (person.getName() != null) {
                currentPerson.setName(person.getName());
            }

            if (person.getAge() > 0) {
                currentPerson.setAge(person.getAge());
            }

            personList.set(position, currentPerson);
        } else {
            System.out.println("Can't find anybody at position " + position);
        }
    }

    @Override
    public void delete(int position) {
        if (personList.size() - INDEX >= position) {
            personList.remove(position);
            System.out.println("Person at position " + position + " has been deleted");
        } else {
            System.out.println("Can't find anyone in position " + position);
        }
    }

    @Override
    public void deleteAll() {
        for (int i = 0; i < personList.size(); i++) {
            personList.remove(i);
        }
        System.out.println("List is now empty.");
    }

    @Override
    public boolean contains(Person data) {
        return personList.contains(data);
    }

    @Override
    public List<Person> getAll() {
        return personList;
    }
}
