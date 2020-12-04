package main.java.oop.constructor2;

public class Player {


    private String name;
    private String position;
    private String team;
    private int goal;
    private int assist;
    private int time;

    // 기본 생성자
    public Player(String name, String position, String team, int goal, int assist, int time) {
        this.setName(name);
        this.setPosition(position);
        this.setTeam(team);
        this.setGoal(goal);
        this.setAssist(assist);
        this.setTime(time);
    }







    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getGoal() {
        return goal;
    }

    public void setGoal(int goal) {
        this.goal = goal;
    }

    public int getAssist() {
        return assist;
    }

    public void setAssist(int assist) {
        this.assist = assist;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }




}
