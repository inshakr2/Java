package main.java.oop.basic3;

public class Player {



    String name;
    String position;
    String team;
    int goal;
    int assist;
    int time;

    void setInfo(String name, String position, String team, int goal, int assist, int time){
        this.setName(name);
        this.setPosition(position);
        this.setTeam(team);
        this.setGoal(goal);
        this.setAssist(assist);
        this.setTime(time);
    }

    void print() {
        System.out.println("---- Player's info of the Today Match ----");
        System.out.println("Name : \t\t" + this.name);
        System.out.println("Position : \t" + this.position);
        System.out.println("Team : \t\t" + this.team);
        System.out.println("----------------- Record -----------------");
        System.out.println("Goal : \t\t" + this.goal);
        System.out.println("Assist : \t" + this.assist);
        System.out.println("Time : \t\t" + this.time);

    }


    // setter 설정 추가
    // setter의 장점, 값을 할당할 때 조건을 걸어줄 수 있다.
    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        switch (position.toUpperCase()) {
            case "GK":
            case "DF":
            case "MF":
            case "FW":
                this.position = position;
        }
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void setGoal(int goal) {
        if(goal >= 0) {
            this.goal = goal;
        }
    }

    public void setAssist(int assist) {
        if(assist >= 0){
        this.assist = assist;
        }
    }

    public void setTime(int time) {
        if(time >= 0 && time <= 130) {
            this.time = time;
        }
    }
}
