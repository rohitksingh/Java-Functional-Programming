package lessons;

//How to combine multiple functions (How to combine things)
//Eg: Add a two numbers and multiply by 10;
public class Lesson2 {

    public static void main(String[] args) {
        int sum = addTwoNumbers(3,4);
        int multipliedNum = multiplyByTen(sum);
        System.out.println("Traditional way: "+multipliedNum);
    }


    static int addTwoNumbers(int num1, int num2){
        return num1+num2;
    }

    static int multiplyByTen(int num){
        return num*10;
    }

}

