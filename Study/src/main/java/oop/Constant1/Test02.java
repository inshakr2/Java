package main.java.oop.Constant1;

import java.util.Random;

public class Test02 {

    // 아래와 같이 실제 약속 변수를 생성하면 알아보기도 편하고 일일이 주석을 달아줄 필요도 없다 ! (상수)
    public static final int Rock = 1;
    public static final int Scissors = 2;
    public static final int Paper = 3;

    public static void main(String[] args) {

        Random r = new Random();
        int com = r.nextInt(3) + 1;

        switch (com) {
            case Rock:
                System.out.println("바위");
                
            case Scissors:
                System.out.println("가위");
                
            case Paper:
                System.out.println("보");
                    
        }
    }
}
