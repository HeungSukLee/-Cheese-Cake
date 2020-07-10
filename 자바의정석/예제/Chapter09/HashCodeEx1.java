class HashCodeEx1 {
    //해시코드
    //다량의 데이터르 관리하는데 용이

    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println(str1.equals(str2));
        System.out.println(str1.hashCode()); // String은 이미 오버라이딩 되어있으므로, 객체의 인스턴스변수? 가 같으면 해시코드가 같다.
        System.out.println(str2.hashCode());
        System.out.println(System.identityHashCode(str1)); //구별하려면 아이덴티티해시코드사용.
        System.out.println(System.identityHashCode(str2));
    }
}