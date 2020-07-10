//다형성 example
class BindingTest{
    public static void main(String[] args) {
        Parent3 p = new Child3(); // 조상객체 자손인스턴스
        Child3  c = new Child3(); // 자손객체 자손 인스턴스

        System.out.println("p.x = " + p.x); //100
        p.method();//"Child Method"

        System.out.println("c.x = " + c.x);//200
        c.method();//"Child Method"
    }
}

class Parent3 {
    int x = 100;

    void method() {
        System.out.println("Parent Method");
    }
}

class Child3 extends Parent3 {
    int x = 200;

    void method() {
        System.out.println("Child Method");
    }
}