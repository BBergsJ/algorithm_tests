package ru.job4j.arrays;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Youtu {
     public class Person {
        private int age;
        private String name;

         public Person(int age, String name) {
             this.age = age;
             this.name = name;
         }

         public int getAge() {
             return age;
         }

         public void setAge(int age) {
             this.age = age;
         }

         public String getName() {
             return name;
         }

         public void setName(String name) {
             this.name = name;
         }

         @Override
         public String toString() {
             return "Person{" + "age=" + age + ", name='" + name + '\'' + '}';
         }
     }

    public static void main(String[] args) {
        Set<Person> set = new TreeSet<>(Comparator.comparing(Person::getName).thenComparing(Person::getAge));
        set.forEach(System.out::println);
    }
}
