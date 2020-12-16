package main.api.lang.object;

public class Test03 {
    public static void main(String[] args) {

        Student st = new Student();

        int v = st.hashCode();
        String s = st.toString();

        System.out.println(v);
        System.out.println(s);
        // 아무것도 상속받지 않아도 Object의 기능은 사용할 수 있다..
        // Why?
        //  : 최상위 클래스. extends Object 생략
    }
}
