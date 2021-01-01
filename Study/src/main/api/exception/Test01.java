package main.api.exception;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        // Error : 오류 (실행이 불가능한 상황)
        // Exception : 예외 (실행 후에 문제가 되는 상황)

        // 예외 유발
        Scanner sc = new Scanner(System.in);
        System.out.println("현재 사과 개수를 입력하세요");
        int apple = sc.nextInt();
        System.out.println("사람 수를 입력하세요");
        int people = sc.nextInt();

        System.out.println("한 사람당 먹을 수 있는 사과의 개수 = " + apple / people);
        // int 이외의 값에서 예외가 발생한다
        // 수학적 계산에 오류가 발생한다.

        // 예외는 2가지가 발생.
        // - java.util.InputMismatchException
        // - java.lang.ArithmeticException



    }
}
