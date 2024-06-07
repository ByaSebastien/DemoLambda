package be.bstorm;

import be.bstorm.interfaces.GeneriqueIF;
import be.bstorm.interfaces.PersonIF;
import be.bstorm.interfaces.impl.GeneriqueIFImpl;
import be.bstorm.interfaces.impl.PersonIFImpl;
import be.bstorm.models.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Person p = new Person("Michalangelo");

        PersonIF if1 = new PersonIFImpl();

        PersonIF if2 = new PersonIF() {
            @Override
            public void execute(Person person) {
                System.out.println(person.getName() + " : YABADABADOO!");
            }
        };

        PersonIF if3 = (person) -> System.out.println(person.getName() + " : Que trépas si je faiblis!");

        if1.execute(p);
        if2.execute(p);
        if3.execute(p);

        GeneriqueIF<Person> gif1 = new GeneriqueIFImpl<>();
        GeneriqueIF<Person> gif2 = new GeneriqueIF<Person>() {
            @Override
            public void execute(Person entity) {
                System.out.println("Class anonym " + entity);
            }
        };
        GeneriqueIF<Person> gif3 = (person) -> System.out.println("method anonym " + person);

        gif1.execute(p);
        gif2.execute(p);
        gif3.execute(p);

        GeneriqueIF<Long> gif4 = (nb) -> System.out.println("method anonym " + nb);

        Consumer<Person> consumer = (person -> System.out.println(person));

        consumer.accept(p);

        List<Person> people = new ArrayList<>();
        people.add(p);
        people.add(new Person("Rafaelo"));
        people.add(new Person("Donatello"));
        people.add(new Person("Leonardo"));


        Person result = people.stream()
                .filter(person -> person.getName().equals("Leonardo"))
                .findFirst().orElse(null);

        System.out.println(result);

        List<String> names = new ArrayList<>();

        names = people.stream()
                .map(person -> person.getName())
                .filter(name -> name.startsWith("D"))
                .distinct()
                .toList();

        names.forEach(name -> System.out.println(name));

        Consumer<Person> consumer1 = (person) -> {
            System.out.println(person.getName());
            System.out.println("Ok?");
        };

        Supplier<Boolean> supplier1 = () -> true;

        consumer1.accept(p);
    }
}