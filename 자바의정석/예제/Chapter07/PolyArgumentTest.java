//다형성의 example
//제품클래스생성(조상)  ->  TV, COMPUTER 클래스 생성(자손)
//Buyer클래스생성
//Buyer클래스의 함수에서 제품객체를 통하여 물건 구입 등 실행.
// Main함수에서는 직접 객체를 생성시키고 값을 넣어서 실제 확인하는 느낌!
class Product { // 제품객체 생성
    int price;            // 제품의 가격
    int bonusPoint;        // 제품구매 시 제공하는 보너스점수

    Product(int price) { // 생성자를 통한 제품객체의 인스턴스 변수 초기화
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }
}

class Tv3 extends Product { //TV3 객체생성 // 제품객체 상송

    Tv3() {// tv는 제품을 상속하므로 제품객체의 인스턴스 변수를 가져온다. 이 값을 생성자를 통하여 초기화 한다.
        // 조상클래스의 생성자 Product(int price)를 호출한다.
        super(100);
    }

    public String toString() {    // Object클래스의 toString()을 오버라이딩한다. // 외부에서 출력했을때 Tv가 출력이된다.
        return "Tv";
    }
}

class Computer extends Product { // COMPUTER객체생성
    Computer() { // super을 통한 컴퓨터의 인스턴스 변수 초기화
        super(200);
    }

    public String toString() { //외부에서 출력을 했을 떄 computer 출력
        return "Computer";
    }
}

class Buyer {            //고객 객체 생성
    int money = 1000;    // 소유금액
    int bonusPoint = 0;    // 보너스점수

    void buy(Product p) { // 매개변수로 물품객체를 받는 buy함수 생성

        if (money < p.price) {
            System.out.println("잔액이 부족하여 물건을 살수 없습니다.");
            return;
        }
        money -= p.price;            // 가진 돈에서 구입한 제품의 가격을 뺀다.
        bonusPoint += p.bonusPoint;    // 제품의 보너스 점수를 추가한다.
        System.out.println(p + "을/를 구입하셨습니다.");
    }
}

class PolyArgumentTest {
    public static void main(String args[]) {
        Buyer b = new Buyer();

        b.buy(new Tv3());
        b.buy(new Computer());

        System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
        System.out.println("현재 보너스점수는 " + b.bonusPoint + "점입니다.");
    }
}