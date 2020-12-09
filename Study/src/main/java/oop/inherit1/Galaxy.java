package main.java.oop.inherit1;

public class Galaxy {
    private String number;
    private String color;
    private int price;

    // setter & getter 외 기능
    public void call() {
        System.out.println("전화");
    }
    public void sms() {
        System.out.println("문자");
    }
    public void camera() {
        System.out.println("카메라");
    }
    public void samsungPay() {
        System.out.println("삼성페이");
    }
    public void bixby() {
        System.out.println("하이 빅스비");
    }

    // 핸드폰의 공통점, 공통 기능을 따로 두고 공유하면 안될까?
    // 공통이 많은 클래스 (위 예시와 같이..) 에서 공통점만 뽑아서 클래스를 만든다!
    // 추상화 : 어떤 대상의 공통점을 보고 하나로 합치는 것

}
