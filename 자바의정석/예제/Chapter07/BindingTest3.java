class BindingTest3{
    public static void main(String[] args) {


        Parent5 p = new Child5();
        Child5  c = new Child5();

        System.out.println("p.x = " + p.x); //100
        p.method(); //200 100 200
        System.out.println();
        System.out.println("c.x = " + c.x);//200
        c.method();//200 100 200
    }
}

class Parent5 {
    int x = 100;
    void method() {
        System.out.println("Parent Method");
    }
}
class Child5 extends Parent5 {
    int x = 200;

    void method() {
        System.out.println("x=" + x);
        System.out.println("super.x=" + super.x);
        System.out.println("this.x="  + this.x);
    }
}