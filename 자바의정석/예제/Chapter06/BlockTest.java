class BlockTest { //static 블럭은 처음에 한 번 만 실행이되고,
    //인스턴스블락 및 생성자블락은
    //BlockTest bt = new BlockTest()를 통해 객체가 생성될 떄마다.
    //초기화 되어서 실행이 된다.
    static {
        System.out.println("static { }");
    }

    {
        System.out.println("{ }");
    }

    public BlockTest() {
        System.out.println("생성자");
    }

    public static void main(String args[]) {
        System.out.println("BlockTest bt = new BlockTest(); ");
        BlockTest bt = new BlockTest();

        System.out.println("BlockTest bt2 = new BlockTest(); ");
        BlockTest bt2 = new BlockTest();
    }
}