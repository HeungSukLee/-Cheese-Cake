class Product {//제품클래스생성.
    static int count = 0;   // 생성된 인스턴스의 수를 저장하기 위한 변수
    int serialNo;	        // 인스턴스 고유의 번호

    { //초기화블럭을 통한 인스턴스의 초기화.
        ++count;
        serialNo = count;
    }
    public Product() {}     // 기본생성자, 생략가능

}
class ProductTest {
    public static void main(String args[]) {
        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();

        System.out.println("p1의 제품번호(serial no)는 " + p1.serialNo);//serialNo가 매번 초기화 되어도 count는 static 변수이므로 1->2->3;
        System.out.println("p2의 제품번호(serial no)는 " + p2.serialNo);
        System.out.println("p3의 제품번호(serial no)는 " + p3.serialNo);
        System.out.println("생산된 제품의 수는 모두 "+Product.count+"개 입니다."); //count는 staic 변수이므로 이와같이 사용이 가능하다.
    }
}