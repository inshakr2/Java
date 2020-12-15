package main.java.oop.multi2;

// 가수이면서 요리사인 사람 클래스 -- 다중상속
//  = interface는 implements라는 키워드로 상속받아야 한다.
public class Person implements Singer, Chef {

    @Override
    public void sing() {
        System.out.println("기타치며");
    }

    @Override
    public void dance() {
        System.out.println("춤추며");
    }

    @Override
    public void pasta() {
        System.out.println("지지고 볶고");
    }

    @Override
    public void pizza() {
        System.out.println("굽고");
    }
}
