package main.api.exception;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        // Error : 오류 (실행이 불가능한 상황)
        // Exception : 예외 (실행 후에 문제가 되는 상황)

        // 예외 유발
        Scanner sc = new Scanner(System.in);
        System.out.println("현재 나이를 입력하세요.");
        int apple = sc.nextInt();
        // int 이외의 값에서 예외가 발생한다


    }
}
