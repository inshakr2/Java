package main.api.lang.etc;

public class Test01 {
    public static void main(String[] args) {

        // java.lang.Math
        //  - 생성자 X
        //   : static 처리 or 생성을 제한

        // abs() : 절대값
        System.out.println(Math.abs(-1));

        // round() : 반올림
        System.out.println(Math.round(1.5));

        // pi
        System.out.println(Math.PI);

        // random : 무작위 실수 0이상 1미만
        System.out.println(Math.random());

        // min & max
        int x = Math.min(10, 15);
        int y = Math.max(10, 15);
        System.out.println(x);
        System.out.println(y);

        // pow() : 거듭제곱
        System.out.println(Math.pow(2, 10));
    }

}
