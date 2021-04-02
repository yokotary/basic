package test;

public class Test {
    public static void main(String[] args) {
        System.out.println("I am taro");

        int age = 21;
        boolean bool = true;

        System.out.println(age);
        System.out.println(bool);

        //四則演算
        int value1,value2;
        value1 = 10;
        value2 = 5;

        System.out.println(value1 + value2); //15
        System.out.println(value1 * value2); //50
        System.out.println(value1 - value2); //5
        System.out.println(value1 / value2); //2

        int num = 11;
        num += 2; //13
        num -= 2; //11
        num *= 2; //22
        num /= 2; //11
        num %= 2; //1
        num++; //2
        num--; //1
        System.out.println(num); //num = 1




    }
}
