package main.java.oop.static3;

public class Test03 {
    public static void main(String[] args) {

        // Static Method 는 객체 생성 없이 접근 가능하다.
        long totla = Calculator.plus(10L, 20L);
        System.out.println(totla);

    }
}
