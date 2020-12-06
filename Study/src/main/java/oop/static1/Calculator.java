package main.java.oop.static1;

// 더하기만 하는 계산기를 만들어보자.
public class Calculator {
    public Calculator(long x, long y) {
        this.x = x;
        this.y = y;
    }

    private long x;
    private long y;

    public long getTotal() {
        return this.x + this.y;
    }

}
