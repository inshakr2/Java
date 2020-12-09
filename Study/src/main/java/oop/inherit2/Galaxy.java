package main.java.oop.inherit2;

// Galaxy Class
//  - Phone Class 의 내용을 가져와서 추가되는 부분을 구현한다.
//  - 가져온다 = 상속받는다 = extends
public class Galaxy extends Phone {
    public void samsungpay () {
        System.out.println("삼성페이");
    }
    public void bixby() {
        System.out.println("하이 빅스비");
    }
}
