//인터페이스 Example
class A {  //A객체에서 B객체를 생성하고 사용한다.
    public void methodA(B b) { //클래스 A의 매서드는 B객체를 매개변수로한다.
        b.methodB();
    }
}

class B {
    public void methodB() {
        System.out.println("methodB()");
    }
}

class InterfaceTest {
    public static void main(String args[]) {
        A a = new A(); //A객체생성
        a.methodA(new B()); //A객체의 함수의 매개변수로 B객체를 생성한다.
    }
}