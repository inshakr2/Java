package main.java.oop.Inherit7;

public class GalaxyFold extends Phone {
    @Override
    public void call() {
        System.out.println("Galaxy Fold 전화 기능");
    }

    @Override
    public void sms() {
        System.out.println("Galaxy Fold 문자 기능");
    }

    @Override
    public void camera() {
        System.out.println("Galaxy Fold 카메라 기능");
    }
}
