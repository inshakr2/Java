package main.api.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("현재 사과 개수를 입력하세요");
            int apple = sc.nextInt();
            System.out.println("사람 수를 입력하세요");
            int people = sc.nextInt();

            System.out.println("한 사람당 먹을 수 있는 사과의 개수 = " + apple / people);
        } catch (Exception e) {
            System.err.println("오류 발생!");
            e.printStackTrace();
        }
    }
}
