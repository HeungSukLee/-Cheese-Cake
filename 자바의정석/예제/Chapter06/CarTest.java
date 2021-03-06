class Car {//차 클래스
    String color;        // 색상
    String gearType;    // 변속기 종류 - auto(자동), manual(수동)
    int door;            // 문의 개수

    Car() { //기본생성자.
    }
    Car(String c, String g, int d) {//매개변수가 있는 생성자.
        color = c;
        gearType = g;
        door = d;
    }
}
class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car(); //인스턴스생성
        c1.color = "white"; //직접 호출을 통한 인스턴스 변수의 초기화 방식
        c1.gearType = "auto";
        c1.door = 4;

        Car c2 = new Car("white", "auto", 4); //생성자를 이용한 인스턴스 변수 초기화 방식// 더 간편하다.
        System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType + ", door=" + c1.door);
        System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType + ", door=" + c2.door);

    }
}