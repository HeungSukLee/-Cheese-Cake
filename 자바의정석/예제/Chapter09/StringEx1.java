class StringEx1 {
    public static void main(String[] args) {
        String str1 = "abc"; // str1과 str2가 하나의 같은 주소를 가르킨다.
        String str2 = "abc";

        System.out.println("String str1 = \"abc\";");
        System.out.println("String str2 = \"abc\";");

        System.out.println("str1 == str2 ?  " + (str1 == str2)); //t
        System.out.println("str1.equals(str2) ? " + str1.equals(str2));//t
        System.out.println();

        String str3 = new String("\"abc\""); // 다른 주소의 객체 생성
        String str4 = new String("\"abc\"");

        System.out.println("String str3 = new String(\"abc\");");
        System.out.println("String str4 = new String(\"abc\");");

        System.out.println("str3 == str4 ? " + (str3 == str4)); //f
        System.out.println("str3.equals(str4) ? " + str3.equals(str4));//t
    }
}