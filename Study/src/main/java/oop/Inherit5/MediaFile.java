package main.java.oop.Inherit5;

public class MediaFile extends File  {
    public MediaFile(String filename, long filesize) {
        super(filename, filesize);
    }

    // 마찬가지로 상속받을 클래스에 모두 값이 바뀔것이니 값을 비워두자.
    public void forward() {}
    public void rewind() {}


}
