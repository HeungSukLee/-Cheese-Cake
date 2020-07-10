import org.omg.Messaging.SYNC_WITH_TRANSPORT;

class Document {//문서객체
    static int count = 0; //문서번호
    String name;     // 문서명(Document name)

    Document() {     // 문서 기본생성자.
        this("제목없음" + ++count);
    }

    Document(String name) { //매개변수가 하나인 문서생성자.
        this.name = name;
        System.out.println("문서 " + this.name + "가 생성되었습니다."); //생성자에 print를 썼기때문에, 호출될 떄 마다 출력!!
    }
}

class DocumentTest {
    public static void main(String args[]) {
        Document d1 = new Document(); // 기본생성자 호출 -> this( )를 통해서 매개변수가 하나인 문서생성자 호출 //  객체만 생성해도 출력이 실행이된다.
        Document d2 = new Document("자바.txt"); // 바로 매개변수가 하나인 생성자 실행
        Document d3 = new Document(); // count는 static으로 선언하였으므로 매 번 초기화 되지 않고 숫자가 올라간다.
        Document d4 = new Document();
    }
}