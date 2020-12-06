package main.java.oop.static2;

public class Test02 {
    public static void main(String[] args) {

        Calculator calc = new Calculator();
        long total = calc.plus(10L, 20);
        System.out.println(total);

        total = calc.plus(40L, 60L);
        System.out.println(total);

    }
}
