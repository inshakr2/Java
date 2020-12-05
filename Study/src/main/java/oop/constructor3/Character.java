package main.java.oop.constructor3;

public class Character {

    /**
     * 게임 캐릭터 만들기 튜토리얼
     * 캐릭터는 아이디, 레벨, 직업, 소지금의 정보를 가지고 있다.
     * 캐릭터 생성시 아이디와 직업은 반드시 설정해야한다.
     * 소지금, 레벨은 설정하지 않을 경우 0, 1로 기본 설정된다. (물론 초기에 설정할 수 있지만, 해당 값보다 작을 수 없다.)
     * 직업은 전사, 마법사, 궁수, 도적만 가능
     */

    public void print() {
        System.out.println("===============캐릭터 정보===============");
        System.out.println("|아이디|\t|직업|\t|레벨|\t|소지금|");
        System.out.println("|"+this.getId()+"|\t"+"|"+this.getJob()+"|\t"+"|"+this.getLevel()+"|\t"+"|"+this.getMoney()+"|");
    }

    private String id;
    private int level;
    private String job;
    private int money;


    public Character(String id, String job) {
        this.setId(id);
        this.setJob(job);
        this.setLevel(1);
        this.setMoney(0);

    }

    public Character(String id, String job, int level, int money) {
        this.setId(id);
        this.setJob(job);
        this.setLevel(level);
        this.setMoney(money);
    }

    // setter
    public void setId(String id) {
        this.id = id;
    }

    public void setJob(String job) {

        switch(job) {
            case "전사":
            case "마법사":
            case "궁수":
            case "도적":
                this.job = job;
        }

    }

    public void setLevel(int level) {
        if (level < 0) {
            return;
        }
        this.level = level;
    }

    public void setMoney(int money) {
        if (money < 0) {
            return;
        }
        this.money = money;
    }

    // getter

    public String getId() {
        return this.id;
    }

    public String getJob() {
        return this.job;
    }

    public int getLevel() {
        return this.level;
    }

    public int getMoney() {
        return this.money;
    }
}
