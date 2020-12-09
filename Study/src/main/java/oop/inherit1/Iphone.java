package main.java.oop.inherit1;

public class Iphone {
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
    public void airdrop() {
        System.out.println("에어드랍");
    }
    public void siri() {
        System.out.println("시리야");
    }
}
