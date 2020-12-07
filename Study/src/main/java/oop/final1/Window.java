package main.java.oop.final1;

// program 창
public class Window {

    private int x;
    private int y;

    // final 키워드는 값을 할당해주지 않으면 생성할 수 없다.
    //private final int width;
    //private final int height;

    private final int width = 500;
    private final int height = 1000;

    // 만약 최초 1회에 설정을 할 수 있도록 하기 위해서는 생성자를 이용한다.

    private final String id;
    private final String pw;

    public Window(String id, String pw) {
        this.id = id;
        this.pw = pw;

    }

}
