class Tv { //TV생성
    boolean power;
    int channel;

    void power()        {   power = !power; }
    void channelUp()    { 	 ++channel;     }
    void channelDown()  {	 --channel;	    }
}

class CaptionTv extends Tv { // Tv를 상속하는 Caption생성
    boolean caption;		// 캡션상태(on/off)
    void displayCaption(String text) {
        if (caption) {	// 캡션 상태가 on(true)일 때만 text를 보여 준다.
            System.out.println(text);
        }
    }
}

class CaptionTvTest {
    public static void main(String args[]) {
        CaptionTv ctv = new CaptionTv();
        ctv.channel = 10;				// 조상 클래스로부터 상속받은 멤버사용
        ctv.channelUp();				// 조상 클래스로부터 상속받은 멤버ㅓ사용
        System.out.println(ctv.channel);
        ctv.displayCaption("Hello, World"); //캡션기능은 자손클래스에서 추가된 내용이다.
        ctv.caption = true;
        ctv.displayCaption("Hello, World");
    }
}