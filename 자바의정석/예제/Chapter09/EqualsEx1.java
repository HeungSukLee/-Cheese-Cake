class EqualsEx1 { // 객체는 각 주소 값이 다르므로 false가 나온다. 
    // 그렇다면 value가 같으면 true가 반환되도록 하려면 어떻게?
    public static void main(String[] args) {
        Value v1 = new Value(10);
        Value v2 = new Value(10);
        if (v1.equals(v2)) {
            System.out.println("v1과 v2는 같습니다.");
        } else {
            System.out.println("v1과 v2는 다릅니다.");
        }

        v2 = v1;

        if (v1.equals(v2)) {
            System.out.println("v1과 v2는 같습니다.");
        } else {
            System.out.println("v1과 v2는 다릅니다.");
        }
    } // main
}

class Value {
    int value;

    Value(int value) {
        this.value = value;
    }
}