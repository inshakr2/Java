package main.java.oop.Inherit6;

public class MP3 extends MediaFile{
    private long filesize = 1;

    public MP3(String filename) {
        super(filename);
    }

    @Override
    public void forward() {
        System.out.println("더 빠르게 음악재생");
    }

    @Override
    public void rewind() {
        System.out.println("음악 되감기");
    }

    @Override
    public void execute() {
        System.out.println("음악 파일을 샐힝합니다.");
    }
}
