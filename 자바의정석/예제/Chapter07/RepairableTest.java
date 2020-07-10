import javax.activation.MailcapCommandMap;

class RepairableTest {
    public static void main(String[] args) {
        Tank tank = new Tank();
        Dropship dropship = new Dropship();

        Marine marine = new Marine();
        SCV scv = new SCV();

        scv.repair(tank);    // SCV가 Tank를 수리하도록 한다.
        scv.repair(dropship);
//		scv.repair(marine);
    }
}

// 유닛을 상속하는 땅유닛, 공중유닛생성
// 공중유닛을상속하는 드랍쉽, 땅유닛을 상속하는 마린 scv, 탱크
// 리패러블을 구현하는 드랍십, scv, 탱크
interface Repairable {
}

class GroundUnit extends Unit2 { // Unit에 인스턴스 변수를 선언, super을 통한 인스턴스변수 초기화
    GroundUnit(int hp) {
        super(hp);
    }
}

class AirUnit extends Unit2 {
    AirUnit(int hp) {
        super(hp);
    }
}

class Unit2 {
    int hitPoint;
    final int MAX_HP;

    Unit2(int hp) {
        MAX_HP = hp;
    }
    //...
}

class Tank extends GroundUnit implements Repairable { //유닛의 자손인 땅유닛의 자손인 탱크 // Repaiarable인터페이스 구현
    Tank() {
        super(150);        // Tank의 HP는 150이다. //
        hitPoint = MAX_HP;
    }

    public String toString() {
        return "Tank";
    }
    //...
}

class Dropship extends AirUnit implements Repairable {
    Dropship() {
        super(125);        // Dropship의 HP는 125이다.
        hitPoint = MAX_HP;
    }

    public String toString() {
        return "Dropship";
    }
    //...
}

class Marine extends GroundUnit {
    Marine() {
        super(40);
        hitPoint = MAX_HP;
    }
    //...
}

class SCV extends GroundUnit implements Repairable {
    SCV() {
        super(60);
        hitPoint = MAX_HP;
    }

    void repair(Repairable r) { // 인터페이스를 매개변수로 받는 Repair함수 생성
        //Repairale r = new Tank()
        //Repairable r = new SCV;  ...

        if (r instanceof Unit2) { // TRUE라는 것은 r이 UNIT2의 조상 OR 자손이라는 뜻!
            Unit2 u = (Unit2) r;
            while (u.hitPoint != u.MAX_HP) {
                /* Unit의 HP를 증가시킨다. */
                u.hitPoint++;
            }
            System.out.println(u.toString() + "의 수리가 끝났습니다.");
        }
    }
    //...
}