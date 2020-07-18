class Document { // 문서객체생성
    static int count = 0; // 인스턴스가 생성될때마다 수를 저장하기위해서 static으로 저장
    String name;

    Document() {     // 문서 기본생성자.
        this("제목없음" + ++count);
    }

    Document(String name) {
        this.name = name;
        System.out.println("문서 " + this.name + "가 생성되었습니다.");
    }
}

class DocumentTest {
    public static void main(String args[]) {
        Document d1 = new Document();
        Document d2 = new Document("자바.txt");
        Document d3 = new Document();
        Document d4 = new Document();
    }
}