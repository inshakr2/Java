package main.java.oop.Inherit6;

public class PPT extends File{
    private long size = 1;

    public PPT(String filename) {
        super(filename);
    }

    @Override
    public void execute() {
        System.out.println("파워포인트 애니메이션을 재생합니다.");
    }

}
