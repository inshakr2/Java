package main.api.collection;

public class Test09 {
    public static void main(String[] args) {

        // 인터페이스는 객체를 생성할 수 없다.
        //  = 인터페이스를 이용해서 함수형 객체를 생성할 수 있다.
        //  = 익명 중첩 클래스 (anonymous inner class)
        //    : 1회용 상속을 간편하게 받기 위한 구문

        // 불가능
        // Car a = new Car();

        Car a = new Car() {
            @Override
            public void drive() {
                System.out.println("drive");
            }
        };

        Car b = new Car() {
            @Override
            public void drive() {
                System.out.println("DRIVE");
            }
        };

        // 추론(Lambda) : 추리할 수 있는 내용이라면 다 적지않아도 완성
        //  - Car에는 메소드가 1개 뿐 (drive)
        //  - 인터페이스를 객체로 만드려면 반드시 익명 중첩 클래스를 사용해야 한다
        //  = 인터페이스 메소드가 1개 뿐이면 추론식(Lambda) 사용 가능
        Car c = () -> {
            System.out.println("Drive");
        };


    }
}
