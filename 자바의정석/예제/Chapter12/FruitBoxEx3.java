import java.util.ArrayList; //와일드카드의 example

//과일,사과, 포도객체 생성 // 사과,포도 -> 과일의자손
//제너릭을 사용한 박스, 과일박스객체생성 // 과일박스는 박스의자손, 과일박스안에 들어가는 객체는 과일의 자손형태

class Fruit3		        { public String toString() { return "Fruit";}}//과일객체생성
class Apple3 extends Fruit3 { public String toString() { return "Apple";}}//사과객체생성 //과일의자손
class Grape3 extends Fruit3 { public String toString() { return "Grape";}}//포도객체생성// 과일의자손


class Juice { //주스객체 생성
    String name;
    Juice(String name)	     { this.name = name + "Juice"; }
    public String toString() { return name;		 }
}
class Juicer {
    //Jucie형을 반환하는 makeJuice함수생성
    //이때 매개변수는 과일박스타입인데 이 과일박스 안에는 과일의 자손이 들어간다.
    static Juice makeJuice(FruitBox3<? extends Fruit3> box) {
        String tmp = "";

        for(Fruit3 f : box.getList())
            tmp += f + " ";
        return new Juice(tmp);
    }
}


class FruitBoxEx3 {
    public static void main(String[] args) {
        FruitBox3<Fruit3> fruitBox = new FruitBox3<Fruit3>(); //과일이 들어가는 과일박스생성
        FruitBox3<Apple3> appleBox = new FruitBox3<Apple3>(); // 사과가 들어가는 사과과일박스생성

        fruitBox.add(new Apple3());
        fruitBox.add(new Grape3());
        appleBox.add(new Apple3());
        appleBox.add(new Apple3());

        System.out.println(Juicer.makeJuice(fruitBox)); // Juicer의 makeJuice함수출력 //매개변수는 과읿박스
        System.out.println(Juicer.makeJuice(appleBox)); // Juicer의 makeJuice함수출력 // 매개변수는 사과박스
    }  // main
}

class FruitBox3<T extends Fruit3> extends Box3<T> {}

class Box3<T> {
    //class FruitBox<T extends Fruit> {
    ArrayList<T> list = new ArrayList<T>();
    void add(T item) { list.add(item);      }
    T get(int i)     { return list.get(i); }
    ArrayList<T> getList() { return list;  }
    int size()       { return list.size(); }
    public String toString() { return list.toString();}
}