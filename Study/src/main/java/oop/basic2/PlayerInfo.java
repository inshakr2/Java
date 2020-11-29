package oop.basic2;

public class PlayerInfo {
    String name;
    String sports;
    int gold;
    int silver;
    int bronze;
    int total;

    int getTotal() {
        return this.gold + this.silver + this.bronze;
    }


    // Method를 만들자
    void print() {
        // 미래 기능에 대한 설명
        // 이 객체의 모든 구성요소는 어떤 사용자가 사용할지 모름
        // 이 method를 사용하는 객체가 가지고 있는 == this
        // 내가 가지고 있는.
        System.out.println("선수 이름 : "+this.name);
        System.out.println("종목 : "+this.sports);
        System.out.println("금메달 : "+this.gold);
        System.out.println("은메달 : "+this.silver);
        System.out.println("동메달 : "+this.bronze);
        System.out.println("총 메달 수 : "+this.total);
    }

    // Initialize Method 생성
    void set(String name, String sports, int gold, int silver, int bronze){
        this.name = name;
        this.sports = sports;
        this.gold = gold;
        this.silver = silver;
        this.bronze =  bronze;
        this.total = getTotal();

    }
}
