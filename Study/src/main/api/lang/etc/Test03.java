package main.api.lang.etc;

import java.io.IOException;

public class Test03 {
    public static void main(String[] args) throws IOException {

        // java.lang.Runtime
        //  - 생성자 X
        //  - 사용자가 원하는 방식으로 생성하도록 유도,, = 생성 명령이 존재
        Runtime run = Runtime.getRuntime();

        // exec() : 외부 명령을 실행 (운영체제마다 틀리다)
        // throws IOException - 예외처리 아무것도 하지 않는다.
        run.exec("notepad.exe");
        run.exec("calc.exe");


    }
}
