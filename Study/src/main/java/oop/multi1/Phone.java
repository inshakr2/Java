package main.java.oop.multi1;

// interface
//  - 다중상속을 위해 만들어진 클래스
//  - 다중상속 : 부모 클래스를 여러개.. 개발 속도를 올려주지만 모호성에 의한 위험성 존재
//  - Java 에서는 interface만 다중상속이 가능하다. (클래스는 단일상속)
//  - 즉, Class를 하나 상속받고 interface는 다중상속으로 동시에 받을 수 있다.
//  -

public interface Phone {
    // 클래스의 구성 요소 - 멤버변수, 멤버메소드, 생성자.
    // 인터페이스에서는 각 구성요소가 어떤 형태로 존재하는가?
    // 다중상속에 문제가 되는 내용들은 가질 수 없다.

    // 변수 - 상수만 가능
    String number = null;
    public static final int price = 1;

    // 메소드 - 추상메소드만 가능
    void call();
    public void camera();
    public abstract void sms();

    // 생성자 - 생성불가가

    // ---------- interface는 대략적인 형태만 잡아줄 수 있다. 구체적인 기능을 적을 수 없다.
    // ---------- 상속관계에서 상위 클래스 역할만 수행한다.





}
