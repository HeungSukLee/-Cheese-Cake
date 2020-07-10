class DeckTest {
    public static void main(String args[]) {
        Deck d = new Deck();	// 카드 한 벌(Deck)을 만든다.
        Card c = d.pick(0);	   	// 섞기 전에 제일 위의 카드를 뽑는다.
        System.out.println(c); 	// System.out.println(c.toString());과 같다.

        d.shuffle();			// 카드를 섞는다.
        c = d.pick(0);		   	// 섞은 후에 제일 위의 카드를 뽑는다.
        System.out.println(c);
    }
}

// Deck클래스 //Deck은 카드를 포함한다.
class Deck {

    final int CARD_NUM = 52;	// 카드의 개수
    Card cardArr[] = new Card[CARD_NUM];  // Card객체 배열을 포함

    Deck () {	//초기화
        int i=0;

        for(int k=Card.KIND_MAX; k > 0; k--) // Deck에 있는 52장의 카드를 초기화 하는 방법.
            for(int n=0; n < Card.NUM_MAX ; n++)
                cardArr[i++] = new Card(k, n+1);
    }

    Card pick(int index) {	// Card 객체를 반환하는 객체형 함수
        return cardArr[index];
    }

    Card pick() {			// Deck에서 카드 하나를 선택한다.
        int index = (int)(Math.random() * CARD_NUM);
        return pick(index);
    }

    void shuffle() { // 카드의 순서를 섞는다.
        for(int i=0; i < cardArr.length; i++) {
            int r = (int)(Math.random() * CARD_NUM);

            Card temp = cardArr[i];
            cardArr[i] = cardArr[r];
            cardArr[r] = temp;
        }
    }
} // Deck클래스의 끝

// Card 객체 생성.
class Card {
    //static final int 를 통하여 카드에 대한 기본 정보 입력.
    static final int KIND_MAX = 4;	// 카드 무늬의 수
    static final int NUM_MAX  = 13;	// 무늬별 카드 수
    static final int SPADE   = 4;
    static final int DIAMOND = 3;
    static final int HEART   = 2;
    static final int CLOVER  = 1;
    int kind;
    int number;

    Card() {
        this(SPADE, 1);
    }
    Card(int kind, int number) {
        this.kind = kind;
        this.number = number;
    }
    public String toString() {
        //종류와 카드번호 출력
        String[] kinds = {"", "CLOVER", "HEART", "DIAMOND", "SPADE"};
        String numbers = "0123456789XJQK"; // 숫자 10은 X로 표현

        return "kind : " + kinds[this.kind]
                + ", number : " + numbers.charAt(this.number);
    }
}