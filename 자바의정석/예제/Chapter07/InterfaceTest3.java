//인터페이스 Example
class InterfaceTest3 {
    public static void main(String[] args) {
        A3 a = new A3();
        a.methodA();
    }
}

class A3 {
    void methodA() {
        I3 i = InstanceManager.getInstance();// A의 매서드에서는 인스턴스매니저 객체의 함수를 통하여
        //B객체의 인스턴스를 가져온다.
        //I3 i = new B3();
        i.methodB(); //methodB가 B3객체에 오버라이딩 되어있다.
        System.out.println(i.toString()); // i로 Object클래스의 메서드 호출가능
    }
}

interface I3 {
    public abstract void methodB();
}

class B3 implements I3 {
    public void methodB() {
        System.out.println("methodB in B3 class");
    }

    public String toString() { return "class B3";}
}

class InstanceManager { //인스턴스매니적 객체를 통하여  B 객체 인스턴스를 반환한다.
    public static I3 getInstance() { //반환값이 자손값이면 return의 형으로 조상 사용 가능?
        return new B3();
    }
}