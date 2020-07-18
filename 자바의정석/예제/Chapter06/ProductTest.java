class Product {
    static int count = 0;
    int serialNo;
    { //초기화블럭을통한 인스턴스 초기화진행
        ++count;
        serialNo = count;
    }
    public Product() {} //기본생성자
}
class ProductTest {
    public static void main(String args[]) {
        Product p1 = new Product(); //제품클래서 p1,p2,p3생성
        Product p2 = new Product();
        Product p3 = new Product();

        System.out.println("p1의 제품번호(serial no)는 " + p1.serialNo);
        System.out.println("p2의 제품번호(serial no)는 " + p2.serialNo);
        System.out.println("p3의 제품번호(serial no)는 " + p3.serialNo);
        System.out.println("생산된 제품의 수는 모두 "+Product.count+"개 입니다."); // count는 static변수이므로
        //자동으로 +1씩 늘어난다.
    }
}