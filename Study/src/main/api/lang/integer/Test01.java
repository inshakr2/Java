package main.api.lang.integer;

public class Test01 {
    public static void main(String[] args) {

        // java.lang.Integer  객체 생성
        // Int 형 값을 관리하는 클래스
        Integer a = new Integer(100);
        Integer b = new Integer("100");


        // Object 클래스의 기능 사용가능

        System.out.println(a.toString());
        System.out.println(b.toString());

        // A와 B는 같은가?
        // 1. 같은 객체인가?
        // 2. 같은 값인가?
        System.out.println(a == b);
        System.out.println(a.equals(b));

    }
}
