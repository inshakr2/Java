package main.java.oop.Constant1;

import java.util.Random;

public class Test01 {
    public static void main(String[] args) {
        // 가위바위보를 랜덤으로 내는 프로그램을 작성

        Random r = new Random();
        int com = r.nextInt(3) + 1;

        // 상수 없이 아래와 같이 프로그램 작성시.. 아래처럼 주석을 달아줘야한다.
        // 또한 다른 곳에서 쓸 수 가 없다!!
        /**
         *  1 : 가위
         *  2 : 바위
         *  3 : 보
         */
        switch(com) {
            case 1:
                System.out.println("가위!");
                break;
            case 2 :
                System.out.println("바위!");
                break;
            case 3 :
                System.out.println("보!");
                break;

        }
    }
}
