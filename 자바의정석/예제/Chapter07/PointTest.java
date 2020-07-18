class PointTest {
    public static void main(String args[]) {
        Point3D p3 = new Point3D(1,2,3);
    }
}

class Point2 { // 점객체생성
    int x;
    int y;

    Point2(int x, int y) { // 생성자를 통한 인스턴스변수 초기화
        this.x = x;
        this.y = y;
    }
    String getLocation() { // 객체의 인스턴스 변수 x,y를 외부에 출력하는 함수.
        return "x :" + x + ", y :"+ y;
    }
}

class Point3D extends Point2 { // 점 객체를 상속받는 객체 3차원 점 객체 생성
    int z;

    Point3D(int x, int y, int z) {
        super(x,y);
        //첫줄에는 조상의 생성자가 호출이 되는데 조상에서는 Point()가 없으므로 super(x,y)라고 나타낸다.
        this.x = x;
        this.y = y;
        this.z = z;
    }

    String getLocation() {	// 자기 사진의 인스턴스 변수 x,y,z를 출력하는 함수
        return "x :" + x + ", y :"+ y + ", z :" + z;
    }
}