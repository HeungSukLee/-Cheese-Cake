class InstanceofTest { //형변환을 활용하는 example
    public static void main(String args[]) {
        FireEngine2 fe = new FireEngine2();

        if(fe instanceof FireEngine2) {
            System.out.println("This is a FireEngine2 instance.");
        }

        if(fe instanceof Car2) {//자손은 조상으로 형변환이 가능하다.
            System.out.println("This is a Car2 instance.");
        }

        if(fe instanceof Object) { //자손은 조상으로 형변환이 가능하다.
            System.out.println("This is an Object instance.");
        }

        System.out.println(fe.getClass().getName());
    }
} // class
class Car2 {}
class FireEngine2 extends Car2 {}