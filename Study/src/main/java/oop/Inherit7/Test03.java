package main.java.oop.Inherit7;

import java.util.Random;

public class Test03 {
    public static void main(String[] args) {
        // 다형성을 적용한 코드
        // ZFlip = 1    GalaxyFold = 2      Iphone = 3
        Random r = new Random();
        int number = r.nextInt(3) + 1;

        // 상속 OK & 재정의 OK => 모두 Phone이라고 생각할 수 있다.
        // 뭐든 뽑아서 Phone 변수에 저장
        // Phone p = ZFlip 객체 or GalaxyFold 객체 or Iphone 객체

        Phone p;
        switch (number) {
            case 1:
                p = new ZFlip();
            case 2:
                p = new GalaxyFold();
            case 3:
                p = new Iphone();
                break;
            default:
                p = new Iphone();
        }

        p.call();
        p.sms();
        p.camera();



    }
}
