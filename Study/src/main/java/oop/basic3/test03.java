package main.java.oop.basic3;

public class test03 {

    public static void main(String[] args) {

        Player p1 = new Player();
        Player p2 = new Player();

        p1.setInfo("Son", "FW","ToT", 3, 1, 90);
        p1.print();

        p2.setInfo("Knae", "FW", "ToT", 2, 4, 90);
        p2.print();


        // setter 강제화 후, 특정 맴버변수를 호출하기 위해선 getter를 사용

        if(p1.getGoal() > p2.getGoal()){
            System.out.println(p1.getName() + "선수가 골을 더 많이 넣었습니다.");
        } else {
            System.out.println(p2.getName() + "선수가 골을 더 많이 넣었습니다.");
        }


    }
}
