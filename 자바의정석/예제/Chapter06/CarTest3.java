class Car3 {
    String color;		// 색상
    String gearType;    // 변속기 종류 - auto(자동), manual(수동)
    int door;			// 문의 개수

    Car3() { //기본생성자.
        this("white", "auto", 4);
    }

    Car3(Car3 c) {	// 인스턴스의 복사를 위한 생성자. //생성자를 배개변수로 가지는 생성자.
        color    = c.color;
        gearType = c.gearType;
        door     = c.door;
    }

    Car3(String color, String gearType, int door) { //배개변수가 3개인 생성자.
        this.color    = color;
        this.gearType = gearType;
        this.door     = door;
    }
}
class CarTest3 {
    public static void main(String[] args) {

        Car3 c1 = new Car3(); // c1 객체 생성
        Car3 c2 = new Car3(c1);	// c1을 매개변수로 가지는 객체 c2생성 // c1의 인스턴스변수가 c2에 복사가 된다.
        System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType+ ", door="+c1.door);
        System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType+ ", door="+c2.door);

        c1.door=100;	// c1의 인스턴스변수 door의 값을 변경한다.
        System.out.println("c1.door=100; 수행 후");
        System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType+ ", door="+c1.door);
        System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType+ ", door="+c2.door);
    }
}