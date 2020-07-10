class StaticBlockTest
{
    static int[] arr = new int[10];
    static {//클래스 블럭을 통하여 배열에 원소를 입력해 줄 수 있다.
        for(int i=0;i<arr.length;i++) {
            // 1과 10사이의 임의의 값을 배열 arr에 저장한다.
            arr[i] = (int)(Math.random()*10) + 1;
        }
    }

    public static void main(String args[]) {
        for(int i=0; i<arr.length;i++)
            System.out.println("arr["+i+"] :" + arr[i]); //static 블럭을 통하여 원소를 입력하였으므로, 바로 사용 가능.
    }
}