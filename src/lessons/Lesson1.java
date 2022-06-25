package lessons;

import java.util.function.Function;

//How to write a function in functional way
public class Lesson1 {

    public static void main(String[] args) {

        String uppercaseName = makeUppercase("this is the old way");
        System.out.println(uppercaseName);

        String uppercaseFromFunction = makeUpperCaseFunction.apply("this is the functional way");
        System.out.println(uppercaseFromFunction);

    }


    //Traditional way of writing a function
    static String makeUppercase(String name){
        return name.toUpperCase();
    }

    //Functional way
    private static Function<String, String> makeUpperCaseFunction = name -> name.toUpperCase();

}
