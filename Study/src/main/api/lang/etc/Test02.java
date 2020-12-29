package main.api.lang.etc;

import java.sql.SQLOutput;

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

        // 운영체제 시간 정보
        //  - 기준시 (1970년 1월 1일 0시 0분 0초)로 부터 흐른 총 밀리초를 반환환
       long time = System.currentTimeMillis();
        System.out.println("time = " + time);

        // 프로그램 종료
//        System.exit(0);
//        System.out.println("exit");

        // 운영체제의 각종 상태
        System.out.println(System.getProperties());
        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("os.version"));
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("user.dir"));
        System.out.println(System.getProperty("java.specification.version"));


    }
}
