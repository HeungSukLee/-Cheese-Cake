//인터페이스를 사용하는 Example

class A2 {
    void autoPlay(I i) { //A객체의 함수는 인터페이스를 매개변수로 가져와서, 인터페이스의 함수를 사용한다.
        i.play();
    }
}

interface I {
    public abstract void play(); //public abstract
}

class B2 implements I { //인터페이스를 구현하는 객체 B2 // play함수를 오버라이딩해야한다 .
    public void play() {
        System.out.println("play in B class");
    }
}

class C2 implements I {//인터페이스를 구현하는 객체 C2 // play함수를 오버라이딩

    public void play() {
        System.out.println("play in C class");
    }
}

class InterfaceTest2 {
    public static void main(String[] args) {
        A2 a = new A2(); //A2객체생성
        a.autoPlay(new B2()); //객체 A2의 함수를 가져오면서 매개변수로 B객체를 생성한다.// 가능이유 ->B는 인터페이스를 구현하므로! 다형성
        a.autoPlay(new C2());
    }
}