class CastingTest1 {
    public static void main(String args[]) {

        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;
        //조상<>자손 형변환은 가능하다.
        // 자손 - >  조상 형변환은 생략가능.
        // 조상 - >  자손 형변환은 생략불가.

        fe.water();
        car = fe;    // car =(Car)fe 이므로 자손이 조상으로 형변환 생략가능
//		car.water();
        fe2 = (FireEngine)car; //조상이 자손으로 형변환은 생략이 불가능하다.
        fe2.water();
    }
}

class Car {
    String color;
    int door;
    void drive() { 		// 운전하는 기능
        System.out.println("drive, Brrrr~");
    }
    void stop() {		// 멈추는 기능
        System.out.println("stop!!!");
    }
}

class FireEngine extends Car {	// 소방차
    void water() {		// 물을 뿌리는 기능
        System.out.println("water!!!");
    }
}