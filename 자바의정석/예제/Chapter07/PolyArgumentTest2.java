//다형성의 example2
class Product2 { // 제품객체를 생성한다.
    //컴퓨터와 티비등은 이 제품객체의 자손이다.
    // 컴퓨터와 티비등의 제품의 공통점을 가지고있는 객체
    int price;
    int bonusPoint;
    Product2(int price) { //생성자를통한 객체의 인스턴스 초기화
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }
    Product2() {
    } // 기본 생성자
}
class Tv4 extends Product2 { // 제품을 상속하는 티비 클래스 생성
    Tv4() {
        super(100);
    }
    public String toString() {
        return "Tv";
    }
}

class Computer2 extends Product2 {
    Computer2() {
        super(200);
    }

    public String toString() {
        return "Computer";
    }
}
class Audio extends Product2 {
    Audio() {
        super(50);
    }
    public String toString() {
        return "Audio";
    }
}
class Buyer2 {//고객객체생성
    //main 에서 고객 생성
    int money = 1000;    // 소유금액
    int bonusPoint = 0;    // 보너스점수

    Product2[] item = new Product2[10];    // 구입한 제품을 저장하기 위한 배열
    //고객이 물품을 여러개살경우 저장
    int i = 0;            // Product배열에 사용될 카운터

    void buy(Product2 p) {// main 함수에서 고객객체를 생성하고
        // Product2 p = new Computer()  다형성을 이용하여
        // 물건 구입을 표현할수있다.
        if (money < p.price) {
            System.out.println("잔액이 부족하여 물건을 살수 없습니다.");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        item[i++] = p; // 구매시 item에 p를 넣는부분을 추가한다.
        //main에서 b.buy()  , b.buy() ...
        //i가 하나씩 증가하면서 item 객체배열에 저장이된다.
        System.out.println(p + "을/를 구입하셨습니다."); // Product p = new Computer();
        //Computer에서 public String toString 함수를 오버라이딩 해두었다.
    }
    void summary() {            // 구매한 물품에 대한 정보를 요약해서 보여 준다.
        int sum = 0;            // 구입한 물품의 가격합계
        String itemList = "";    // 구입한 물품목록

        // 반복문을 이용해서 구입한 물품의 총 가격과 목록을 만든다.
        for (int i = 0; i < item.length; i++) {
            if (item[i] == null) break;
            sum += item[i].price; // item[i].price -> 가격
            itemList += item[i] + ", "; // item[i] ->이름름
        }
        System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
        System.out.println("구입하신 제품은 " + itemList + "입니다.");
    }
}

class PolyArgumentTest2 {
    public static void main(String args[]) {
        Buyer2 b = new Buyer2();

        b.buy(new Tv4());
        b.buy(new Computer2());
        b.buy(new Audio());
        b.summary();


    }
}