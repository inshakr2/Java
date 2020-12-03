package main.java.oop.constructor1;

public class Student {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    private String name;
    private int score;

    // 원래 사용하던 info를 생성자로 변경!
    // - 생성자는 void와 같은 반환형을 적을 수 없다.
    // - 이름이 클래스 이름과 반드시 동일해야 한다
    // 생성 방식을 정하는 용도로 사용!
    public Student (String name, int score) {
        this.setName(name);
        this.setScore(score);
    }
}
