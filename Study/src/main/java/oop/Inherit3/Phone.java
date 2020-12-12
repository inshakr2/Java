package main.java.oop.Inherit3;

// 변수, 메소드, 생성자를 어떤 형태로 구현할지 고민해야한다.
// - 변수 : 접근제한 설정
// - 메소드 : 재정의 (Override) 를 고려하여 설정
// - 생정자 : 필수 데이터 설정 여부
public class Phone {


    public Phone(String number) {
        this.number = number;
    }

    // private 접근 제한자는 나만 사용.. 자식 클래스에서도 사용할 수 없다.
    // 상속받은 자식 클래스에서도 사용할 수 있도록 하기 위해서는 protected 접근 제한자를 사용한다.

    protected String number;
    protected String color;
    protected int price;

    // Override 금지
    public final void call() {
        System.out.println("전화걸기");
    }
    public void sms() {
        System.out.println("문자보내기");
    }
    public void camera() {
        System.out.println("사진찍기");
    }

}
