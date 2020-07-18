class MemberCall { // 인스턴스 변수, 인스텀수함수  vs  클래스 변수, 클래스함수의 차이
//인스턴스 변수 함수는 클래스 변수 함수 사용가능
    //but 반대는 불가함을 유의

    int iv = 10;
    static int cv = 20;

    int iv2 = cv;
    //	static int cv2 = iv;
    static int cv2 = new MemberCall().iv;
    static void staticMethod1() {
        System.out.println(cv);
//		System.out.println(iv);
        MemberCall c = new MemberCall();
        System.out.println(c.iv);
    }

    void instanceMethod1() {
        System.out.println(cv);
        System.out.println(iv);
    }

    static void staticMethod2() {
        staticMethod1();
//		instanceMethod1();
        MemberCall c = new MemberCall();
        c.instanceMethod1();
    }

    void instanceMethod2() {
        staticMethod1();
        instanceMethod1();
    }
}