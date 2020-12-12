package main.java.oop.Inherit3;

public class Galaxy extends Phone {
    // 부모클래스에 생성자가 있으면 상속받은 클래스에도 있어야 한다!
    // 형태를 맞춰야 한다.
    // - 부모클래스 생성에 필요로 하는 데이터를 넘겨즈지 않으면 절대로 상속받을 수 없다.
    public Galaxy (String number) {
        // 부모클래스의 생성자에 전달
        super(number);

    }

    public void samsungpay() {
        System.out.println("삼성페이");
    }
    public void bixby() {
        System.out.println("하이 빅스비");
    }
}
