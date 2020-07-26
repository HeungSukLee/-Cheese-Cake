//7-3
//오버라이딩은 자손클래스에서 조상 클래스에 있는 함수를 재정의하는 것을 의미하고
//한 조상클래스를 상속하는 여러 다른 자손클래스가 있을텐데 각각 똑같은 함수기능이 아닌 다른 기능이
//필요한 경우 조상클래스의 함수를 재정의하여 사용한다.
//7-4 c d
//7-10
/*
class MyTv2 {
    static boolean isPowerOn;
    static int channel = 0;
    static int volume;
    static int prevchannel;
    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    public int getChannel() {
        return this.channel;
    }
    public void setChannel(int channel) {

        if (this.channel == 0) {
            this.channel = channel;
        } else {
            prevchannel = this.channel;
            this.channel = channel;
        }
    }
    public int getVolume() {
        return this.volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
    public void setisPowerOn(boolean on) {
        this.isPowerOn = on;
    }
    public boolean getisPowerOn() {
        return isPowerOn;
    }
    public void gotoPrevChannel() {
        int tmp;
        tmp = this.channel;
        this.channel = this.prevchannel;
        this.prevchannel = tmp;
    }
}
class PRACTICE {
    public static void main(String args[]) {
        MyTv2 t = new MyTv2();

        t.setChannel(10);
        System.out.println("CH:" + t.getChannel());

        t.setChannel(20);
        System.out.println("CH:" + t.getChannel());

        t.gotoPrevChannel();
        System.out.println("CH:" + t.getChannel());

        t.gotoPrevChannel();
        System.out.println("CH:" + t.getChannel());

    }
}
*/
//7-12 b
//7-13 Math클래스는 인스턴스 변수x
/* 7-14
class SutdaCard {
    final int NUM;
    final boolean IS_KWANG;

    SutdaCard() {
        this(1, true);
    }
    SutdaCard(int num, boolean isKwang) {
        this.NUM = num;
        this.IS_KWANG = isKwang;
    }
    public String toString() {
        return NUM + (IS_KWANG ? "K" : "");
    }
}
class PRACTICE {
    public static void main(String args[]) {
        SutdaCard card = new SutdaCard(1, true);
    }
}
*/
//7-15
//7-19
/*
class pra {
    public static void main(String args[]) {
        Buyer b = new Buyer();
        b.buy(new Tv());
        b.buy(new Computer());
        b.buy(new Tv());
        b.buy(new Audio());
        b.buy(new Computer());
        b.buy(new Computer());
        b.buy(new Computer());
        b.summary();
    }
}

class Buyer {
    int money = 1000;
    Product[] cart = new Product[3];
    int i = 0;

    void buy(Product p) {
        if (money < p.price) {
            return;
        } else {
            money -= -p.price;
            add(p);
        }
    }

    void add(Product p) {
        if (i >= cart.length) {
            Product[] newcart = new Product[cart.length * 2];
            System.arraycopy(cart, 0, newcart, 0, cart.length);
            cart = newcart;
        }
        cart[i++] = p;
    }

    void summary() {
        int sum = 0;
        String list = " ";
        for (int i = 0; i < cart.length; i++) {
            if (cart[i] == null) break;
            list += cart[i] + ",";
            sum += cart[i].price;
        }
        System.out.println(list);
        System.out.println(sum);
        System.out.println(money);
    }
}

class Product {
    int price;
    Product(int price) {
        this.price = price;
    }
}

class Tv extends Product {
    Tv() {
        super(100);
    }

    public String toString() {
        return "Tv";
    }
}

class Computer extends Product {
    Computer() {
        super(200);
    }

    public String toString() {
        return "Computer";
    }
}

class Audio extends Product {
    Audio() {
        super(50);
    }

    public String toString() {
        return "Audio";
    }
}
*/
//7-22
abstract class Shape {
    Point p;

    Shape() {
        this(new Point(0, 0));
    }

    Shape(Point p) {
        this.p = p;
    }

    Point getPosition() {
        return p;
    }

    void setPosition(Point p) {
        this.p = p;
    }

    abstract double calcArea();
}

class Point {
    int x;
    int y;
    Point() {
        this(0, 0);
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public String toString() {
        return "[" + x + "," + y + "]";
    }
}

class Circle extends Shape {
    double r = 1;
    double calcArea() {
        return 1 / 2 * r * r * 3.14;
    }
    Circle(double r) {
        this.r = 1;
    }
}

class Rectangle extends Shape {
    double width = 1;
    double height = 1;

    double calcArea() {
        return width * height;
    }
    Rectangle(int width, int height) {
        this.width = width;
        this.width = height;
    }
    boolean isSquare() {
        if (this.width == this.height) return true;
        else return false;
    }
}
class pra {
    static double sumArea(Shape[] arr) {
        double sum=0.0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i].calcArea();
        }
        return sum;
    }

    public static void main(String[] args) {
        Shape[] arr = {new Circle(5.0), new Rectangle(3, 4), new Circle(1)};
        System.out.println(" :" + sumArea(arr));
    }
}


//7-24 E
//7-25
/*
class Outer {
    class Inner {
        int iv = 100;
    }
}
class PRACTICE {
    static void main(String[] args) {
        Outer ou = new Outer();
        Outer.Inner in = new Outer.Inner();

        System.out.println(ou.Inner.);
    }
}
*/
//7-26
/*
class Outer {
    static class Inner {
        int iv = 200;
    }
}
class PRACTICE {
    static void main(String[] args) {
      System.out.println(Outer.Inner.iv);
    }
}
 */







