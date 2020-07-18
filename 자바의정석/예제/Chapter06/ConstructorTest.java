class Data1 { //기본생성자가 없는것 처럼 보이지만 자동으로 기본생성자가 생긴다.
        int value;
        }

class Data2 {
    int value;

    Data2(int x) { 	// 매개변수가 있는 생성자.
        value = x;
    }
}

class ConstructorTest {
    public static void main(String[] args) {
        Data1 d1 = new Data1();
       //Data2 d2 = new Data2();// 기본생성자가 없으므로 에러
        // Data2(int x) 가 호출된다.
    }
}
