import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        new Main().printFemales();

    }



    public void printFemales(){

        //Declarative way
        printAllFemalesImperative(getAllPeople());

    }


    public void printAllFemalesImperative(List<Person> people){

        List<Person> females = new ArrayList<>();

        for(Person person: people){
            if(person.gender.equals(Gender.FEMALE)){
                females.add(person);
            }
        }

        for(Person female: females)
            System.out.println(female);
    }


    public List<Person> getAllPeople(){
        return List.of(
                new Person("Rohit", Gender.MALE),
                new Person("Alice", Gender.FEMALE),
                new Person("Alex", Gender.MALE),
                new Person("Amanda", Gender.FEMALE),
                new Person("Susan", Gender.FEMALE));
    }


    static class Person{

        public String name;
        public Gender gender;

        Person(String name, Gender gender){
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    enum Gender{
        MALE, FEMALE;
    }

}
