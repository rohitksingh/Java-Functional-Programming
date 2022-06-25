import enums.Gender;
import models.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        new Main().printFemales();

    }



    public void printFemales(){

        printAllFemalesImperative(getAllPeople());
        printAllFemalesDeclerative(getAllPeople());

    }


    /********************************************************************
     *          Filter females from people
     *******************************************************************/

    public void printAllFemalesImperative(List<Person> people){

        System.out.println("//Imperative way to filter females");

        List<Person> females = new ArrayList<>();

        for(Person person: people){
            if(person.gender.equals(Gender.FEMALE)){
                females.add(person);
            }
        }

        for(Person female: females)
            System.out.println(female);
    }

    public void printAllFemalesDeclerative(List<Person> people){

        System.out.println("//Declarative way to filter females");
        people.stream()
                .filter(person -> person.gender.equals(Gender.FEMALE))
                .collect(Collectors.toList())
                .forEach(female -> System.out.println(female));

    }



    /********************************************************************
     *          Helper method to populate people
     *******************************************************************/
    public List<Person> getAllPeople(){
        return List.of(
                new Person("Rohit", Gender.MALE),
                new Person("Alice", Gender.FEMALE),
                new Person("Alex", Gender.MALE),
                new Person("Amanda", Gender.FEMALE),
                new Person("Susan", Gender.FEMALE));
    }



}
