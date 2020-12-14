package main.java.oop.Inherit7;

public class Test01 {
    public static void main(String[] args) {

//        ZFlip a = new ZFlip();
//        GalaxyFold b = new GalaxyFold();
//        Iphone c = new Iphone();
//        a.call();
//        b.camera();
//        c.sms();

        // 그러나.. Phone을 상속받은 각각의 Class들은 부모 객체로 생성할 수 있다.
        // 상위 개념 아래 실제 형태.. 하지만 하나의 상위 개념으로 동적 생성이 가능하다!
        // - 다형성 (Polymorphism)
        // - 조건 : 상속을 받아야 한다.

        Phone a = new ZFlip();
        Phone b = new GalaxyFold();
        Phone c = new Iphone();
    }
}
