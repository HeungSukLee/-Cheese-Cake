//toString 사용 example
class Card {
    String kind;
    int number;

    Card() {
        this("SpadeHeart", 1);
    }

    Card(String kind, int number) {
        this.kind = kind;
        this.number = number;
    }
}

class CardToString {
    public static void main(String[] args) {
        Card c1 = new Card(); //카드객체 생성
        Card c2 = new Card();

        System.out.println(c1.toString()); //card+ hashcode가 출력이된다.
        System.out.println(c2.toString());
    }
}