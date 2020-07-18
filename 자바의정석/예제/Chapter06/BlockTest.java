class BlockTest {
    static { //static 블락은 처음에 실행할 떄 한번만 실행이 된다.//초기화블락
        System.out.println("static { }");
    }
    {//초기화블락
        System.out.println("{ }");
    }

    public BlockTest() { //생성자
        System.out.println("생성자");
    }

    public static void main(String args[]) {
        System.out.println("BlockTest bt = new BlockTest(); ");
        BlockTest bt = new BlockTest();

        System.out.println("BlockTest bt2 = new BlockTest(); ");
        BlockTest bt2 = new BlockTest();
    }
}