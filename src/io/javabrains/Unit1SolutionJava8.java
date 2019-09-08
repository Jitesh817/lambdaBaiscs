package io.javabrains;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1SolutionJava8 {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlisle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39)
        );
        //Step 1: sort list by lastName
        Collections.sort(people, Comparator.comparing(Person::getLastName));

        //Step 2: create a method that prints all elements in the list
        print(people, person -> true);

        //Step 3: create a method that prints all people whose last name start with C
        print(people, person -> person.getLastName().startsWith("C"));
    }

    public static void print(List<Person> people, Condition condition) {
        for (Person person : people) {
            if (condition.test(person))
                System.out.println(person);
        }
    }
}