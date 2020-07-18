class DrawShape {
    public static void main(String[] args) {
        Point[] p = {   new Point(100, 100), // 점 객체 생성
                new Point(140,  50),
                new Point(200, 100)
        };
        Triangle t = new Triangle(p); // 삼각형 객체 생성 // 삼각형에는 객체 배열의 참조형으 넘겨준다.
        Circle   c = new Circle(new Point(150, 150), 50); // 원생성

        t.draw(); // 삼각형을 그린다.
        c.draw(); // 원을 그린다.
    }
}
class Shape {//색상을 출력하하는 class 생성
    String color = "black";
    void draw() {
        System.out.printf("[color=%s]%n", color);
    }
}
class Point { // 점객체생성
    int x; //점객체  ->x,y
    int y;
    Point(int x, int y) { //점객체의 생성자를 통한 인스턴스변수 초기화
        this.x = x;
        this.y = y;
    }
    Point() {
        this(0,0);
    }

    String getXY() {
        return "("+x+","+y+")"; // x와 y의 값을 문자열로 반환
    }
}

class Circle extends Shape { // 원객체생성
    Point center;	// 원은 원점 Point를 포함한다.
    int r;			// 반지름

    Circle() { //기본 생성자를 통한 원의 인스턴스 변수 초기화
        this(new Point(0, 0), 100); // Circle(Point center, int r)를 호출
    }
    Circle(Point center, int r) {
        this.center = center;
        this.r = r;
    }
    void draw() { // 원을 그리는 대신에 원의 정보를 출력하도록 했다.
        System.out.printf("[center=(%d, %d), r=%d, color=%s]%n", center.x, center.y, r, color);
    }
}
class Triangle extends Shape { //삼각형 객체
    //세점을 포함하므로 객체배열을 맴버 변수로 둔다.
    Point[] p = new Point[3];//삼각형객체의 인스턴스 변수로 // 원객체 배열이 들어가 있다.
    Triangle(Point[] p) {
        this.p = p;
    }
    void draw() {
        System.out.printf("[p1=%s, p2=%s, p3=%s, color=%s]%n", p[0].getXY(), p[1].getXY(), p[2].getXY(), color);
    }
}