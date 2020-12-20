package main.api.lang.string;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        // 닉네임 입력
        Scanner sc = new Scanner(System.in);


        while (true) {

            System.out.println("닉네임을 입력하세요");
            String name = sc.next();
            boolean isLength = name.length() >= 2 && name.length() <= 6;
            boolean isUser = !name.contains("운영자");

            if (isLength && isUser) {
                System.out.println("닉네임 설정 완료");
                break;
            } else {
                System.out.println("잘못된 닉네임입니다. 다시 설정하세요");
            }
        }

    }
}
