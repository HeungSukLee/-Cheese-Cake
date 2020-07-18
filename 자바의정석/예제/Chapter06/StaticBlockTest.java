class StaticBlockTest  // static 블럭을 사용하는 example
{
    static int[] arr = new int[10];
    static { // static 블락을 통한 변수 초기화
        for(int i=0;i<arr.length;i++) {
            arr[i] = (int)(Math.random()*10) + 1;
        }
    }

    public static void main(String args[]) {
        for(int i=0; i<arr.length;i++)
            System.out.println("arr["+i+"] :" + arr[i]); //static 블럭을 통하여 원소를 입력하였으므로, 바로 사용 가능.
    }
}