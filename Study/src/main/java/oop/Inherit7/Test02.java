package main.java.oop.Inherit7;

import main.java.oop.Inherit3.Galaxy;

import java.util.Random;

public class Test02 {

    public static void main(String[] args) {
        // 다형성을 적용하지 않은 코드
        // 랜덤으로 아무 휴대폰이나 하나 만들어서 전화와 문자 기능을 사용.
        // ZFlip = 1    GalaxyFold = 2      Iphone = 3
        // 다형성을 사용하지 않으면 중복 코드가 발생한다..

        Random r = new Random();
        int number = r.nextInt(3) + 1;

        switch (number) {
            case 1:
                ZFlip zFlip = new ZFlip();
                zFlip.call();
            case 2:
                GalaxyFold fold = new GalaxyFold();
                fold.call();
            case 3:
                Iphone iphone = new Iphone();
                iphone.call();

        }
    }
}
