class ExceptionEx03 { // 0으로 나누면 exception이 발생하는데
    //이를 catch하는 example

    public static void main(String args[]) {
        int number = 100;
        int result = 0;

        for(int i=0; i < 10; i++) {
            try {
                result = number / (int)(Math.random() * 10);
                System.out.println(result);
            } catch (ArithmeticException e)	{
                System.out.println("에러잡았다!");
            }
        }
    }
}