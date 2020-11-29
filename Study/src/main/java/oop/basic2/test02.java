package oop.basic2;

public class test02 {
    public static void main(String[] args) {

        PlayerInfo p1 = new PlayerInfo();
        PlayerInfo p2 = new PlayerInfo();

        p1.name = "손흥민";
        p1.sports = "축구";
        p1.gold = 1;
        p1.silver = 0;
        p1.bronze = 1;

        System.out.println("선수 이름 : "+p1.name);
        System.out.println("종목 : "+p1.sports);
        System.out.println("금메달 : "+p1.gold);
        System.out.println("은메달 : "+p1.silver);
        System.out.println("동메달 : "+p1.bronze);

        System.out.println("\n ##Method");
        p2.set("김연아","피겨스케이팅",3,1,1);
        p2.print();
    }
}
