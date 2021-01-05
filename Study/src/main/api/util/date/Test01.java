package main.api.util.date;

import java.sql.SQLOutput;
import java.util.Date;

public class Test01 {
    public static void main(String[] args) {
        // java.util.Data
        //  - 생성자 Deprecated가 많다 : Y2K 때문

        Date a = new Date();
        System.out.println(a);

        // 연월일을 설정하는 생성자 (Depreciate)
        Date b = new Date(2020, 10, 23);
        // 경고 + 표식이 나온다.
        // 여러 문제점으로 앞으로 쓰지 말것을 권장 - 사라질 수 있다.

        System.out.println(b); // Tue Nov 23 00:00:00 KST 3920
        // 문제점 : 시간이 한국인 정서에 맞지 않게 나온다.
        // 해결책 : 시간 형식을 설정하는 클래스를 찾아서 사용
    }

}
