package main.java.oop.Inherit6;

public abstract class MediaFile extends File{

    public MediaFile(String filename) {
        super(filename);
    }

    // 상속받은 execute()는 숨어있음.
    public abstract void forward();
    public abstract void rewind();
}
