import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        new Main().filterFemales();

    }



    public void filterFemales(){

        List<Person> persons = List.of(
                new Person("Rohit", Gender.MALE),
                new Person("Alice", Gender.FEMALE),
                new Person("Alex", Gender.MALE),
                new Person("Amanda", Gender.FEMALE),
                new Person("Susan", Gender.FEMALE));

        //Imperative way to count
        List<Person> females = new ArrayList<>();

        for(Person person: persons){

            System.out.println(person.name+" "+person.gender);

            if(person.gender.equals(Gender.FEMALE)){
                females.add(person);
            }
        }

        for(Person female: females){
            System.out.println(female.name);
        }



    }


    static class Person{

        public String name;
        public Gender gender;

        Person(String name, Gender gender){
            this.name = name;
            this.gender = gender;
        }
    }

    enum Gender{
        MALE, FEMALE;
    }

}
