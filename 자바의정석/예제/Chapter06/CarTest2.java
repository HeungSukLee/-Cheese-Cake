class Car2 {
    String color;		// 색상
    String gearType;	// 변속기 종류 - auto(자동), manual(수동)
    int door;			// 문의 개수

    Car2() {//기본생성자.
        this("white", "auto", 4);
    }
    Car2(String color) {//배개변수가 하나인 생성자. // color 값은 받고,나머지는 직접 선언?
        this(color, "auto", 4);
    }
    Car2(String color, String gearType, int door) {//매개변수가 여러개인 생성자.
        this.color    = color;
        this.gearType = gearType;
        this.door     = door;
    }
}

class CarTest2 {
    public static void main(String[] args) {
        Car2 c1 = new Car2(); // 기본생성자가 호출되면서// white,auto,4로 인스턴스 변수가 초기화된다.
        Car2 c2 = new Car2("blue"); //매개변수가 하나인 생성자가 호출되면서// color가 blue로 바뀐다.

        System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType+ ", door="+c1.door);
        System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType+ ", door="+c2.door);

    }
}