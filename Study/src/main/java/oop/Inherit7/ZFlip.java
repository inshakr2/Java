package main.java.oop.Inherit7;

public class ZFlip extends Phone{
    
    @Override
    public void call() {
        System.out.println("ZFlip 전화 기능");
    }

    @Override
    public void sms() {
        System.out.println("ZFlip 문자 기능");
    }

    @Override
    public void camera() {
        System.out.println("ZFlip 카메라 기능");
    }
}
