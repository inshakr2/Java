package main.java.oop.Inherit5;

public class File {

    // 상속받을 클래스에 값이 모두 다르므로 값은 설정하지 않아도 된다.
    public void execute() {}

    public File(String filename, long filesize) {
        this.filename = filename;
        this.filesize = filesize;
    }

    protected String filename;
    protected long filesize;



}
