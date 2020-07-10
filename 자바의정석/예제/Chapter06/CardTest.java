class CardTest{ //Card 사용의 example
    public static void main(String args[]) {
        System.out.println("Card.width = "  + Card.width); //width와 height는 static변수이므로 객체를 생성하지 않고도 바로 사용 가능.
        System.out.println("Card.height = " + Card.height);

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;

        System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")" );
        System.out.println("c2는 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")" );

        System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다.");
        c1.width = 50;
        c1.height = 80;

        System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")" );
        System.out.println("c2는 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")" );
    }
}

class Card {
    String kind ;				// 카드의 무늬 - 인스턴스 변수
    int number;				    // 카드의 숫자 - 인스턴스 변수
    static int width = 100;		// 카드의 폭  - 클래스 변수
    static int height = 250;	// 카드의 높이 - 클래스 변수
}