package main.api.collection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test02 {
    public static void main(String[] args) {
        List<Member> members = new ArrayList<>();

        members.add(new Member("tester", "test1234"));
        members.add(new Member("master", "master1234"));
        members.add(new Member("user", "user1234"));
        members.add(new Member("admin", "admin1234"));

        System.out.println("전체 회원수 : " + members.size());

        for (Member m : members) {
            System.out.println(m.toString());
        }

        Comparator<Member> c = new Comparator<Member>() {
            @Override
            public int compare(Member a, Member b) {
                return a.getId().compareTo(b.getId());
            }
        };

        Collections.sort(members, c);
        System.out.println("정렬 결과");
        for (Member m : members) {
            System.out.println(m.toString());
        }
    }
}
