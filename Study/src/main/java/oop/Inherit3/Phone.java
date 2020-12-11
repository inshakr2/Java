package main.java.oop.Inherit3;

public class Phone {
    // private 접근 제한자는 나만 사용.. 자식 클래스에서도 사용할 수 없다.
    // 상속받은 자식 클래스에서도 사용할 수 있도록 하기 위해서는 protected 접근 제한자를 사용한다.

    protected String number;
    protected String color;
    protected int price;

    public void call() {
        System.out.println("전화걸기");
    }
    public void sms() {
        System.out.println("문자보내기");
    }
    public void camera() {
        System.out.println("사진찍기");
    }

}
