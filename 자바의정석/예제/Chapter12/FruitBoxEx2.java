import java.util.ArrayList;

class Fruit2 implements Eatable { //Eatable 인터페이스를 구현하는 과일생성
    public String toString() { return "Fruit";}
}
class Apple2 extends Fruit2 { public String toString() { return "Apple";}} //과일의 자손인 사과 생성
class Grape2 extends Fruit2 { public String toString() { return "Grape";}} //과일의 자손인 포도생성
class Toy2		           { public String toString() { return "Toy"  ;}} //장난감생성

////////////////////////////////과일, 사과,포도, 장난감박스 생성
////////////////////////////////사과 포도는 과일의 자손이다.
interface Eatable {}

class FruitBoxEx2 {
    public static void main(String[] args) {
        FruitBox2<Fruit2> fruitBox = new FruitBox2<Fruit2>(); //과일을 담는 과일박스 생성
        FruitBox2<Apple2> appleBox = new FruitBox2<Apple2>(); //사과를 담는 사과과일박스생성
        FruitBox2<Grape2> grapeBox = new FruitBox2<Grape2>(); // 포도를 담는 포도과일박스생성
//		FruitBox2<Grape> grapeBox = new FruitBox2<Apple>(); // 에러. 타입 불일치
//		FruitBox2<Toy>   toyBox    = new FruitBox2<Toy>();   // 에러.

        fruitBox.add(new Fruit2());
        fruitBox.add(new Apple2());
        fruitBox.add(new Grape2()); //과일박스에 과일,사과,포도를 넣는다.
        appleBox.add(new Apple2()); //사과박스에 사과를 넣는다.
//		appleBox.add(new Grape2());  // 에러. Grape는 Apple의 자손이 아님
        grapeBox.add(new Grape2()); //포도박스에 포도를 넣는다.

        System.out.println("fruitBox-"+fruitBox);
        System.out.println("appleBox-"+appleBox);
        System.out.println("grapeBox-"+grapeBox);
    }  // main
}


class FruitBox2<T extends Fruit2 & Eatable> extends Box2<T> {} // 과일박스
//과일박스는 박스의 자손이므로 박스의 기능을 지닌다.
//과일박스에 들어가는 형태는 과일과 Eatable인 것만 들어간다!!!//제한된 형태의 제너릭스

class Box2<T> {//박스
    ArrayList<T> list = new ArrayList<T>(); //박스는 ArrayList 기능을 지니다.
    void add(T item)  { list.add(item);      }  //박스는 리스트에 T타입의 물건을 넣는 기능을 지닌다.
    T get(int i)      { return list.get(i); }   //리스트에서 물건을 반환하는 기능을 지닌다.
    int size()        { return list.size();  } //리스트의 사이즈를 재는 기능을 지닌다.
    public String toString() { return list.toString();} // 리스트를 출력하는 기능을 지닌다.
}