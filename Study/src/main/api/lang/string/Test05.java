package main.api.lang.string;

import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
        // 쿵쿵따 만들기
        // 1. 3글자
        // 2. 앞 단어의 끝 글자와 뒷 단어의 첫 글자 일치

        Scanner sc = new Scanner(System.in);




        }



    private static boolean isThree(String word) {
        boolean result;

        if (word.length() == 3) {
            result = true;
        } else {
            result = false;
        }

        return result;
    }

}
