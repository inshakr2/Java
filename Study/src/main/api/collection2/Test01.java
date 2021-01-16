package main.api.collection2;

import java.util.ArrayList;
import java.util.List;

public class Test01 {
    public static void main(String[] args) {
        // 목표 : Student를 저장하는 list 구현

        List<Student> students = new ArrayList<>();

        students.add(new Student("홍길동", 100));
        students.add(new Student("파이리", 90));
        students.add(new Student("손흥민", 100));

        // size
        System.out.println(students);
        System.out.println(students.size());

        // 출력
        System.out.println(students.get(0).getName());

    }
}
