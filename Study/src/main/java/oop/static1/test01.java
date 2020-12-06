package main.java.oop.static1;

public class test01 {
    public static void main(String[] args) {
        // 10 + 20을 계산
        Calculator a = new Calculator(10, 20);
        System.out.println(a.getTotal());

        // 20 + 40을 계산산
       Calculator b = new Calculator(20, 40);
        System.out.println(b.getTotal());

        /**
         * 문제점 : 간단한 작업을 하더라도 객체를 생성해야한다.
         * 해결책 :
         *  - 객체를 만들지 않고 계산할 수 있는 방법을 찾는다.
         *  - 하나의 객체만 만들어 두고 계산하도록 한다.
         */


    }
}
