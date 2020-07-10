
class Data3 { int x; }

class ReferenceReturnEx {
    public static void main(String[] args)
    {
        Data3 d = new Data3();
        d.x = 10; //Data3객체 생성. //

        Data3 d2 = copy(d);
        //d의 요소가 copy함수를 통해 복사되고,
        // 참조형을 반환받아서 이 참조형 값이 d2에 들어간다.
        System.out.println("d.x ="+d.x);
        System.out.println("d2.x="+d2.x);
    }
    static Data3 copy(Data3 d) { //객체타입 Data3 를 매개변수로 받고, Data3를 반환하는 copy 함수!
        Data3 tmp = new Data3();
        tmp.x = d.x;

        return tmp;
    }
}