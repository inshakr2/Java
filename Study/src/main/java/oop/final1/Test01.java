package main.java.oop.final1;

public class Test01 {
    public static void main(String[] args) {

        // final keyword : 불변 (마지막)
        // - private과 혼동하지 않도로 한다. 상수의 느낌. 수정이 불가하고 읽기 전용이 된다.
        // 기본적으로 변수는 언제든지 변경이 가능하다.
        int a = 10;
        a = 20;
        System.out.println(a);

        final double pi = 3.14;
//        pi = 1.5;     불가능
        System.out.println(pi);

    }
}
