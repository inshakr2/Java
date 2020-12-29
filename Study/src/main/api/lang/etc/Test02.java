package main.api.lang.etc;

public class Test02 {
    public static void main(String[] args) {

        // java.lang.System
        //  - 생성자 X
        //      : Math와 동일
        // Program 밖의 어떤 도구에 접근할 수 있는 or OS를 제어할 수 있는 기능을 가지고 있음.

        // System.out : 표준 출력
        System.out.println("Hello System");

        // System.err : 표준 에러
        System.err.println("Hello System");

        // 순서가 뒤바뀌어 출력될 때가 있다.
        // 출력되는 통로 - out / err 2개. 따라서 순서가 바뀔 수 있다

        // System.in : 표준 입력 ( + Scanner )
    }
}
