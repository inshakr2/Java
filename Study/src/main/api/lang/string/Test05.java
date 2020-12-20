package main.api.lang.string;

import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
        // 쿵쿵따 만들기
        // 1. 3글자
        // 2. 앞 단어의 끝 글자와 뒷 단어의 첫 글자 일치

        Scanner sc = new Scanner(System.in);
        String preWord = "바나나";

        while (true) {
            System.out.println(preWord + " 쿵쿵따 !");
            String nextWord = sc.next();

            if (isCorr(preWord, nextWord) && isThree(nextWord)) {
                preWord = nextWord;

                continue;
                } else {
                System.out.println("틀렸습니다!!");
                break;
            }

            }
        }

    private static boolean isCorr(String preWord, String nextWord) {
        boolean result;
        String pre = preWord.substring(2);
        String next = nextWord.substring(0, 1);

        if (pre.equals(next)) {
            result = true;
        } else {
            result = false;
        }
        return result;
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
