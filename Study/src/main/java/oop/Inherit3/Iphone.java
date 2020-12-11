package main.java.oop.Inherit3;

public class Iphone extends Phone {


    // 부모 클래스에 있는 Method를 수정하거나 기능을 바꾸고자 할 때,
    // Override Annotation이 필수는 아니지만, 명시해두는것이 규칙
    @Override
    public void sms() {
        System.out.println("아이메세지");
    }

    public void airdrop() {
        System.out.println("에어드랍");
    }

    public void siri() {
        System.out.println("시리야");
    }

}
