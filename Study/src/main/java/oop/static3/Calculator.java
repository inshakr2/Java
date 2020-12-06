package main.java.oop.static3;

// 꼭 객체를 만들어야만 하는건가?
// 객체를 만들지 않고 메소드를 직접 등록해서 사용할 수 있도록 처리 ( 정적 메소드 )
public class Calculator {

    /**
     * static : 정적 처리를 수행하는 키워드
     * 부착하면 객체가 없이도 접근 가능, ( 반 객체지향 키워드 )
     */
    public static long plus(long x, long y) {
        return x + y;
    }

}
