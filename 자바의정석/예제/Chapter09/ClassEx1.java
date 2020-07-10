//Class 객체를 이용하면
//클래스에 정의된 맴버의 이름이나 개수 등
//클래스에 대한 모든 정보를 얻을 수 있다.
final class Card3 {
    String kind;
    int num;

    Card3() {
        this("SPADE", 1);
    }
    Card3(String kind, int num) {
        this.kind = kind;
        this.num  = num;
    }
    public String toString() {
        return kind + ":" + num;
    }
}

class ClassEx1 {
    public static void main(String[] args) throws Exception {
        Card3 c  = new Card3("HEART", 3);       // new연산자로 객체 생성
        Card3 c2 = Card3.class.newInstance();   // Class객체를 통해서 객체 생성
        Class cObj = c.getClass(); // getClass를 통해서 Class 객체 생성

        System.out.println(c);
        System.out.println(c2);
        System.out.println(cObj.getName()); //클래스에 대한 정보를 가져 올 수 잇따.
        System.out.println(cObj.toGenericString());
        System.out.println(cObj.toString());
    }
}