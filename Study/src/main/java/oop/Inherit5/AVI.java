package main.java.oop.Inherit5;

public class AVI extends MediaFile {
    private int spped;

    public int getSpped() {
        return spped;
    }

    public void setSpped(int spped) {
        this.spped = spped;
    }

    @Override
    public void forward() {
        System.out.println("영상을 빨리감기합니다.");
    }

    @Override
    public void rewind() {
        System.out.println("영상을 되감기합니다.");
    }

    @Override
    public void execute() {
        System.out.println("영상 재생을 " + this.spped +"배속으로 시작합니다");
    }

    public AVI(String filename, long filesize) {
        super(filename, filesize);
    }
}
