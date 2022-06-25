package chapters.chapter2___Combine_Functions;

import java.util.function.Function;

//How to combine multiple functions (How to combine things)
//Eg: Add a two numbers and multiply by 10;
public class Example1 {

    public static void main(String[] args) {
        int incrementedNum = increment(3);
        int multipliedNum = multiplyByTen(incrementedNum);
        System.out.println("Traditional way: "+multipliedNum);

        int result = _incrementNum
                .andThen(_multiplyByTen)
                .apply(3);

        System.out.println("Functional way: "+result);

    }


    static int increment(int num){
        return num + 1;
    }

    static int multiplyByTen(int num){
        return num*10;
    }

    //Functional way;
    static Function<Integer, Integer> _incrementNum = (num) -> num + 1;
    static Function<Integer, Integer> _multiplyByTen = num -> num*10;

}

