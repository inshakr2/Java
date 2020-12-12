package main.java.oop.Inherit4;

// * 크롬
// 주소, 버전 : 필수 설정 요소
// 이동기능, 새로고침 기능, 개발자 도구 기능
// * 엣지
// 주소, 버전 : 필수 설정 요소
// 이동기능, 새로고침 기능, 윈도우 연동 기능
public class Browser {

    public void move() {
        System.out.println("다른 페이지로 이동합니다.");
    }

    public void refresh() {
        System.out.println("새로고침을 시도합니다.");
    }

    protected String url;
    protected String version;

    public Browser(String url, String version) {
        this.url = url;
        this.version = version;
    }
}
