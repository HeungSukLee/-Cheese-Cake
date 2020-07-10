interface Parseable { //구문작업을 수해하는 인터페이스
    public abstract void parse(String fileName);
}
class ParserManager { //XML HTML중에 무엇을 사용할지 결정하는 클래스. // MAIN함수에서 이 객체를 생성하고 함수를 이용하여
    //HTML 또는 XML 객체를 반환받아서 사용한다.

    public static Parseable getParser(String type) { //인터페이스 Parseable타입
        if(type.equals("XML")) {
            return new XMLParser();
        } else {
            Parseable p = new HTMLParser();
            return p;
           //return new HTMLParser();
        }
    }

}
class XMLParser implements Parseable {
    public void parse(String fileName) {
        /* 구문 분석작업을 수행하는 코드를 적는다. */
        System.out.println(fileName + "- XML parsing completed.");
    }
}

class HTMLParser implements Parseable {
    public void parse(String fileName) {
        /* 구문 분석작업을 수행하는 코드를 적는다. */
        System.out.println(fileName + "-HTML parsing completed.");
    }
}

class ParserTest {
    public static void main(String args[]) {

        Parseable parser = ParserManager.getParser("XML"); // ParserManager을 통하여 xml 객체를 반환받는다.
        //인터페이스(조상) parser = HTML 객채 또는 XML객체
        // 다형성이용
        //자손에서는 함수를 오버라이딩하므로
        //인터페이스의 함수를 사용해ㄷ 자손의 함수가 불러와진다.
        parser.parse("document.xml");
        parser = ParserManager.getParser("HTML"); //ParserManager을 통하여 html 객체를 반환받는다.
        parser.parse("document2.html");
    }
}