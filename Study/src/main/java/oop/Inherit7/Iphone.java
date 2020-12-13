package main.java.oop.Inherit7;

public class Iphone extends Phone {

    @Override
    public void call() {
        System.out.println("Iphone 전화 기능");
    }

    @Override
    public void sms() {
        System.out.println("Iphone 문자 기능");
    }

    @Override
    public void camera() {
        System.out.println("Iphone 카메라 기능");
    }
}
