package main.java.oop.static2;

public class Calculator {
    // 클래스에 생성자가 없으면 기본 생성자가 제공된다.

    /**
     * 기존 멤버 메소드의 문제점
     * : 멤버 필드와 연계해야 한다.
     * 해결책
     * : 멤버필드를 없애고 매개변수로 데이터를 즉시 받아서 반환하도록 구성
     */

    public long plus(long x, long y) {
        return x + y;
    }
}
