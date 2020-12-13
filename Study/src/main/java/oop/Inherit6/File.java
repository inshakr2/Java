package main.java.oop.Inherit6;

// 추상클래스 (abstract class)
// - 상속관계에서 상위 클래스의 역할을 수행하는 클래스
// - 일반 클래스와 다르게 인스턴스 생성이 안된다.
// - 일반 클래스와 다르게 추상메소드 (abstract method)를 가질 수 있다.
public abstract class File {
    // 추상 메소드
    // - 이름은 있지만 코드가 없는 메소드
    // - 재정의를 강요하는 역할
    public abstract void execute();

    // 맴버 변수
    protected String filename;
    protected long filesize;

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public long getFilesize() {
        return filesize;
    }

    public void setFilesize(long filesize) {
        this.filesize = filesize;
    }

    // 생성자
    public File(String filename) {
        this.filename = filename;
    }

}
