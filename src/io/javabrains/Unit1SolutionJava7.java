package io.javabrains;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1SolutionJava7 {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlisle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39)
        );

        //Step 1: sort list by lastName
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });

        //Step 2: create a method that prints all elements in the list
        print(people, new Condition() {
            @Override
            public boolean test(Person person) {
                return true;
            }
        });

        //Step 3: create a method that prints all people whose last name start with C
        print(people, new Condition() {
            @Override
            public boolean test(Person person) {
                if(person.getLastName().startsWith("C"))
                    return true;
                return false;
            }
        });
    }

    public static void print(List<Person> people, Condition condition){
        for(Person person : people){
            if(condition.test(person))
                System.out.println(person);
        }
    }
}

interface Condition {
    boolean test(Person person);
}

