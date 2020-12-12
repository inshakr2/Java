package main.java.oop.Inherit5;

public class Mp3 extends MediaFile{

    @Override
    public void forward() {
        System.out.println("음악을 빨리감기 합니다");
    }

    @Override
    public void rewind() {
        System.out.println("음악을 되감기 합니다");
    }

    @Override
    public void execute() {
        System.out.println("음악재생을 시작합니다");
    }


    public Mp3(String filename, long filesize) {
        super(filename, filesize);
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    private int duration;
}
