import java.util.ArrayList;
class Fruit {
    public String toString() {
        return "Fruit";
    }
} //과일객체

class Apple extends Fruit {
    public String toString() {
        return "Apple";
    }
} //Apple객체

class Grape extends Fruit {
    public String toString() {
        return "Grape";
    }
} //포도객체

class Toy {
    public String toString() {
        return "Toy";
    }
} //장난감객체
///////////////////////////////////////박스에 담을 과일,  사과 포도 장난감 객체 생성

class FruitBoxEx1 {
    public static void main(String[] args) {


        Box<Fruit> fruitBox = new Box<Fruit>(); // 과일타입의 데이터로 구성된 과일박스생성 // Box<Fruit> -> 박스에는 과일만 들어간다.
        Box<Apple> appleBox = new Box<Apple>(); // 사과타입의 데이터록 구성된 사과박스생성 // Box<Apple> -> 박스에는 사과만 들어간다.
        Box<Toy> toyBox = new Box<Toy>();//장난감박스생성 // Box<Toy> -> 박스에는 장난감만 들어간다.
//		Box<Grape> grapeBox = new Box<Apple>(); // 에러. 타입 불일치//타입이 같지 않으면 에러가 난다.

        fruitBox.add(new Fruit()); // Fruit item = new Fruit() // 박스의기능 -> 과일을 넣어주면 arraylist에 과일이담긴다.
        fruitBox.add(new Apple()); // Fruit item = new Apple() // 사과를 넣어주면 arraylist에 사과가 담긴다.
        //과일만 들어간느 과일박스를 생성해서 사과를 넣었다. 가능.
        //다형성.

        appleBox.add(new Apple());//사과만 들어가는 사과박스를 만들어서 사과를 넣었다.
        appleBox.add(new Apple());
//		appleBox.add(new Toy()); // 에러. Box<Apple>에는 Apple만 담을 수 있음

        toyBox.add(new Toy());
//		toyBox.add(new Apple()); // 에러. Box<Toy>에는 Apple을 담을 수 없음

        System.out.println(fruitBox); // toString함수가 호출된다.
        System.out.println(appleBox);
        System.out.println(toyBox);
    }  // main의 끝
}

class Box<T> { //Box클래스 제너릭사용  // 제너릭을 사용한 박스 생성.


    ArrayList<T> list = new ArrayList<T>(); // T타입을 담는 ArrayList객체 생성

    void add(T item) {  //매개변수가 T타입// T타입이 들어오면 그 item을 list에 담는 함수
        list.add(item);
    }

    T get(int i) { //함수가 T타입// i를 입력하면 list에서 i번째 요소를 반환하는 T타ㅣㅂ 함수
        return list.get(i);
    }

    int size() { //list의 size를 반환하는 함수.
        return list.size();
    }

    public String toString() {// list의 요소를 스트링으로 출력하는 toString 함수.
        return list.toString();
    }

}