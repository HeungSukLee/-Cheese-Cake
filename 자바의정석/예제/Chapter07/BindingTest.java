class BindingTest{
    public static void main(String[] args) {
        Parent3 p = new Child3();
        Child3  c = new Child3();

        System.out.println("p.x = " + p.x);//100
        p.method();//child method

        System.out.println("c.x = " + c.x);//200
        c.method();//child method
    }
}

class Parent3 { //부모 clsss 생성
    int x = 100;
    void method() {
        System.out.println("Parent Method");
    }
}

class Child3 extends Parent3 {// 자손 class 생성
    int x = 200;
    void method() {
        System.out.println("Child Method");
    }
}
