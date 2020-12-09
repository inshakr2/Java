package main.java.oop.inherit2;

// 상위 (super) 클래스 또는 부모(parent) 쿨래스
// 클래스들의 공통점을 추상화시켜 만든 클래스
// 상위 클래스는 객체 생성을 하면 안된다!!
public class Phone {
    private String number;
    private String color;
    private int price;

    public void call() {
        System.out.println("전화");
    }
    public void sms() {
        System.out.println("문자");
    }
    public void camera() {
        System.out.println("카메라");
    }

}
