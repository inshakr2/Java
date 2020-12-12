package main.java.oop.Inherit4;

public class Test01 {

    public static void main(String[] args) {
        Chrome chrome = new Chrome("Naver", "1.0.1");
        Edge edge = new Edge("Google", "1.2.0");

        chrome.move();
        chrome.refresh();
        chrome.develop();

        edge.move();
        edge.refresh();
        edge.windows();
    }
}
