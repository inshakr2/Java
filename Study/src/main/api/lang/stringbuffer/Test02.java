package main.api.lang.stringbuffer;

public class Test02 {
    public static void main(String[] args) {

        // StringBuffer vs StringBuilder
        //       동기    vs   비동기 -- more faster
        // Method는 동일

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 10000; i++) {
            sb.append("Hello \n");
        }



    }
}
