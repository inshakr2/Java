package main.java.oop.Inherit5;

public class PPT extends File{
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    private int size = 1;
    @Override
    public void execute() {
        System.out.println("파워포인트 애니메이션을 재생합니다");
    }

    public PPT(String filename, long filesize) {
        super(filename, filesize);
    }
}
