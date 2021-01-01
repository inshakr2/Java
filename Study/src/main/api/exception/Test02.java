package main.api.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        // 예외 처리 구문
        // try : 감시블록
        // catch : 처리블록

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("현재 사과 개수를 입력하세요");
            int apple = sc.nextInt();   // InputMismatch
            System.out.println("사람 수를 입력하세요");
            int people = sc.nextInt();  // InputMismatch

            System.out.println("한 사람당 먹을 수 있는 사과의 개수 = " + apple / people); // Arithmetic
        } catch (ArithmeticException e1) {
            // ArithmeticException이 발생하면 정보를 e1이라는 객체로 전달받음
            System.out.println("인원수는 1이상 입력.");
        } catch (InputMismatchException e2) {
            System.out.println("정수 형태로 입력.");
        }

        // Q1 : 처리 구문이 너무 길다.
        // Q2 : 예외가 정말 2개 뿐인가?
    }
}
