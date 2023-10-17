package homework_nr_11;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person("Ionescu", "Andrei", 32, true);
        Person p2 = new Person("Popescu", "Elena", 38, false);
        Person p3 = new Person("Antonov", "Mihai", 27, true);
        Person p4 = new Person("Georgescu", "Ioana", 44, false);
        Person p5 = new Person("Andriuta", "Raluca", 29, true);
        Person p6 = new Person("Mihail", "Cristina", 37, false);
        Person p7 = new Person("Vasilescu", "Alexandru", 31, true);
        Person p8 = new Person("Gheorghe", "Monica", 42, false);
        Person p9 = new Person("Avdeev", "Vladimir", 36, true);
        Person p10 = new Person("Stancu", "Alina", 37, false);


        List<Person> peopleList = new ArrayList<>();
        peopleList.add(p1);
        peopleList.add(p2);
        peopleList.add(p3);
        peopleList.add(p4);
        peopleList.add(p5);
        peopleList.add(p6);
        peopleList.add(p7);
        peopleList.add(p8);
        peopleList.add(p9);
        peopleList.add(p10);

        List<Person> result = peopleList.stream()
                .filter(person -> person.getAge() > 25 && person.isPayedByHour())
                .distinct()
                .limit(5)
                .collect(Collectors.toList());

        for (Person person : result) {
            System.out.println(person.getName() + " " + person.getSurname());
        }

        System.out.println("------------------------------------------");
        List<Person> secondList = peopleList.stream()
                .filter(person -> person.getAge() > 30 && person.getName().startsWith("A"))
                .toList();

        for (Person person : secondList) {
            System.out.println(person.getName() + " " + person.getSurname());
        }


        System.out.println("------------------------------------------");
        Optional<Person> firstPerson = peopleList.stream()
                .filter(person -> person.getAge() == 37)
                .findFirst();

        if (firstPerson.isPresent()) {
            Person person = firstPerson.get();
            System.out.println("Первый человек в списке с возрастом 37 лет: " + person.getName() + " " + person.getSurname());
        } else {
            System.out.println("Человек с возрастом 37 лет не найден в списке.");
        }
    }
}
