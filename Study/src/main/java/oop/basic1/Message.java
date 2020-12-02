package main.java.oop.basic1;

/*
*   메세지가 뭔지 알려주기 위한 구문
*   -- Message  = 보낸 사람 + 내용 + 보낸시간 + 안읽은 숫자
*               = String + String + String + int
*               = sender + text + time + read
*
*   이러한 구문이 있을 경우 자바는 Message 라는 DataType을 인식하게 되며
*   해당 데이터 (여기서는 4개)로 구성되어 있다는 것을 이해하고 그에 맞는 준비를 한다.
* */

public class Message {
    String sender;
    String text;
    String time;
    int read;
    // 값 할당을 하지 않는다.
    // 지금 이 프로그램이 특정인만 사용하는 것이 아니다..
    // 누가 보내는지 어떤 메세지를 보낼지. 그건 사용자마다 틀린것
    // 단지 메세지를 만들 때,, 내가 필요한 구성요소가 들어갈 수 있는 자리만 미리 할당해두는 것.
    // 마치 시험지에 이름, 수험번호 등등을 비워두고 특정 수험인이 직접 적는것 처럼

}
