class FighterTest {
    public static void main(String[] args) {
        Fighter f = new Fighter(); // 기본유닛객체를 상속하고, Fightable 인터페이스를 구현하는 Fighter f 생성.
        //자손은 조상으로 형변환이 가능하므로 아래 if문은 모두 출력이 된다.
        if (f instanceof Unit)	{
            System.out.println("f는 Unit클래스의 자손입니다.");
        }
        if (f instanceof Fightable) {
            System.out.println("f는 Fightable인터페이스를 구현했습니다.");
        }
        if (f instanceof Movable) {
            System.out.println("f는 Movable인터페이스를 구현했습니다.");
        }
        if (f instanceof Attackable) {
            System.out.println("f는 Attackable인터페이스를 구현했습니다.");
        }
        if (f instanceof Object) {
            System.out.println("f는 Object클래스의 자손입니다.");
        }
    }
}

class Fighter extends Unit implements Fightable {
    // 파이터는 기본유닛객체를 상속하고, Fightable 인터페이스를 구현한다.
    public void move(int x, int y) { /* 내용 생략 */ }
    public void attack(Unit u) { /* 내용 생략 */ }
}

class Unit { //기본유닛 객체
    int currentHP;	// 유닛의 체력
    int x;			// 유닛의 위치(x좌표)
    int y;			// 유닛의 위치(y좌표)
}

interface Fightable extends Movable, Attackable { } //움직이고 공격하는 인터페이스를 상속하는 Fightable 인터페이스 생성.
interface Movable    {	void move(int x, int y);	}
interface Attackable {	void attack(Unit u); 		}
