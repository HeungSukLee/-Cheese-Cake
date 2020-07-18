class CardTest{ //Card 사용의 example
    //카드클래스생성하고 그것을 사용 
    //static변수는 객체를 생성하지 않고도 바로 사용이 가능하다는 점을 유의
    public static void main(String args[]) {
        System.out.println("Card.width = "  + Card.width); 
        System.out.println("Card.height = " + Card.height);
        
        Card c1 = new Card(); //c1,c2객체생성
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
    String kind ;				
    int number;				   
    static int width = 100;		// 카드의 폭  - 클래스 변수 // width,height는 카드 모두 동일해야하므로 static 선언
    static int height = 250;	// 카드의 높이 - 클래스 변수
}